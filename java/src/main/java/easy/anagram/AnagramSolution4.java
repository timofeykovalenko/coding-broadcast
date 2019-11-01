package easy.anagram;

class AnagramSolution4 implements Anagram {

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
     * Exciting and awesome solution? :)
     * Time Complexity: O(n)
     * Memory Space: O(1)
     * <p>
     * Actually, it is the wrong solution. Because test will fail, try it and I am sure you will be surprised.
     * <p>
     * This is why:
     *              a: 0110 0001    b: 0110 0010
     *              e: 0110 0101    f: 0110 0110
     *              ---- ----       ---- ----
     *      xor:    0000 0100       0000 0100
     * <p>
     * The same for "aa", "bb", "cc", "dd" and etc.
     */
    public boolean isAnagram(String textOne, String textTwo) {

        if (textOne == null || textTwo == null || textOne.length() != textTwo.length()) {
            return false;
        }

        char[] charArrayOne = textOne.toLowerCase().toCharArray();
        char[] charArrayTwo = textTwo.toLowerCase().toCharArray();

        int result = 0;

        for (int i = 0; i < charArrayOne.length; i++) {
            result = result ^ charArrayOne[i]; // XOR
            result = result ^ charArrayTwo[i];
        }

        return result == 0;
    }
}
