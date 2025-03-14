package Unit7.Unit7Proj;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Home clown = new Home("paul", 2, 0);
        Home clown2 = new Home("Gerome", 5, 1);
        Home clown3 = new Home("gable", 0, 7);
        Home clown4 = new Home("Snakel", 1, 2);
        Home clown5 = new Home("Pankack", 9, 0);
        Home clown6 = new Home("Hermit", 2, 4);
        Home clown7 = new Home("Pauline", 1, 1);
        Home clown8 = new Home("Dick", 4, 0);
        Home clown9 = new Home("Van-Winkle", 2, 3);
        Home clown10 = new Home("Dusseldorf", 2, 8);
        Home[] homeArr = {clown, clown2, clown3, clown4, 
                           clown5, clown6, clown7, clown8, 
                           clown9, clown10};
        ArrayList <Home> homeArrLst = new ArrayList<>(Arrays.asList(homeArr));
        Community OneidaCommunity = new Community(
            new ArrayList<>(homeArrLst.subList(0, 5)), "Oneida Community");
        OneidaCommunity.addHome(homeArr[5]);
        OneidaCommunity.addHome(new Home[]{homeArr[6], homeArr[7]});
        OneidaCommunity.addHome(new ArrayList<>(homeArrLst.subList(8, 10)));
        Home[] arr = OneidaCommunity.sortHomes();
        for(Home i :arr) {
            System.out.println(i.getNumPeople());
        }
        for(int i = 0; i < 5; i++) {
            OneidaCommunity.getHomeAtIndex(i).addKids();
        }
        for(int i = 8; i < 10; i++) {
            OneidaCommunity.getHomeAtIndex(i).addKids(-1);
        }
        System.out.println(OneidaCommunity.toString());
    }
    
}
