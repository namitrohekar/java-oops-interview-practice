package oops2;

public class User {

    private int id;
    private String username;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email.trim();
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        User u1 = new User();
        u1.setId(101);
        u1.setUsername("User 1");

        if (!u1.setEmail("invalid-email.com")) {
            System.out.println("Invalid email rejected");
        }

        u1.setEmail("user1@email.com");

        System.out.println(u1.getId());
        System.out.println(u1.getUsername());
        System.out.println(u1.getEmail());
    }
}
