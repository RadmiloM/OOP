import java.util.Arrays;

public class House {

    private String address;
    private int numberOfRooms;
    private Room[] rooms;
    private static int index = 0;


    public House(String address, int numberOfRooms) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.rooms = new Room[20];
    }

    public void addRoom(Room room) {
        this.rooms[index++] = room;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }

    public void showAllRooms() {
        for(int i =0; i < this.rooms.length;i++){
            System.out.println(this.rooms[i]);
        }
    }

    public static void main(String[] args) {
        House house = new House("Skitnicka",34);
        System.out.println(house);
        house.addRoom(new Room("Something",22.3,4));
        house.addRoom(new Room("Other",22.3,4));
        house.addRoom(new Room("Third",22.3,4));
        house.showAllRooms();

    }
}
