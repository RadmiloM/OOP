public class Kitchen extends Room{
    public Kitchen(String name, double area, int numberOfWindows) {
        super(name, area, numberOfWindows);
    }

    @Override
    public void describeRoom() {
        System.out.println("This is kitchen");
    }
}
