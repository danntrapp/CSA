import java.util.Scanner;
public class Sandbox {
    //the worlds first and best keyboard
    public static void main(String args[]) {
        try (Scanner m_skanner = new Scanner(System.in)) {
            System.out.println("How many characters is your word: ");
            int numberOfChar = m_skanner.nextInt();
            String word = "";
            
            for(int i = 0; i <= numberOfChar; i++){
                //once you take a look at this could you please tell me why it loops twice on first run,
                //thats why I have this conditional, to prevent it from printing Next Characcter:  twice on first loop.
                if(i != 1) {System.out.println("Next character : ");}
                String character = m_skanner.nextLine();
                if(character.equalsIgnoreCase("a")) {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("a");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("b"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("a");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("c"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("c");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("d"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("d");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("e"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("e");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("f"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("f");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("g"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("g");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("h"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("h");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("i"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("i");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("j"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("j");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("k"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("k");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("l"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("l");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("m"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("m");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("n"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("n");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("o"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("o");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("p"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("p");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("q"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("q");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("r"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("r");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("s"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("s");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("t"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("t");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("u"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("u");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("v"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("v");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("w"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("w");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("x"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("x");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("y"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("y");
                        word += character;
                    } else {System.out.println("okay then");}
                } else if(character.equalsIgnoreCase("z"))  {
                    System.out.println("are you sure you want to type this?");
                    String yar = m_skanner.nextLine();
                    if(yar.equalsIgnoreCase("yes"))    {
                        System.out.println("z");
                        word += character;
                    } else {System.out.println("okay then");}
                }
                
            }
            System.out.println("");
            System.out.println("");
            System.out.println("Your word is: " + word);
        }
    }
}
