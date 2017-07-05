package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao extends BaseDao {
	public boolean selectAdmin(int ID, String password) {
		String sql = "SELECT adminID FROM admin WHERE adminID=? AND adminPassword=?";
		int id = -1;

		Boolean exist = false;
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, ID);
			pstmt.setString(2, password);

			ResultSet rst = pstmt.executeQuery();
			if (rst.next()) {
				id = rst.getInt("adminID");
			}

			if (id == -1)
				exist = false;
			else
				exist = true;

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}

		return exist;
	}
}
