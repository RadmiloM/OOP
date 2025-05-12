public class Rectangle {

    private Double width;
    private Double height;

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.width) + 2 * (this.height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.2,3.4);
        Rectangle rectangleSecond = new Rectangle(4.11,3.8);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}
