package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import bean.ApplicationDetails;
import bean.User;
import dbhandler.DbHandler;

public class UserService {
	
	   public List<User> fetchAllUsers() 
	   {
		System.out.println(" inside serv: fetchAllUsers");
		DbHandler db = DbHandler.getInstance();
		Connection conn = db.ObtainConnection();
		List<User> allusers = new LinkedList<User>();

		ResultSet rs;
		String query = "SELECT * FROM userdetail";

		try {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			int count = 0;
			while (rs.next()) {
				count++;
				User user = new User();
				user.setUserid(rs.getString(1));
				user.setStatus(rs.getString(2));
				allusers.add(user);
			}

		} catch (SQLException sqle) {
		}
		db.CloseConnection();
		return allusers;
	  }
	   
	   public User fetchUserByID(int userId) 
	   	   {
		   System.out.println("id :"+userId);
		System.out.println(" inside serv: fetchAllUsers");
		DbHandler db = DbHandler.getInstance();
		Connection conn = db.ObtainConnection();
		//List<User> allusers = new LinkedList<User>();
		User user = new User();
		ResultSet rs;
		String query = "SELECT *FROM userdetail where userid=" + userId;

		try {
			Statement stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			int count = 0;
			while (rs.next()) {
				//count++;
				user.setUserid(rs.getString(1));
				System.out.println("fecthed id: "+rs.getString(1));
				user.setStatus(rs.getString(2));
				break;
				//allusers.add(user);
			}

		} catch (SQLException sqle) {
		}
		db.CloseConnection();
		return user;
	  }
}
