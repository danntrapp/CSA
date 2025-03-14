import java.util.Scanner;
    class UnitOneProj {
public static Scanner m_scanner = new Scanner(System.in);
public static void main(String[] args) {
   System.out.println("Which Problem would you like to see?");
   System.out.println("Enter a number 1-5, each corrosponds to a problem below.");
   System.out.println("1. Average Grade");
   System.out.println("2. Hot Diggity Dog");
   System.out.println("3. Hot Stuff");
   System.out.println("4. Dream Team");
   System.out.println("5. Loose Change");
   int problem = m_scanner.nextInt();

  switch (problem) {
            case 1:
                AverageGrade(args);
                break;
            case 2:
                HotDiggityDog(args);
                break;
            case 3:
                HotStuff(args);
                break;
            case 4:
                DreamTeam(args);
                break;
            case 5:
                LooseChange(args);
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
        }
}

 public static void AverageGrade(String[] args) {
    System.out.println("Enter Grade 1: ");
    int Grade1 = m_scanner.nextInt();
    System.out.println("Enter Grade 2: ");
    int Grade2 = m_scanner.nextInt();
    System.out.println("Enter Grade 3: ");
    int Grade3 = m_scanner.nextInt();

    double GradeAverage = (Grade1 + Grade2 + Grade3) / 3.0;
    System.out.println("The average of the grades is: " + GradeAverage);
    
 }

 public static void HotDiggityDog(String[] args) {
   double HotDogCost = 2.50;
   double tax = 1.07;
   

   System.out.println("How many hotdogs would you like today?");
   int numOfHotDogs = m_scanner.nextInt();
   double cost = (numOfHotDogs * HotDogCost) * tax;
   System.out.println("Your total today will be " + cost +
                      "dollars.");
 }

 public static void HotStuff(String[] args) {

    System.out.println("Enter C for Celsius or F for Fahrenheit: ");
    String TempType = m_scanner.nextLine();
    m_scanner.nextLine();
    
    System.out.println("Enter the temperature: ");
    int Temp = m_scanner.nextInt();
    
   if( TempType.equalsIgnoreCase("C")) {
        System.out.println("The Temperature in Fahrenheit is: " + (double) Temp * 9 / 5 + 32);
   }
   else {
        System.out.println("The Temperature in Celsius is: " + (double)(Temp - 32) * (double) 5 / 9);
   }
    
 }

 public static void DreamTeam(String[] args) {
   int studentsPerTeam = 6;
   
   System.out.println("Number of students in the class: ");
   int studentsInClass = m_scanner.nextInt();
   System.out.println("You can form " + (int)(studentsInClass/studentsPerTeam)+ 
                      " teams, with " + (int)(studentsInClass%studentsPerTeam)
                      + " students leftover.");
   
 }

 public static void LooseChange(String[] args) {
   int penny = 1;
   int nickel = 5;
   int dime = 10;
   int quarter = 25;
   
   System.out.println("How much change do you have?");
   int change = m_scanner.nextInt();
   int numOfQuarters = change/quarter;
   change -= (numOfQuarters * quarter);
   int numOfDimes = change/dime;
   change -= (numOfDimes * dime);
   int numOfNickels = change/nickel;
   change -= (numOfNickels * nickel);
   int numOfPennies = change/penny;

   System.out.println("Quarters: " + numOfQuarters);
   System.out.println("Dimes: " + numOfDimes);
   System.out.println("Nickels: " + numOfNickels);
   System.out.println("Pennies: " + numOfPennies);
   m_scanner.close();
 }
}