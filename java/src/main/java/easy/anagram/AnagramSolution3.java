package easy.anagram;

class AnagramSolution3 implements Anagram {

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
     * It is much better than {@link AnagramSolution1} and better than {@link AnagramSolution2} because we removed HashMap.
     * <p>
     * Time Complexity: O(n), we ignore second "for" because it has constant size.
     * Memory Space: O(1), we ignore CHARS_SIZE because it has constant size.
     */
    public boolean isAnagram(String textOne, String textTwo) {

        if (textOne == null || textTwo == null || textOne.length() != textTwo.length()) {
            return false;
        }

        int CHARS_SIZE = 256; // ASCII Table, we can use 56 if all letters are English

        char[] charArrayOne = textOne.toLowerCase().toCharArray();
        char[] charArrayTwo = textTwo.toLowerCase().toCharArray();

        int[] result = new int[CHARS_SIZE];

        for (int i = 0; i < charArrayOne.length; i++) {
            result[charArrayOne[i]]++;
            result[charArrayTwo[i]]--;
        }

        for (int i = 0; i < CHARS_SIZE; i++) {
            if (result[i] > 0) return false;
        }

        return true;
    }
}
