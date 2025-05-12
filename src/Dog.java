public class Dog {

    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + this.name + '\'' +
                ", breed='" + this.breed + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog firstDog = new Dog("Pavel", "Sibirski haski");
        Dog secondDog = new Dog("John", "Terijer");
        System.out.println("Before name changes");
        System.out.println(firstDog.name);
        System.out.println(secondDog.name);
        firstDog.setName("Matija");
        secondDog.setName("Jovan");
        System.out.println("After name changes");
        System.out.println(firstDog.name);
        System.out.println(secondDog.name);
    }
}
