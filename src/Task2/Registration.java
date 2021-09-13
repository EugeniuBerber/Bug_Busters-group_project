package Task2;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String newEmail) {
        if (newEmail.endsWith("@yahoo.com")) {
            this.email = newEmail;
            System.out.println("Email has been accepted.");
        } else
            System.out.println("Email not valid");
    }

    public void setUserName(String newUserName) {
        if (newUserName.length() < 6 && newUserName.isBlank()) {
                System.out.println("User name too short");
        if (newUserName.isBlank())
                System.out.println("User name cant be empty");
        } else if (newUserName.length() > 6 && !newUserName.isBlank()) {
            this.userName = newUserName;
            System.out.println("User name was accepted");
        }

    }

    public void setPassword(String password) {
        if (password.isBlank())
            System.out.println("Password can't be empty");
        if (password.length() < 6 &&!password.isBlank())
            System.out.println("Password is too short");
        else if (password.contains(userName))
            System.out.println("Password can't contain username");
        else if (!password.isBlank() && !password.contains(userName)) {
            this.password = password;
            System.out.println("Password was accepted");
        }
    }
}
