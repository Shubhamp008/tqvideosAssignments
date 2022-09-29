package Assignment4;

class Cycle
{
	int accountNo;
	int noOfWheels;
	
	
	
	Cycle()
	{
		System.out.println("“I am default constructor”");
	}
	Cycle(int accountNo,int noOfWheels)
	{
		this();  //this with constructor
		this.accountNo=accountNo;//this with instance variable
		this.noOfWheels=noOfWheels;////this with instance variable
		
	}
	
	public void getaccountNumber() 
	{
		System.out.println("Account number is :"+accountNo);
	}
	public void getnoOfWheels() 
	{
		this.getaccountNumber();//this with method
		System.out.println(noOfWheels);
	}

	
}

public class CycleStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cycle c1=new Cycle(5,10);
		c1.getnoOfWheels();
		
	    
	    
		
		
	}

}
