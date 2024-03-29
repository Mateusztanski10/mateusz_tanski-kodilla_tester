public class User {
    String name;
    int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String name() {
        return this.name;
    }
    public int age() {
        return this.age;
    }

    public static void main(String[] args) {
        User anna = new User("Anna",20);
        User betty = new User("Betty",33);
        User carl = new User("Carl",58);
        User david = new User("David",13);
        User eva = new User("Eva",18);
        User frankie = new User("Frankie",45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        System.out.println(result);

        double averageAge = 0;
        averageAge = result / users.length;
        System.out.println(averageAge);

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < averageAge) {
                System.out.println(users[i].name);
            }
        }
    }
}
