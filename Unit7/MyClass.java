package Unit7;
import java.util.ArrayList;
import java.util.Arrays;
public class MyClass {
    public static void main(String args[]) {
        String string1 = "string1";
        String string2 = "string2";
        String string3 = "string3";
        String string4 = "string4";
        String string5 = "string5";
        String string6 = "string6";
        String string7 = "string7";
        String string8 = "string8";
        String string9 = "string9";
        String string10 = "string10";
        
        ArrayList<String> arrlst = new ArrayList<>();
        String[] arr = {string1, string2, string3, string4, string5, string6, string7, string8, string9, string10};
        arrlst.addAll(Arrays.asList(arr));
        //Not how you do it, java throws a fit when you try and remove an item during iteration.
        try {
            for(String s : arrlst) {
                if(s.equals("string7")) {
                    arrlst.remove(arrlst.indexOf(s));
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        for(int i =0; i <arrlst.size(); i ++) {
            System.out.println(arrlst.get(i));
            if(arrlst.get(i).equals("string5")) {
                arrlst.remove(i);
                System.out.println("object" + arrlst.get(i));
            }
        }
        //One way of getting around this, storing the index of said item you want to remove and deleting it outside the loop
        int index = 0;
        for(String k : arrlst) {
            if(k.equals("string2")) {
                index =arrlst.indexOf(k);
            }
        }
        arrlst.remove(index);
        System.out.println(arrlst.toString());
    }
}
