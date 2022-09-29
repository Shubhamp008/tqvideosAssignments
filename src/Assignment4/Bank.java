package Assignment4;

class Account{
	int accountNo;
	String  customerName;
	Account(int x,String y){
		accountNo=x;
		customerName=y;
		
	}
	
	
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Account a=new Account(14444,"MR.ronny");
		System.out.println("VALUES FOR FIRST OBJECT ARE :\nAccount Number :"+a.accountNo+"\nCustomer Name : "+a.customerName);
		
	}

}
