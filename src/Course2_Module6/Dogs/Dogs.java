package Course2_Module6.Dogs;

public class Dogs {
    public static void main(String[] args) {
        Dog dog = new Dog("Tom", "John", true);
        System.out.println(dog.name + " is a " + (dog.male ? "male" : "female") + " dog");
    }
}

