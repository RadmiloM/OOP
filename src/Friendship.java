import java.util.ArrayList;
import java.util.List;

public class Friendship {

    private List<CartoonCharacter> characters;

    public Friendship() {
        this.characters = new ArrayList<>();
    }


    public void add(CartoonCharacter character) {
        if (!this.characters.contains(character)) {
            characters.add(character);
        }
    }

    public boolean remove(CartoonCharacter character) {
        if (characters.contains(character)) {
            characters.remove(character);
            return true;
        }
        return false;
    }

    public void displayAlLFriends() {
        for (CartoonCharacter character : this.characters) {
            System.out.println(character.getName());
            System.out.println(character.getAge());
            System.out.println(character.getSpecies());
        }
    }

    @Override
    public String toString() {
        return "Friendship{" +
                "characters=" + characters +
                '}';
    }

    public static void main(String[] args) {
        Friendship friendship = new Friendship();
        System.out.println(friendship.characters);
        CartoonCharacter picolo = new CartoonCharacter("Picolo", 3, "Alien");
        friendship.add(picolo);
        CartoonCharacter goku = new CartoonCharacter("Goku", 3, "Human");
        friendship.add(goku);
        friendship.displayAlLFriends();
        friendship.add(goku);
        System.out.println(friendship);
    }
}
