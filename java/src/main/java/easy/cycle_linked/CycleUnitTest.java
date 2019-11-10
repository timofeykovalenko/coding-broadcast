package easy.cycle_linked;

import org.junit.Assert;
import org.junit.Test;

public class CycleUnitTest {

    private Cycle solution = new CycleSolution();
    // TODO Uncomment it to check your solution
    // private Cycle solution = new CycleCodding();

    @Test
    public void testCycleTrueOne() {

        CycleItem item1 = new CycleItem();
        CycleItem item2 = new CycleItem();
        CycleItem item3 = new CycleItem();
        CycleItem item4 = new CycleItem();
        CycleItem item5 = new CycleItem();
        CycleItem item6 = new CycleItem();
        CycleItem item7 = new CycleItem();

        item1.next = item2;
        item2.next = item3;
        item3.next = item4;
        item4.next = item5;
        item5.next = item6;
        item6.next = item7;
        item7.next = item2; // cycle, item7 pointed to item2

        Assert.assertTrue(solution.isCycle(item1));
    }

    @Test
    public void testCycleTrueShort() {

        CycleItem item1 = new CycleItem();
        CycleItem item2 = new CycleItem();

        item1.next = item2;
        item2.next = item1;// cycle, item2 pointed to item1

        Assert.assertTrue(solution.isCycle(item1));
    }

    @Test
    public void testNull() {
        Assert.assertFalse(solution.isCycle(null));
    }

    @Test
    public void testCycleFalseOne() {

        CycleItem item1 = new CycleItem();
        CycleItem item2 = new CycleItem();
        CycleItem item3 = new CycleItem();
        CycleItem item4 = new CycleItem();
        CycleItem item5 = new CycleItem();
        CycleItem item6 = new CycleItem();
        CycleItem item7 = new CycleItem();

        item1.next = item2;
        item2.next = item3;
        item3.next = item4;
        item4.next = item5;
        item5.next = item6;
        item6.next = item7; // no cycle

        Assert.assertFalse(solution.isCycle(item1));
    }

    @Test
    public void testCycleFalseTwo() {
        CycleItem item1 = new CycleItem();
        Assert.assertFalse(solution.isCycle(item1));
    }
}
