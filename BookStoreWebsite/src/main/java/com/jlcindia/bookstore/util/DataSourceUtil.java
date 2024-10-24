package com.jlcindia.bookstore.util; 

import java.sql.*;

import org.apache.commons.dbcp.BasicDataSource;

public class DataSourceUtil {

	public static Connection getConnection() {
		Connection con = null;
		try {
			BasicDataSource myds = new BasicDataSource();
			myds.setDriverClassName("com.mysql.cj.jdbc.Driver");
			myds.setUrl("jdbc:mysql://localhost:3306/myjlcbsdb");
			myds.setUsername("root");
			myds.setPassword("ganesh");
			myds.setInitialSize(10);
			myds.setMaxActive(100);
			con = myds.getConnection();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}

	public static void cleanUp(ResultSet rs, Statement st, Connection con) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
			if (rs != null)
				rs.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void cleanUp(Statement st, Connection con) {
		try {
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
