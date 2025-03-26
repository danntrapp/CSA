package Unit9.Sandbox;

public class Teacher extends Person{
    private boolean tenure;
    private String department;
    Teacher() {
        this.department = null;
        this.tenure = false;
    }
    Teacher(int id, String b, String n, String addy, String dep, boolean t) {
        super(id, n, b, addy);
        this.department = dep;
        this.tenure = t;
    }
    public boolean getTenure() {return this.tenure;}
    public String getDep() {return this.department;}
    public void setTenure(boolean b) { this.tenure = b;}
    public void setDep(String d) {this.department = d;}
}
