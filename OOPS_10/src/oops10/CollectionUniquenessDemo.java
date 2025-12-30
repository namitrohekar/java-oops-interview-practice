package oops10;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class User{
	
	private int id;
	private String name;
	
	public User( int id , String name) {
		this.id =id;
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	@Override 
	public String toString() {
		return " [ Id : " + id + " , Name: " +  name + " ]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id , name);
	}
	
	@Override 
	public boolean equals( Object obj) {
		
		if(this == obj) return true;
		
		if(obj == null) return false;
		
		if( getClass()  != obj.getClass()) return false;
		
		User other = (User) obj;
		
		return this.id == other.id && ( this.name != null ? this.name.equals(other.name) : other.name == null );
		
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


class UserService{
	
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository ) {
		this.userRepository = userRepository;
	}
	
	public void registerUser(  int id , String name) {
		
		if(validateId(id) && validateName(name)) {
			User user = new User(id, name);
			userRepository.saveUser(user);
		}
		else {
			System.out.println("You may have entered invalid id : " + id  +" or invalid name : " + name);
		}
	}
	
	
	
	
	private boolean validateId( int id) {
		return id > 0;
	}
	private boolean validateName( String name ) {
		return name != null &&  !name.trim().isBlank();
	}
}

public class CollectionUniquenessDemo {


	public static void main(String[] args) {
		UserRepository repo = new UserRepository();
		
		UserService service = new UserService(repo);
		
		service.registerUser(1, "Namit");
		service.registerUser(1, "Namit");
		service.registerUser(-7, "Namit");
		service.registerUser(1, "Rohekar");
		
		
		System.out.println(repo.getAllUsers());
	}
}
