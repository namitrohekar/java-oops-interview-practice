package oops6;

class User{
	
	private int id;
	private String name;
	private String email;
	
	
	// Constructor to initialize instance variables
	public User( int id , String name , String email) {
		this.email= email;
		this.id=id;
		this.name=name;
		
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
	
}

public class ToStringDemo {

	
	public static void main(String[] args) {
		
		User u1 = new User(1, "Username 1", "user@example.com");
		
		// System.out.println(u1.toString()); // now even with or without you will gets reference variables memory address 
		
		// now we will print again by seating getters 
		
		System.out.println(u1.getId());
		System.out.println(u1.getName());
		System.out.println(u1.getEmail()); // as you can see now we can do that 
		
		// now lets Override toString with out own fields
		
		System.out.println(u1);
		
		
	}

	
	
}
