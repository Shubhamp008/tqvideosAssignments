package Assignment3;
import java.util.Scanner;
class Verify{
	
	private int otp;
	private int verify;
	
	public String  getOtp() 
	{
		String s="otp varified";
		String s1="try again Otp mismatch";
		if(verify==otp) {
		return s;
		}
		else {
			return s1;
		}
		
	}
	
	
	public void setOtp(int z) 
	{
		System.out.print("otp is :"+z);
		
		verify=z;
		
		System.out.println ("enter otp received on your number ");
		Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    if(x==z) {
	    	otp=z;
	    }
	    else 
	    {
	    	otp=0;
	    	
	    }
	    
	}
}
public class EncapsulationRealTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Verify e=new Verify();
     
     e.setOtp(1101);
     System.out.println(e.getOtp());
     
     
     
	}

}
