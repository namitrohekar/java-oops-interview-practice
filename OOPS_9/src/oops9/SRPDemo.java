package oops9;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * What is SRP : A class should have only one reason to change, meaning it should encapsulate only one responsibility or concern.
 * A class should have only one reason to change , In this example , I separated user registration , persistence 
 * and email notification into separate classes 
 */



class User{
	
	private long userId;
	private String userName;
	
	public User( long userId , String userName) {
		
		this.userId = userId;
		this.userName = userName;
	}
	
	public long getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	
	@Override
	public String toString() {
		return "User{ id = " + userId + " , name = " + userName + " }";
	}
	
	@Override
	public boolean equals( Object obj) {
		if(this == obj) return true;
		
		if(obj == null) return false;
		
		if( obj.getClass() != getClass()) return false;
		
		User other = (User) obj;
		
		return this.userId == other.userId && ( this.userName != null ? this.userName.equals(other.userName) : other.userName == null);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(userId , userName);
	}
	
}

class UserRepository{
	
	private Set<User> users = new HashSet<>();
	
	public void saveUser( User user) {
		users.add(user);
		System.out.println("Saved :" + user);
	}
	
	public Set<User> getAllUsers(){
		return users;
	}
}

class EmailService{
	
	public void sendWelcomeEmail(User user) {
		System.out.println("Welcome Email sent to " + user.getUserName());
	}
}

class UserService {
	
	private final UserRepository userRepository;
	private final EmailService emailService;
	
	
	public UserService( UserRepository userRepository , EmailService emailService) {
		this.userRepository = userRepository;
		this.emailService = emailService;
	}
	
	public void registerUser( long id , String name) {
		
		if(validateId(id) && validateName(name)) {
			User user = new User(id, name);
			userRepository.saveUser(user);
			emailService.sendWelcomeEmail(user);
		}
		else {
			System.out.println("You may have entered invalid id " + id + " Or invalid name " + name);
		}
	}
	
	private boolean validateId( long id) {
		return id > 0 ;
	}
	private boolean validateName (String name ) {
		return name != null && !name.trim().isEmpty();
	}
}

public class SRPDemo {
	
	public static void main(String[] args) {
		
		UserRepository repo = new UserRepository();
		EmailService email = new EmailService();
		
		UserService service = new UserService(repo, email);
		
		service.registerUser(1, "User 1");
		service.registerUser(-200, "User 2");
		service.registerUser(2, "  ");
		
		service.registerUser(1, "User 1");
		service.registerUser(2, "User 2");
		
		
		System.out.println(repo.getAllUsers());
		
	}

}
