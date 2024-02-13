//Mozhay Hunter

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
      int smokerCount = 0;
      int nonSmokerCount = 0;
      int pAge;
      int pNum; //policy number
      int policyCount;
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
         
         PolicyHolder polHolder = new PolicyHolder(pAge, pWeight, pHeight, pName, pLastName, pSmoker);
         Policy pol = new Policy(pNum, pProvider, polHolder);
         policies.add(pol);
      }
      

      
      //display the policyholder's info
      for(int i = 0; i < policies.size(); i++)
      { 
      System.out.println(policies.get(i));
      
      //count smokers and non-smokers
      if (policies.get(i).getPolicyHolder().getSmoker().equals("smoker"))
         smokerCount++;
      else
         nonSmokerCount++;
      }
      
      policyCount = policies.get(0).getPolicyCount();
      
      System.out.println("There were " + policyCount + " Policy objects created");
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
      
   }
}