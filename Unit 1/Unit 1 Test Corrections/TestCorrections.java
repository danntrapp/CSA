import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
class TestCorrections
{
public static Scanner m_scanner = new Scanner(System.in);
public static void main(String[] args)
{
    System.out.println("Which Problem would you like to see?");
    System.out.println("Enter a number, each corrosponds to a problem below.");
    System.out.println("4.");
    System.out.println("5.");
    System.out.println("6.");
    System.out.println("7.");
    System.out.println("11.");
    System.out.println("20.");
    System.out.println("21.");
    System.out.println("29.");
    System.out.println("32.");
    int problem = m_scanner.nextInt();
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    switch (problem) {
        case 4:
            Question4(args);
            break;
        case 5:
            Question5(args);
            break;
        case 6:
            Question6(args);
            break;
        case 7:
            Question7(args);
            break;
        case 11:
            Question11(args);
            break;
        case 20:
            Question20(args);
            break;
        case 21:
            Question21(args);
            break;
        case 29:
            Question29(args);
            break;
        case 32:
        Question32(args);
            break;

        default:
            System.out.println("Invalid input. Please enter a number between 1 and 5.");
    }
}

public static void ReadFile(String filePath)  throws IOException{
    Path path = Paths.get(filePath);
    String content = new String(Files.readAllBytes(path));  
    System.out.println(content);
}

public static void QuestionReader(String num)
{
    String path = "TestQuestions\\Question" + num +".txt";
    try {
        ReadFile(path);
    } catch (IOException e) {
        e.printStackTrace();
    }
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
//     Consider the following code segment.
double num = 9 / 4;
System.out.print(num);
System.out.print(" ");
System.out.print((int) num);

// What is printed as a result of executing the code segment?
// (A) 2 2
// (B) 2.0 2
// (C) 2.0 2.0
// (D) 2.25 2
// (E) 2.25 2.0

System.out.println("");
System.out.println("B is the correct answer as 9/4 is evaluated as an int, "
                   + "with the double only being applied afterwards.");
                   System.out.println("Then when int is cast, it outputs 2");
}

public static void Question6(String[] arg)
{

}

public static void Question7(String[] arg)
{

}

public static void Question11(String[] arg)
{

}

public static void Question20(String[] arg)
{

}

public static void Question21(String[] arg)
{

}

public static void Question29(String[] arg)
{

}

public static void Question32(String[] arg)
{

}

}