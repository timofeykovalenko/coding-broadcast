package easy.anagram;

import java.util.Arrays;

class AnagramSolution1 implements Anagram {

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
     * It is very popular solution but not the best.
     * <p>
     * Time Complexity: O(n log(n)) - because we use "quick sort".
     * Memory Space: O(1).
     */
    public boolean isAnagram(String textOne, String textTwo) {

        if (textOne == null || textTwo == null || textOne.length() != textTwo.length()) {
            return false;
        }

        char[] charArrayOne = textOne.toLowerCase().toCharArray();
        char[] charArrayTwo = textTwo.toLowerCase().toCharArray();

        Arrays.sort(charArrayOne);
        Arrays.sort(charArrayTwo);

        return Arrays.equals(charArrayOne, charArrayTwo);
    }
}
