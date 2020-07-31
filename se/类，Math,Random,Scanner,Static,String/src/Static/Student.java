package Static;

public class Student {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private int age;
    static String room;
    private static int idCounter=0;//学号计数器，每当new了一个新对象，计数器++

    public Student() {
        this.id=++idCounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
