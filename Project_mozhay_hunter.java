
import java.util.Scanner;

public class Project_mozhay_hunter
{
   public static void main(String[] args)
   {
      //create a Scanner object used to read input from the console
      Scanner keyboard = new Scanner(System.in);
      //declare
      String pName;
      String pLastName;
      String pProvider;
      String pSmoker;
      int pAge;
      int pNum; //policy number
      double pHeight;
      double pWeight;

      
      //Ask the user for the policyholder's information
      System.out.println("Please enter the Policy Number: ");
      pNum = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("\nPlease enter the Provider Name: ");
      pProvider = keyboard.nextLine();
      System.out.println("\nPlease enter the Policyholder’s First Name: ");
      pName = keyboard.nextLine();
      System.out.println("\nPlease enter the Policyholder’s Last Name: ");
      pLastName = keyboard.nextLine();
      System.out.println("\nPlease enter the Policyholder’s Age: ");
      pAge = keyboard.nextInt();
      keyboard.nextLine();
      System.out.println("\nPlease enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      pSmoker = keyboard.nextLine();
      while (!pSmoker.equals("smoker") && !pSmoker.equals("non-smoker"))
      {
         System.out.println("Invalid input");
         System.out.println("\nPlease enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
         pSmoker = keyboard.nextLine();
      }
      System.out.println("\nPlease enter the Policyholder’s Height (in inches): ");
      pHeight = keyboard.nextDouble();
      System.out.println("\nPlease enter the Policyholder’s Weight (in pounds): ");
      pWeight = keyboard.nextDouble();
      
      //create the policy object
      Policy policy = new Policy(pNum, pAge, pWeight, pHeight, pProvider, pName, pLastName, pSmoker);
      
      //display the policyholder's info
      System.out.println("\nPolicy Number: " + policy.getPolicyNum());
      System.out.println("\nProvider Name: " + policy.getProvider());
      System.out.println("\nPolicyholder’s First Name: " + policy.getFirstName());
      System.out.println("\nPolicyholder’s Last Name: " + policy.getLastName());
      System.out.println("\nPolicyholder’s Age: " + policy.getAge());
      System.out.println("\nPolicyholder’s Smoking Status: " + policy.getSmoker());
      System.out.println("\nPolicyholder’s Height: " + policy.getHeight() + " inches");
      System.out.println("\nPolicyholder’s Weight: " + policy.getWeight() + " pounds");
      System.out.printf("\nPolicyholder’s BMI: %,.2f\n", policy.calculateBMI());
      System.out.printf("\nPolicyholder’s Price: $%,.2f\n", policy.calculatePrice());
      
   }
}