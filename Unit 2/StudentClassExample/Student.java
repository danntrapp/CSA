package StudentClassExample;
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

    public boolean getStupid()
    {
        return this.isStupid;
    }

    public void setStupid()
    {
        this.isStupid = true;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return this.age;
    }

    public void print()
    {
        System.out.println("Name-> " + this.name);
        System.out.println("Age-> " + this.age);
        System.out.println("Is this student stupid-> " + this.isStupid);
    }
}
