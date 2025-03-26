package Unit9.Sandbox;


public class Student extends Person{
    private int gradeLevel;
    private boolean isABum;
    Student() { 
        this.gradeLevel = 0;
        this.isABum = true;
    }
    Student(int id, String b, String n, String addy, int g, boolean aB) {
        super(id, n, b, addy);
        this.gradeLevel = g;
        this.isABum = aB;
    }
    public int getGradeLevel() {return this.gradeLevel;}
    public boolean getBumStatus() {return this.isABum;}
    public void setGradeLevel(int g) {this.gradeLevel = g;}
    public void setBumStatus(boolean b) { this.isABum = b;}

}
