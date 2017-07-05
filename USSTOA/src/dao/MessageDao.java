package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Message;
import model.User;

public class MessageDao extends BaseDao{

	public List<Message> getAllMessage(int userID) {
		String sql = "SELECT * FROM message WHERE receiveUser=? AND messageState=1 ORDER BY sendTime DESC";
		List<Message> messages = new ArrayList<Message>();
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, userID);
			ResultSet rst = pstmt.executeQuery();
			while (rst.next()) {
				int messageID = rst.getInt("messageID");
				String messageText = rst.getString("messgeText");
				int sendUser=rst.getInt("sendUser");
				Date sendTime=rst.getDate("sendTime");
				Message message = new Message();
				message.setMessageID(messageID);
				message.setMessageText(messageText);
				User user=new User();
				user.setUserID(sendUser);
				message.setSenduser(user);
				message.setSendTime(sendTime);
				messages.add(message);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return messages;
	}

	public int addMessage(Message message) {
		String sql = "INSERT INTO message(messageText,sendUser,receiveUser,sendTime,messageState) VALUES(?,?,?,?,?,1)";
		int ec = 0;
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, message.getMessageText());
			pstmt.setInt(2, message.getSenduser().getUserID());
			pstmt.setInt(3, message.getReceiveuser().getUserID());
			pstmt.setDate(4, (java.sql.Date) message.getSendTime());
			ec = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ec;
	}

	public int deleteMessage(int messageID) {
		String sql = "UPDATE files SET messageState=2  WHERE messageID=?";
		int ec = 0;
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,messageID);
			ec = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ec;
	}

	public int fileThoroughDelete(int messageID) {
		String sql = "UPDATE files SET messageState=0  WHERE messageID=?";
		int ec = 0;
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, messageID);
			ec = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ec;
	}
	
}
