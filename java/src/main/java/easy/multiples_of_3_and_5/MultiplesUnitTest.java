package easy.multiples_of_3_and_5;

import org.junit.Assert;
import org.junit.Test;

public class MultiplesUnitTest {

    private Multiples solution = new MultiplesSolution();
    // TODO Uncomment it to check your solution
    // private Multiples solution = new MultiplesCodding();

    @Test
    public void test() {
        Assert.assertEquals(233168, solution.sum(999));
    }
}
