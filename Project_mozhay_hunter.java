
import java.util.*;

import java.io.*;

public class Project_mozhay_hunter
{
   public static void main(String[] args) throws IOException
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
      
      
      //create array list
      ArrayList<Policy> policies = new ArrayList<Policy>();

      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      while (inputFile.hasNext())
      { //start reading from file
         pNum = inputFile.nextInt();
         inputFile.nextLine();
         pProvider = inputFile.nextLine();
         pName = inputFile.nextLine();
         pLastName = inputFile.nextLine();
         pAge = inputFile.nextInt();
         inputFile.nextLine();
         pSmoker = inputFile.nextLine();
         pHeight = inputFile.nextDouble();
         pWeight = inputFile.nextDouble();
         
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
            inputFile.nextLine();
         }
         
         Policy pol = new Policy(pNum, pAge, pWeight, pHeight, pProvider, pName, pLastName, pSmoker);
         policies.add(pol);
      }
      

      
      //display the policyholder's info
      for(int i = 0; i < policies.size(); i++)
      { 
      System.out.println("\nPolicy Number: " + policies.get(i).getPolicyNum());
      System.out.println("Provider Name: " + policies.get(i).getProvider());
      System.out.println("Policyholder’s First Name: " + policies.get(i).getFirstName());
      System.out.println("Policyholder’s Last Name: " + policies.get(i).getLastName());
      System.out.println("Policyholder’s Age: " + policies.get(i).getAge());
      System.out.println("Policyholder’s Smoking Status: " + policies.get(i).getSmoker());
      System.out.println("Policyholder’s Height: " + policies.get(i).getHeight() + " inches");
      System.out.println("Policyholder’s Weight: " + policies.get(i).getWeight() + " pounds");
      System.out.printf("Policyholder’s BMI: %,.2f\n", policies.get(i).calculateBMI());
      System.out.printf("Policyholder’s Price: $%,.2f\n\n", policies.get(i).calculatePrice());

      }

      
   }
}