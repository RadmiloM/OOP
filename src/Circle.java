public class Circle {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }
    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * (radius * radius);
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.2);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
    }
}
