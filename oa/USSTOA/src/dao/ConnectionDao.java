package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionDao {
	public Connection con;
	public DataSource dataSource;
	public ConnectionDao() {
	    try {
				Context context=new InitialContext();
				dataSource=(DataSource)context.lookup("java:comp/env/projectDS");
				con=dataSource.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	        
	        
	    if(con!=null){
	    	System.out.println("数据库连接成功");
	    } 
	}	
	
	
	public void closeConnection() {
		try {

			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			con = null;
		}
	}
	
	public void closeSource(PreparedStatement pst, ResultSet rs) {
		try {
			if (pst != null) {
				pst.close();
			}
			if(rs!=null){
				rs.close();
			}
			pst=null;
			rs=null;
		} catch (SQLException e) {
			e.printStackTrace();
			pst=null;
			rs=null;
		}
	}
}
