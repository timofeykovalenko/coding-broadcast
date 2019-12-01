package easy.cycle_linked;

class CycleSolution implements Cycle {

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
     * Floyd’s Cycle-Finding Algorithm.
     * <p>
     * Find more info in:
     * https://en.wikipedia.org/wiki/Cycle_detection
     * https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/
     * <p>
     * Time Complexity: O(n)
     * Memory Space: O(1)
     */
    public boolean isCycle(CycleItem item) {

        if (item == null) return false;

        CycleItem slow = item;
        CycleItem fast = item;

        while (true) {

            slow = slow.next;

            if (slow == null) {
                return false;
            }

            if (fast.next == null) {
                return false;
            } else {
                fast = fast.next.next;
            }

            if (fast == null) {
                return false;
            }

            if (slow == fast) {
                return true;
            }
        }
    }
}
