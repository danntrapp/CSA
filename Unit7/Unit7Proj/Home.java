package Unit7.Unit7Proj;
public class Home {
    private String m_name;
    private int m_numAdults;
    private int m_numKids;
    private int m_numPeople;
    private int m_homeNum;
    private static int NUM_HOMES = 0;

    Home() {
        this.m_name = "";
        this.m_numAdults = 0;
        this.m_numKids = 0;
        this.m_numPeople = 0;
        NUM_HOMES++;
        this.m_homeNum = NUM_HOMES + 1000;
    }
    Home(String n, int nA, int nK) {
        this.m_name = n;
        this.m_numAdults = nA;
        this.m_numKids = nK;
        this.m_numPeople = (this.m_numAdults + this.m_numKids);
        NUM_HOMES++;
        this.m_homeNum = NUM_HOMES + 1000;
    }
    public int getNumKids() {
        return this.m_numKids;
    }
    public int getNumAdults() {
        return this.m_numAdults;
    }
    public String getName() {
        return this.m_name;
    }
    public int getHomeNum() {
        return this.m_homeNum;
    }
    public int getNumPeople() {
        return this.m_numPeople;
    }
    public static int GET_NUM_HOMES() {
        return NUM_HOMES;
    }

    public void setNumKids(int num) {
        this.m_numKids = num;
    }
    public void setNumAdults(int num) {
        this.m_numAdults = num;
    }
    public void setHomeNum(int num) {
        this.m_homeNum = num;
    }
    public void setNumPeople(int num) {
        this.m_numPeople = num;
    }
    public void setName(String n) {
        this.m_name = n;
    }
    public void addKids() {
        this.m_numKids++;
    }
    public void addKids(int num) {
        this.m_numKids += num;
    }
    public void addAdult() {
        this.m_numAdults++;
    }
    public void addAdult(int num) {
        this.m_numAdults += num;
    }


}
