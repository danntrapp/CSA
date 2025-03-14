import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
class TestCorrections
{
public static Scanner m_scanner = new Scanner(System.in);
public static void main(String[] args)
{
    System.out.println("4.");
    System.out.println("5.");
    System.out.println("6.");
    System.out.println("7.");
    System.out.println("11.");
    System.out.println("20.");
    System.out.println("21.");
    System.out.println("29.");
    System.out.println("32.");
    System.out.println("Enter a number, each corrosponds to a problem above.");
    System.out.println("Which Problem would you like to see?");
    int problem = m_scanner.nextInt();
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    switch (problem) {
        case 4 -> Question4(args);
        case 5 -> Question5(args);
        case 6 -> Question6(args);
        case 7 -> Question7(args);
        case 11 -> Question11(args);
        case 20 -> Question20(args);
        case 21 -> Question21(args);
        case 29 -> Question29(args);
        case 32 -> Question32(args);

        default -> System.out.println("Invalid input.");
    }
}

public static void ReadFile(String filePath)  throws IOException{
    Path path = Paths.get(filePath);
    String content = new String(Files.readAllBytes(path));  
    System.out.println(content);
}

public static void QuestionReader(String num)
{
    String path = "Unit 1\\Unit 1 Test Corrections\\TestQuestions\\Question" + num +".txt";
    try {
        ReadFile(path);
    } catch (IOException e) {
        System.out.println("An error occurred.");
    }
    System.out.println(" ");
}

public static void Question4(String[] arg)
{
    QuestionReader("4");
    int x = 1;
    int y = 4;
    int sum = x + y;
    double average = (double) (sum / 2);
    System.out.println("The code above actually evaluates to: " + average);
    System.out.println();
    System.out.println("D is the correct answer as the double casting is applied after sum/2 is evaluated");
}
public static void Question5(String[] arg)
{
    QuestionReader("5");
    System.out.println("The code above actually evaluates to: ");
    double num = 9 / 4;
    System.out.print(num);
    System.out.print(" ");
    System.out.print((int) num);
    System.out.println("");
    System.out.println("B is the correct answer as 9/4 is evaluated as an int, "
                    + "with the double only being applied afterwards.");
                    System.out.println("Then when int is cast, it outputs 2");
}

public static void Question6(String[] arg)
{
    
    QuestionReader("6");
    System.out.println("The code above actually evaluates to: ");
    System.out.println("I. " + ((double)2 / 4 + 3));
    System.out.println("II. " + ((double) (2 / 4) + 3));
    System.out.println("III. " + (double) (2 / 4 + 3));

    System.out.println(" ");
    System.out.println("A is the correct answer as the double casting is applied after 2/4 is evaluated");
    System.out.println("This means that I is the only correct answer as the other two are evaluated as ints,");
    System.out.println("and because of this, the double casting is applied after the sum is evaluated.");
    System.out.println("resulting in a lower value than expected.");
}

public static void Question7(String[] arg)
{
    QuestionReader("7");
    System.out.println("The code above actually evaluates to: ");
    double x = (int) (5.5 - 2.5);
    double y = (int) 5.5 - 2.5;
    System.out.println(x);
    System.out.println(y);
    System.out.println(x - y);
    System.out.println(" ");

    System.out.println("D is the correct answer as the int casting on x is applied after 5.5 - 2.5 is evaluated,");
    System.out.print("resulting in x being evaluated as 3.0. ");
    System.out.println("Then, the int casting on y is applied before 5.5 - 2.5 is evaluated,");
    System.out.println("resulting in y being evaluated as 5 - 2.5, which as an int is rounded down to 3, ");
    System.out.print("then converted to a double. ");
    System.out.println("This means that x-y = 3.0 - 3 = 0.5, which is D.");
}

public static void Question11(String[] arg)
{
    QuestionReader("11");
    int x = 5;
    int y = 6;
    int z1;
    int z2 = 0;
    z1 = (x + y) / 2;
    z2 = (x + y) / 2;
    System.out.println("The code above actually evaluates to: ");
    System.out.println("I. " + z1);
    System.out.println("II. " + z2);
    System.out.println("III. Throws an error as z cannot be assigned a boolean value in java ");
    System.out.println("(unlike in the superior languages of C and C++).");

    System.out.println(" ");
    System.out.println("C is the correct answer as if z is declared properly ");
    System.out.println("(whether just declared or declared and initialized),");
    System.out.println("the code will run as intended.");
}

public static void Question20(String[] arg)
{
    QuestionReader("20");
    System.out.println("The code above actually evaluates to: ");
    System.out.println("I. " + (9 + 10 % 12));
    System.out.println("II. " + ((9 + 10) % 12));
    System.out.println("III. " + (9 - 2 % 12));
    System.out.println(" ");
    System.out.println("D is the correct answer as the % operator has a higher precedence than + or -.");
    System.out.println("The % operator has the same precedence as * and /.");
    System.out.println("This means that II & III are evaluated as 9 + (10 % 12) and 9 - (2 % 12), each evaluating to 7, ");
    System.out.println("while the first expression is evaluated as (9 + 10) % 10, which evaluates to 19.");
}

public static void Question21(String[] arg)
{
    QuestionReader("21");
    System.out.println("The code above actually evaluates to: ");
    int x = 5;
    x += 6 * 2;
    x -= 3 / 2;
    System.out.println(x);
    System.out.println(" ");

    System.out.println("E is the correct answer as the += and -= operators have a lower precedence than * and /.");
    System.out.println("Because of this, x = 17 after the first line, and x = 16 after the second line.");
}

public static void Question29(String[] arg)
{
    QuestionReader("29");
    System.out.println("The code above actually evaluates to: ");
    System.out.println(404 / 10 * 10 + 1);
    System.out.println(" ");
    System.out.println("D is the correct answer as the / and * operators have the same precedence, ");
    System.out.println("and are evaluated from left to right, with the + operator having a lower precedence.");
    System.out.println("This means that the expression is evaluated as ((404 / 10) * 10) + 1, which evaluates to 401.");
}
public static void Question32(String[] arg)
{
    QuestionReader("32");
    System.out.println("C is the correct answer as it a assigns the of 2 ints being divided by an int, ");
    System.out.println("resulting in the answer being an int and therefore rounded down.");
    System.out.println("Then, the minutes variable is assigned the remainder of the division minutes & 60, ");
    System.out.println("sucessfully advancing both the minutes and hours as intended.");

}

}