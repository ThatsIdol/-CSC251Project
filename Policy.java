
public class Policy
{
   private int policyNum;
   private int age;
   private double weight;
   private double height;
   private double bmi;
   private String provider;
   private String firstName;
   private String lastName;
   private String smoker;


   public Policy(int pNum, int pAge, double pWeight, double pHeight, String pProvider, String pName, String pLastName, String pSmoker)
   {
      policyNum = pNum;
      age = pAge;
      weight = pWeight;
      height = pHeight;
      provider = pProvider;
      firstName = pName;
      lastName = pLastName;
      smoker = pSmoker;
    }
    
   public Policy()
   {
      policyNum = 0;
      age = 0;
      weight = 0;
      height = 0;
      provider = "Provider";
      firstName = "First Name";
      lastName = "Last Name";
      smoker = "non-smoker";
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
      The setAge method stores a value into the age field
      @param pNum The value to store in the age field
    */
    
    public void setAge(int pAge)
    {
      age = pAge;
    }
    
    /**
      The setWeight method stores a value into the weight field
      @param pWeight The value to store in the weight field
    */
    
    public void setWeight(double pWeight)
    {
      weight = pWeight;
    }
    
    /**
      The setHeight method stores a value into the height field
      @param pHeight The value to store in the height field
    */
    
    public void setHeight(double pHeight)
    {
      height = pHeight;
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
      The setFirstName method stores a string into the first name field
      @param pName The string to store in the provider first name
    */
    
    public void setFirstName(String pName)
    {
      firstName = pName;
    }
    
    /**
      The setLasttName method stores a string into the last name field
      @param pLastName The string to store in the provider last name
    */
    
    public void setLasttName(String pLastName)
    {
      lastName = pLastName;
    }
    
    /**
      The setSmoker method stores a string into the smoker field
      @param pSmoker The string to store in the smoker last name
    */
    
    public void setSmoker(String pSmoker)
    {
      smoker = pSmoker;
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
      The getAge method returns the age value
      @return age The value in the age field
    */
    
    public int getAge()
    {
      return age;
    }
    
    /**
      The getWeight method returns the weight value
      @return weight The value in the weight field
    */
    
    public double getWeight()
    {
      return weight;
    }
    
    /**
      The getHeight method returns the height value
      @return height The value in the height field
    */
    
    public double getHeight()
    {
      return height;
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
      The getFirstName method returns the policyholder's first name
      @return firstName The string in the first name field
    */
    
    public String getFirstName()
    {
      return firstName;
    }
    
    /**
      The getLastName method returns the policyholder's last name
      @return lastName The string in the last name field
    */
    
    public String getLastName()
    {
      return lastName;
    }
    
    /**
      The getSmoker method returns the policyholder's smoker status
      @return smoker The string in the smoker field
    */
    
    public String getSmoker()
    {
      return smoker;
    }
    
    /**
      The calculateBMI method calculates the policyholder's BMI
      @return bmi The calculated BMI value
    */
    
    public double calculateBMI()
    {
      double bmi;
      bmi = (weight * 703) / Math.pow(height, 2);
      return bmi;
    }
    
    /**
      The calculateInsurance method calculates the price of the policyholder's insurance policy
      @return price The calculated price
    */
    
    public double calculatePrice()
    {
      //constants
      double BASE_PRICE = 600;
      double AGE_FEE = 75;
      double SMOKER_FEE = 100;
            
      double price = BASE_PRICE; //start price with the base price
      double fee = 0;
      double bmi;
      bmi = (weight * 703) / Math.pow(height, 2);
      
      if (age > 50)
         fee +=AGE_FEE;
      if (smoker.equals("smoker"))
         fee +=SMOKER_FEE;
      if (bmi > 35)
         fee +=((bmi-35)*20);
      price = price + fee;   

      return price;
    }
}

