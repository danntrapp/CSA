
public class Tree{

    public static void num1() {
        String pp = "";
        for(int i = 0; i <= 10; i++) {
            System.out.println(pp += "*");
        }
    }
    public static void num2() {
        String pp = "**********";
        for(int i = 10; i > 0; i--) {
            pp = pp.substring(0, pp.length() - 1);
            System.out.println(pp);
        }
    }

    public static void num3() {
        String pp = "";
        for(int i = 0; i <= 10; i++) {
            pp+= "*";
            if(i % 2 != 0){ System.out.println(pp);}
        }
    }
    public static void num4() {
        String pp = "**********";
        for(int i = 10; i > 0; i--) {
            pp = pp.substring(0, pp.length() - 1);
            if(i % 2 == 0){ System.out.println(pp);}
        }
    }



    public static void main(String args[]) {
        num1();
        System.out.println("");
        num2();
        System.out.println("");
        num3();
        System.out.println("");
        num4();
        System.out.println("");
    }
}