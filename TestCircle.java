public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of "+c1.getRadius()+" and area of "+c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of "+c2.getRadius()+" and area of "+c2.getArea());
        Circle c3 = new Circle(3.0, "xanh");
        System.out.println("The circle has radius of "+c3.getRadius()+" and area of "+c3.getArea());
        System.out.println("The circle has color of "+c3.getColor());
        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("The circle has radius of "+c4.getRadius());
        c4.setColor("cam");
        System.out.println("The circle has color of "+c4.getColor());
        Circle c5 = new Circle();
        System.out.println(c5.toString());

    }
}
