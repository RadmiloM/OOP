import java.time.LocalTime;

public class Airplane {

    private String number;
    private String destination;
    private LocalTime departureTime;
    private Integer delayTime;

    public Airplane(String number, String destination, LocalTime departureTime) {
        this.number = number;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayTime = 0;
    }

    public void status() {
        if(delayTime == 0) {
            System.out.println("Airplaine is on time");
        } else {
            System.out.println("Airplaine is late " + delayTime);
        }
    }

    public String getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "number=" + number +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                '}';
    }
}
