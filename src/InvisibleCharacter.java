public class InvisibleCharacter extends CartoonCharacter {


    public InvisibleCharacter(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void fight() {
        System.out.println(this.getName() + " is fighting with real invisiblity");
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + "is speaking so well");
    }
}
