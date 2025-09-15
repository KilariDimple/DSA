import java.util.*;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // Step 1: Store broken letters in a HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            char ch = brokenLetters.charAt(i);
            map.put(ch, 1);  // just store it with value 1
        }

        // Step 2: Split the sentence into words
        String[] words = text.split(" ");
        int count = 0;

        // Step 3: Check each word
        for (String word : words) {
            boolean canType = true;

            // Check each character of this word
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                // If this character is broken (present in HashMap)
                if (map.containsKey(c)) {
                    canType = false;
                    break;  // no need to check more, this word is invalid
                }
            }

            // If word is valid
            if (canType) {
                count++;
            }
        }

        return count; // Step 4: Return total count
    }
}
