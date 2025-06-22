public class Bathroom extends Room {

    public Bathroom(String name, double area, int numberOfWindows) {
        super(name, area, numberOfWindows);
    }

    @Override
    public void describeRoom() {
        System.out.println("This is bathroom");
    }
}
