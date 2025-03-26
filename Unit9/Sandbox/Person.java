package Unit9.Sandbox;

public class Person {
    protected int idNum;
    protected String name;
    protected String birthday;
    protected String homeAdress;


    Person() {
        this.idNum = 0;
        this.name = null;
        this.birthday = null;
        this.homeAdress = null;
    }
    Person(int id, String n, String b, String addy) {
        this.idNum = id;
        this.name = n;
        this.birthday = b;
        this.homeAdress = addy;
    }
    public int getId() {return this.idNum;}
    public String getName() {return this.name;}
    public String getBDay() {return this.birthday;}
    public String getAddy() {return this.homeAdress;}
    
    public void setID(int id) {this.idNum = id;}
    public void setName(String n) {this.name = n;}
    public void setBday(String bD) {this.birthday = bD;}
    public void setAddy(String a) {this.homeAdress = a;}
}
