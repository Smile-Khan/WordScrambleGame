import java.util.*;

public class WordScrambleGame {

    // List of words
    private static final String[] WORD_LIST = {
        "python", "developer", "programming", "algorithm", "function", 
        "variable", "debugging", "compiler", "codechef", "machine", 
        "bitcoin", "operation"
    };

    // Function to scramble the letters of a word
    public static String scrambleWord(String word) {
        List<Character> characters = new ArrayList<>();
        
        // Convert word to a list of characters
        for (char ch : word.toCharArray()) {
            characters.add(ch);
        }

        // Shuffle the characters
        Collections.shuffle(characters);

        // Join all characters to form a scrambled word
        StringBuilder scrambled = new StringBuilder();
        for (char ch : characters) {
            scrambled.append(ch);
        }

        return scrambled.toString();
    }

    // Function to run the game
    public static void playGame() {
        Random random = new Random();

        // Pick a random word from the list
        String originalWord = WORD_LIST[random.nextInt(WORD_LIST.length)];

        // Scramble it
        String scrambled = scrambleWord(originalWord);

        // Print instructions
        System.out.println("\n🔠 Welcome to the Word Scramble Game! 🔠");
        System.out.println("Scrambled word: " + scrambled);

        // Optional: let user guess (for fun)
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the word: ");
        String guess = sc.nextLine();

        if (guess.equalsIgnoreCase(originalWord)) {
            System.out.println("🎉 Correct! The word was: " + originalWord);
        } else {
            System.out.println("❌ Wrong! The correct word was: " + originalWord);
        }
    }

    // Main method
    public static void main(String[] args) {
        playGame();
    }
}
