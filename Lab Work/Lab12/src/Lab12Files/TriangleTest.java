
public class TriangleTest {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle(6.4, 8.7, 10.2);
		Triangle t3 = new Triangle(-2, -2, -2);
		
		System.out.println(t1.getInfo());
		System.out.println(t2.getInfo());
		System.out.println(t3.getInfo());
	}
	
}
