package Unit7.Unit7Proj;
import java.util.ArrayList;
import java.util.Arrays;

public class Community {
    private final ArrayList<Home> m_homesArrayList;
    private final String m_communityName;

    public Community() {
        this.m_homesArrayList = null;
        this.m_communityName = null;
    }
    public Community(Home[] homesArray, String name) {
        this.m_homesArrayList = new ArrayList<>(Arrays.asList(homesArray));
        this.m_communityName = name;
    }
    public Community (ArrayList<Home> homeArrList, String name) {
        this.m_homesArrayList = homeArrList;
        this.m_communityName = name;
    }
    public Home getHomeAtIndex(int index) {
        if (m_homesArrayList != null) {
            return m_homesArrayList.get(index);
        }
        return null;
    }
    public Home getHomeAtNum(int num) {
        for(Home i : m_homesArrayList){
            if(i.getHomeNum() == num) {
                return i;
            }
        }
        return null;
    }
    public Home getHomeWithName(String name) {
        for(Home i : m_homesArrayList) {
            if(i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }
    public int getTotalAdults() {
        int tot = 0;
        for(Home i : m_homesArrayList)
        {
            tot += i.getNumAdults();
        }
        return tot;
    }
    public int getTotalKids() {
        int tot = 0;
        for(Home i : m_homesArrayList)
        {
            tot += i.getNumKids();
        }
        return tot;
    }
    public int getTotalPeople() {
        int tot = 0;
        for(Home i : m_homesArrayList)
        {
            tot += i.getNumPeople();
        }
        return tot;
    }
    public String getCommunityName() {
        return this.m_communityName;
    }
    public void removeHome(int indexOfHome) {
        this.m_homesArrayList.remove(indexOfHome);
    }
    public void addHome(Home house) {
        m_homesArrayList.add(house);
    }
    public void addHome(ArrayList<Home> houses) {
        m_homesArrayList.addAll(houses);
    }
    public void addHome(Home[] houses) {
        m_homesArrayList.addAll(Arrays.asList(houses));
    }
    private boolean isSorted(Home[] arr) {
        for(int i = 0; i < arr.length - 1; i++) 
        {
            if(arr[i].getNumPeople() > arr[i+1].getNumPeople())
            {
                return false;
            }
        }
        return true;
    }
    public Home[] sortHomes() {
        Home[] homeArray = new Home[m_homesArrayList.size()];
        m_homesArrayList.toArray(homeArray);
        int k = 0;
        while(!isSorted(homeArray))
        {
            for(int i  = 0; i < homeArray.length; i++) {
                int index = (int)(Math.random() * homeArray.length);
                Home temp = homeArray[index];
                homeArray[index] = homeArray[i];
                homeArray[i] = temp;
            }
            k++;
            if(k % 100 == 0)
            {
                System.out.format("""
                                  Loop has run%,8d times.
                                  """, k); 
            }
        }
        System.out.format("It took %,8d loops to sort.\n", k); 
        return homeArray;
    }
}
