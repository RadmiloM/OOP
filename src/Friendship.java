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
        System.out.println(friendship.remove(picolo));
        System.out.println(friendship);
        Friendship other = new Friendship();
        System.out.println(other);
    }
}
