public class TrafficLight {
    private String color;
    private Double duration;


    public TrafficLight() {

    }

    public TrafficLight(String color, Double duration) {
        this.setColor(color);
        this.duration = duration;
    }

    public void setColor(String color) {
        if (color.equals("red") || color.equals("green") || color.equals("yellow")) {
            this.color = color;
            return;
        }
        System.out.println("You did not enter correct color");
    }

    public String getColor() {
        return this.color;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getDuration() {
        return this.duration;
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "color='" + color + '\'' +
                ", duration=" + duration +
                '}';
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.setColor("orange");
        System.out.println(trafficLight.getColor());
        trafficLight.setColor("green");
        System.out.println(trafficLight.getColor());
        TrafficLight newLight = new TrafficLight("red",22.3);
        System.out.println(newLight.getColor());
        newLight.setColor("purple");
    }


}
