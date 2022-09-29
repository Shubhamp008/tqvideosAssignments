package Assignment4;

class Rectangle
{
	private float l,b;
	Rectangle() {}
	
	public void setData(float x,float y) {
		
		l=x;
		b=y;
	}
	public void setData(int x,int y) {
		
		l=x;
		b=y;
		
	}
	
	public void showData() 
	{
		System.out.println("Area of Rectangle :" +l*b);
		
	}
}

class Square
{
	private float side;
	Square() {}
	
	public void setData(float x) 
	{
		side=x;
		
	}
	public void showData() 
	{
		System.out.println("Area of square :" +side*side);
		
	}
}

public class ShowShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Rectangle r=new Rectangle();
		r.setData(10.5f, 45.5f);
		r.setData(10,60);
		r.showData();
		
		Square s=new Square();
		s.setData(5);
		s.showData();
	}

}
