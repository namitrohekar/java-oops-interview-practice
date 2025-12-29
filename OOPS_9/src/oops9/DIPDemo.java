package oops9;

/*
 * Dependency Inversion Principle(DSP) :
 * High level modules should not depend on low-level modules , 
 * both should depend on abstractions
 */

interface Database{
	void save( String data);
}


class MySQLDatabase implements Database{

	@Override
	public void save(String data) {
		System.out.println("Data saved  MySQL" + data);
		
	}
	
	
	
}

class PostgreSQLDatabase implements Database{

	@Override
	public void save(String data) {
		System.out.println("Data saved via postgreSQL " + data);
		
	}
	
}

class UserServices{
	
	private final Database database;
	
	public UserServices(Database database) {
		this.database = database; 
	}
	
	public void registerUser( String name) {
		System.out.println("Resistering user " + name);
		database.save(name);
	}
	
}

public class DIPDemo {
	
	public static void main(String[] args) {
		
		Database mysqlDb = new MySQLDatabase();
		UserServices userServiceMySQL = new UserServices(mysqlDb);
		userServiceMySQL.registerUser("Namit");
		
		
		Database postgresDb = new PostgreSQLDatabase();
		UserServices userServicePostgres = new UserServices(postgresDb);
		userServicePostgres.registerUser("Rohekar");
	}

}
