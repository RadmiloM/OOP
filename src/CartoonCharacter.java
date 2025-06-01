public class CartoonCharacter {

    private String name;
    private int age;
    private String species;

    public CartoonCharacter(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public CartoonCharacter() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return this.species;
    }

    public void introduce() {
        System.out.println("name: " + this.name + " " + "age: " + this.age + " " + "species: " + this.species);
    }

    @Override
    public String toString() {
        return "CartoonCharacter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}
