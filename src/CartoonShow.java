import java.util.ArrayList;
import java.util.List;

public class CartoonShow {

    private String title;
    private String genre;
    List<CartoonCharacter> characters;

    public CartoonShow(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.characters = new ArrayList<>();
    }

    public boolean add(CartoonCharacter character) {
        if (!characters.contains(character)) {
            characters.add(character);
            return true;
        }
        return false;
    }

    public boolean remove(CartoonCharacter character) {
        if(characters.contains(character)) {
            characters.remove(character);
            return true;
        }
        return false;
    }

    public void displayAllCharacters() {
        for(CartoonCharacter character : characters) {
            System.out.println(character.getName());
            System.out.println(character.getAge());
            System.out.println(character.getSpecies());
        }
    }

    public List<CartoonCharacter> filterBySpecies(CartoonCharacter character) {
        List<CartoonCharacter> list = new ArrayList<>();
        for(CartoonCharacter ch : characters) {
            if(ch.getSpecies().equals(character.getSpecies())) {
                list.add(ch);
            }
        }
        return list;
    }

    @Override
    public String toString() {
        return "CartoonShow{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", characters=" + characters +
                '}';
    }

    public static void main(String[] args) {
        CartoonShow cartoonShow = new CartoonShow("Tom i Dzeri","Comedy");
        CartoonCharacter rabbit = new CartoonCharacter("Rabbit", 2, "Rab");
        cartoonShow.add(rabbit);
        System.out.println(cartoonShow);
        cartoonShow.add(rabbit);
        System.out.println(cartoonShow);
        CartoonCharacter tiger = new CartoonCharacter("Tiger", 4, "Tigr");
        CartoonCharacter tiger1 = new CartoonCharacter("Tiger", 4, "Tigr");
        cartoonShow.add(tiger);
        cartoonShow.add(tiger1);
        cartoonShow.displayAllCharacters();
        System.out.println(cartoonShow.filterBySpecies(tiger));
    }
}
