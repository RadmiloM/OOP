public class CharacterActions extends CartoonCharacter {
    public CharacterActions(String name, int age, String species) {
        super(name, age, species);
    }

    public void run() {
        System.out.println(this.getName() + " " + "is running");
    }

    public void speak() {
        System.out.println(this.getName() + " is speaking");
    }

    public void fight() {
        System.out.println(this.getName() +" is in the battle");
    }

    public static void main(String[] args) {
        CharacterActions characterActions = new CharacterActions("Goku", 3, "Human");
        characterActions.run();
        characterActions.speak();
        characterActions.fight();
        CharacterActions otherCharacter = new CharacterActions("Krilin",4,"Human");
        otherCharacter.run();
    }
}
