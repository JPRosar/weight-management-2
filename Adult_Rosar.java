//John Rosar
//COSC1437
//Lab3 part 1


class Adult_Rosar
{
  
  private String name;
  private int height;
  private float exBMI;
  
  public Adult_Rosar()
  {
    this.name = null;
    this.height = 0;
    this.exBMI = 0;
  }
  
  public Adult_Rosar(String Name,int hit,float bmi)
  {
    this.name = Name;
    this.height = hit;
    this.exBMI = bmi;
  }
  
  //get methods
  public String getName()
  {
    return this.name;
  }

  public int getHeight()
  {
    return this.height;
  }
  
  public float getexBMI()
  {
    return this.exBMI;
  }
  
  // calculating method
  public double calWeight()
  {
    double Weight;
    Weight = (exBMI * height * height)/703;
    return Weight;
  }
  // toString method
  public String toString()
  {
	  System.out.println("-------------------------------------------");
	  System.out.println("File:    AdultWeightManagement_Rosar.java "); 
	  System.out.println("Adult Weight Management  -     John Rosar");
	  System.out.println("Standard BMI:                 18.5 – 24.9"); 
	  System.out.println("-------------------------------------------");
    return "Name:\t\t\t\t"+getName()+"\n"+"Height:\t\t\t\t"+getHeight()+"\n"+"BMI:\t\t\t\t"+getexBMI();


  }
}