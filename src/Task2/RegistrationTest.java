package Task2;

public class RegistrationTest {
    public static void main(String[] args) {
        Registration obj = new Registration();
        obj.setEmail("malaka@gmail.com");
        obj.setEmail("malakas@yahoo.com");
        obj.setUserName("Mala");
        obj.setUserName("  ");
        obj.setUserName("Malakas");
        obj.setPassword("MalakaZ");
        obj.setPassword("");
        obj.setPassword("bobo");
        obj.setPassword("Malakas");
        System.out.println(obj.getEmail());
        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());



    }
}
