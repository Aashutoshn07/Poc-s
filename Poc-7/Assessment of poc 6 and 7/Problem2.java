public class Problem2 {
    public static void main(String[] args) {
        User user = null;

        try {
            user.getName();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: The program is dealing with null which is inappropriate. " + e);
        }

    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}