package MyClass;

public class Student {
    /*Properties */
    private String name;
    private int age;
    private boolean isStupid;


    /*Constructors
     */
    public Student() 
    {
        this.name = "No Name";
        this.age = 0;
        this.isStupid = true;
    }

    public Student (String name, int age)
    {
        this.name = name;
        this.age = age;
        this.isStupid = false;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void print()
    {
        System.out.println("Name-> " + this.name);
        System.out.println("Age-> " + this.age);
        System.out.println("Is this student stupid-> " + this.isStupid);
    }
}
