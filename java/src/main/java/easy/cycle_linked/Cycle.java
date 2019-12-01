package easy.cycle_linked;

/**
 * Imagine a single linked list.
 * ItemOne -> ItemTwo -> ... . Each item has link to next item.
 * <p>
 * Problem: find a cycle in a sequence of iterated function values.
 * <p>
 * Implement your own solution in {@link CycleCodding} and test with {@link CycleUnitTest}
 * Then, check correct answer in {@link CycleSolution}
 */
interface Cycle {
    boolean isCycle(CycleItem item);
}
