
public class Policy
{
   private int policyNum;
   private String provider;
   private PolicyHolder policyHolder;
   private static int count = 0;
   

   public Policy(int pNum, String pProvider, PolicyHolder holder)
   {
      count++;
      policyNum = pNum;
      provider = pProvider;
      policyHolder = new PolicyHolder(holder);
    }
    
   public Policy()
   {
      count++;
      policyNum = 0;
      provider = "Provider";
      policyHolder = new PolicyHolder();
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
      The setPolicyHolder method sets the policy holder
      @param pNum The object to store into the policyHolder field
    */
    
    public void setPolicyHolder(PolicyHolder holder)
    {
      policyHolder = holder;
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
      The getPolicyHolder method returns the policy holder object
      @return policyHolder The policy holder object
    */
    
    public PolicyHolder getPolicyHolder()
    {
      return policyHolder;
    }
    
    /**
      The getPolicyCount method returns the amount of policies created
      @return count The amount of policies
    */
    
    public int getPolicyCount()
    {
      return count;
    }
    
   /**
      toString method
      @return - A string containing the policy information
  */ 
   public String toString()
   {
      return String.format("Policy Number:  " + policyNum + 
             "\nProvider Name: " + provider +
             "\n" + policyHolder.toString() + "\n");
   }

}

