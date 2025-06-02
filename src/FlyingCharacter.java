public class FlyingCharacter extends CartoonCharacter {


    public FlyingCharacter(String name, int age, String species) {
        super(name, age, species);
    }

    public FlyingCharacter() {

    }

    @Override
    public void fight() {
        System.out.println(this.getName() + " is fighting flying above Earth");
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " is speaking like boss ");
    }
}
