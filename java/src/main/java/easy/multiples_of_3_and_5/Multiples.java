package easy.multiples_of_3_and_5;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * <p>
 * Implement your own solution in {@link MultiplesCodding} and test with {@link MultiplesUnitTest}
 * Then, check correct answer in {@link MultiplesSolution}
 */
interface Multiples {
    int sum(int limit);
}
