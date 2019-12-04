package easy.multiples_of_3_and_5;

class MultiplesSolution implements Multiples {

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
     * Using the formula 1 + 2 + 3 + ... + n = n*(n+1)/2 instead of a code loop.
     * n is 3, 5, 15... it is step
     * <p>
     * p = limit / n
     * return n * (p * (p + 1)) / 2
     * <p>
     * Time Complexity: O(1)
     * Memory Space: O(1)
     */
    public int sum(int limit) {

        // Sum of all numbers <1000 divisible by 3
        int sum3 = limit / 3;

        // Sum of all numbers <1000 divisible by 5
        int sum5 = limit / 5;

        // Numbers divisible by 3 * 5 = 15 are counted double. Therefore we need to subtract these once
        int sum15 = limit / 15;

        int calc3 = 3 * sum3 * (sum3 + 1) / 2;
        int calc5 = 5 * sum5 * (sum5 + 1) / 2;
        int calc15 = 15 * sum15 * (sum15 + 1) / 2;

        return calc3 + calc5 - calc15;
    }
}
