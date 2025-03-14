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
    System.out.println("7.");
    System.out.println("16.");
    System.out.println("Enter a number, each corrosponds to a problem above.");
    System.out.println("Which Problem would you like to see?");
    int problem = m_scanner.nextInt();
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
    switch (problem) {
        case 7 -> Question7(args);
        case 16 -> Question16(args);
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

public static void Question7(String[] arg)
{
    QuestionReader("7");
    System.out.println("Option A will give a random even integer between 0-10, 10 inclusive");
    System.out.println();
    System.out.println("Option B will give a random even integer between 0-12, 12 inclusive");
    System.out.println();
    System.out.println("Option C is supposed to generate 2 random numbers between 0-5, inclusive and sums the two.");
    System.out.println("However it will generate a syntax error as Math.random should be Math.random().");
    System.out.println();
    System.out.println("Option D generates a random int between 0-12, inclusive but uses Math.random instead of Math.random()");
    System.out.println();
    System.out.println("Option E is correct as it generates 2 random ints between 0-6, inclusive and sums the two");
}
public static void Question16(String[] arg)
{
    QuestionReader("16");
    System.out.println("Option A will give a random even integer between 0-10, 10 inclusive");
    System.out.println();
    System.out.println("Option B will give a random even integer between 0-12, 12 inclusive");
    System.out.println();
    System.out.println("Option C is supposed to generate 2 random numbers between 0-5, inclusive and sums the two.");
    System.out.println("However it will generate a syntax error as Math.random should be Math.random().");
    System.out.println();
    System.out.println("Option D generates a random int between 0-12, inclusive but uses Math.random instead of Math.random()");
    System.out.println();
    System.out.println("Option E is correct as it generates 2 random ints between 0-6, inclusive and sums the two");
}
}