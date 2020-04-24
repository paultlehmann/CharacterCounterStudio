import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterSet = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word(s):");
        String inputWord = input.nextLine();
        input.close();

        for (char character : inputWord.toCharArray()) {
            if (!characterSet.containsKey(character)) {
                characterSet.put(character, 1);
            } else {
                characterSet.replace(character, characterSet.get(character)+1);
            }
        }

        ArrayList<Character> listOfCharacters = new ArrayList<Character>(characterSet.keySet());
        ArrayList<Integer> listOfCounts = new ArrayList<Integer>(characterSet.values());

        for (int i = 0; i < listOfCharacters.size(); i++) {
            System.out.println(listOfCharacters.get(i) + ": " + listOfCounts.get(i));
        }










    }
}
