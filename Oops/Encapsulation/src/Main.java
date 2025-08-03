public class Main {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation("Max", 27);
        System.out.println("accessing name getter method");
        System.out.println(e.getName());
        e.setName("Lando");
        System.out.println("accessing name getter method after setting name");
        System.out.println(e.getName());
        System.out.println("accessing age getter method");
        System.out.println(e.getAge());
        e.setAge(25);
        System.out.println("accessing age getter method after setting age");
        System.out.println(e.getAge());
    }
}
