
public class Policy
{
   private int policyNum;
   private String provider;
   private static int count = 0;


   public Policy(int pNum, String pProvider)
   {
      count++;
      policyNum = pNum;
      provider = pProvider;
    }
    
   public Policy()
   {
      count++;
      policyNum = 0;
      provider = "Provider";

    }
    
    /**
      The setProvider method stores a string into the provider field
      @param pNum The string to store in the provider field
    */
    
    public void setProvider(String pProvider)
    {
      provider = pProvider;
    }
    
    
    /**
      The setPolicyNum method stores a value into the policy number field
      @param pNum The value to store in the policy number field
    */
    
    public void setPolicyNum(int pNum)
    {
      policyNum = pNum;
    }
    
    /**
      The getPolicyNum method returns the policy number value
      @return policyNum The value in the policy number field
    */
    
    public int getPolicyNum()
    {
      return policyNum;
    }

    /**
      The getProvider method returns the Provider name
      @return provider The string in the Provider field
    */
    
    public String getProvider()
    {
      return provider;
    }
    
   /**
      toString method
      @return - A string containing the policy information
  */ 
   public String toString()
   {
      return String.format("Policy Number:  " + policyNum + 
             "\nProvider Name: " + provider );
   }

}

