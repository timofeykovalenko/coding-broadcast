package easy.anagram;

/**
 * Problem: write a function to check whether two given strings are anagram of each other or not. <br><br>
 * <p>
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * <a href="https://en.wikipedia.org/wiki/Anagram">What is anagram on Wikipedia</a> <br><br>
 * <p>
 * Examples: “abcd” and “dabc”, “listen” and “silent”, “triangle” and “integral”, “cat” and “act”- all are anagram
 * of each other. <br><br>
 * <p>
 * Implement your own solution in {@link AnagramCoding} and test with {@link AnagramTest}.
 */
interface Anagram {

    boolean isAnagram(String textOne, String textTwo);
}
