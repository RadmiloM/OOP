public class SuperCharacter extends CartoonCharacter {
    private String powerName;
    private int powerLevel;

    public SuperCharacter(String name, int age, String species, String powerName, int powerLevel) {
        super(name, age, species);
        this.powerName = powerName;
        this.powerLevel = powerLevel;
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " is speaking and has super power " + this.powerName);
    }

    @Override
    public void fight() {
        System.out.println(this.getName() + " is also fighting and his power level is" + this.powerLevel);
    }
}
