package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao extends BaseDao {
	public boolean selectUser(int ID, String password) {
		String sql = "SELECT userID FROM users WHERE userID=? AND userPassword=?";
		int id = -1;

		Boolean exist = false;
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, ID);
			pstmt.setString(2, password);

			ResultSet rst = pstmt.executeQuery();
			if (rst.next()) {
				id = rst.getInt("userID");
			}

			if (id == -1)
				exist = false;
			else
				exist = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return exist;
	}

	public Connection test() {
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
