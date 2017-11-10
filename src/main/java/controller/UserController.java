package controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.ApplicationDetails;
import bean.User;
import service.NewService;
import service.UserService;

@Path("/users")
public class UserController {
	
	UserService userservice =  new UserService();
	
	 @GET
	 @Path("/allUsers")
	    @Produces(MediaType.APPLICATION_JSON)
		public List<User> getAllUsers()
		{
			System.out.println("inside member getAppDetails");
			List<User> listOfUsers=userservice.fetchAllUsers();
			return listOfUsers;
		}

	 @GET
	 @Path("/userById")
	    @Produces(MediaType.APPLICATION_JSON)
		public User getUserByID()
		{
			System.out.println("inside member getUserByID");
			int userid=559524;
			User user=userservice.fetchUserByID(userid);
			System.out.println("user det for id : "+user.getUserid());
			return user;
		}

}
