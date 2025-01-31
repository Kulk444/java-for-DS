class Person {
    private String name;
    private int age;

    // Parameterless Constructor
    public Person()
    {
        this.name=null;
        this.age=0;
    }
    // Paramterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
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

    // Display method to show details of a person
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}