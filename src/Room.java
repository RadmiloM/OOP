import java.util.ArrayList;
import java.util.List;

public class Room {

    private String name;
    private double area;
    private int numberOfWindows;
    private List<Furniture> furnitures;

    public Room(String name, double area, int numberOfWindows) {
        this.name = name;
        this.area = area;
        this.numberOfWindows = numberOfWindows;
        this.furnitures = new ArrayList<>();
    }

    public void addfurniture(Furniture furniture) {
        this.furnitures.add(furniture);
    }

    public void listFurniture() {
        for (Furniture furniture : this.furnitures) {
            System.out.println(furniture);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }

    public void describeRoom() {
        System.out.println("Generic room described");
    }

}
