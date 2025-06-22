public class Bedroom extends Room {
    private boolean hasBalcony;

    public Bedroom(String name, double area, int numberOfWindows) {
        super(name, area, numberOfWindows);
        this.hasBalcony = false;
    }

    @Override
    public void describeRoom() {
        System.out.println("This is bedroom");
    }
}
