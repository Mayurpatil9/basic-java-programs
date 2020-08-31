class Rectangle{
	int length;
	int width;
	
	void insert(int l,int w){
		length=l;
		width=w;	
	}
	
	void display(){
		System.out.println("Area of rectangle:  "+length*width);
	}

}

class TestRectangle{
	public static void main(String [] args){
	
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle();
		Rectangle r3=new Rectangle();
		
		r1.insert(100,50);
		r2.insert(200,150);
		r3.insert(300,250);
		
		r1.display();
		r2.display();
		r3.display();
	
	}
}