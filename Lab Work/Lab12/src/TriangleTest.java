public class TriangleTest {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(14.90, 18.50, 12.10);
        Triangle t3 = new Triangle(6.40, 8.70, 10.20);
        Triangle t4 = new Triangle(1.00, 1.00, 1.00);

        Triangle[] allTriangles = { t1, t2, t3, t4 };

        for (int i = 0; i < allTriangles.length; i++) {
            System.out.println(allTriangles[i].getInfo());
        }

        System.out.println();
        System.out.printf("Largest Initial Area: %.2f%n", Triangle.getLargestInitialArea());
    }

    public static Triangle copyTriangle(Triangle triangle) {
        return new Triangle(triangle.getSideA() * 2.0, triangle.getSideB() * 2.0, triangle.getSideC() * 2.0);
    }

}
