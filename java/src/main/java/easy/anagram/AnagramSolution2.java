package easy.anagram;

import java.util.HashMap;
import java.util.Map;

class AnagramSolution2 implements Anagram {

    /*

        Scroll to bottom only after implementing your own solution :)


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->


        ->

     */

    /**
     * It is very popular solution as well. HashMap - most of developers thinking about this firstly.
     * It is much better than {@link AnagramSolution1}.
     * <p>
     * Time Complexity: O(n).
     * Memory Space: O(1), we ignore Map size because it has constant size - ASCII Table is 256.
     */
    public boolean isAnagram(String textOne, String textTwo) {

        if (textOne == null || textTwo == null || textOne.length() != textTwo.length()) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();

        char[] charArrayOne = textOne.toLowerCase().toCharArray();
        char[] charArrayTwo = textTwo.toLowerCase().toCharArray();

        for (int i = 0; i < charArrayOne.length; i++) {

            int char1 = charArrayOne[i];
            int char2 = charArrayTwo[i];

            putToMap(char1, map);
            putToMap(char2, map);
        }

        return map.isEmpty();
    }

    // It is just sample, implementation how you use Map, is up to you.
    private static void putToMap(int key, Map<Integer, Integer> map) {
        Integer value = map.get(key);
        if (value == null) {
            map.put(key, 1);
        } else {
            map.remove(key);
        }
    }
}
