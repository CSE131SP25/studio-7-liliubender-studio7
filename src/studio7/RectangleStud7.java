package studio7;

public class RectangleStud7 {

	private int length;
	private int width;
	private int area;
	private int perimeter;
	
	public RectangleStud7(int initLength, int initWidth) {
		length = initLength;
		width = initWidth;
		area = length*width;
		perimeter = 2*length + 2*width;
	}
	
	public boolean square() {
		if(length == width) {
			return true;
		}else {
			return false;
		}
	}
	public int RectArea() {
		area = length * width;
		return area;
	}
	
	public int RectPerimeter() {
		perimeter = 2*length + 2*width;
		return perimeter; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		RectangleStud7 r1 = new RectangleStud7(7,8);
		RectangleStud7 r2 = new RectangleStud7(5,5);
		
		System.out.println("Rectangle 1: Length- " + r1.length + ",Width- " + r1.width + ",Area- " + r1.area + ",Perimeter- " + r1.perimeter );
		System.out.println("Rectangle 1: Length- " + r2.length + ",Width- " + r2.width + ",Area- " + r2.area + ",Perimeter- " + r2.perimeter );
		
		System.out.println("If a Square???");
		
		if (r1.square() == true) {
			System.out.println("Rectangle 1: " + r1.square());
		} else {
			System.out.println("Rectangle 1: " + r1.square());}
		
		if (r2.square() == true) {
			System.out.println("Rectangle 2: " + r2.square());
		} else {
			System.out.println("Rectangle 2: " + r2.square());}
			
			
		if(r1.RectArea() > r2.RectArea()) {
			System.out.println("Rectangle 1 is larger than rectangle 2");
		}else if (r2.RectArea() > r1.RectArea()) { 
		System.out.println("Rectangle 2 is larger than rectangle 1");
		
	}
	}
}
