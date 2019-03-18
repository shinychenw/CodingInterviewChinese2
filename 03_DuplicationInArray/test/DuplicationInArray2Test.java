import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DuplicationInArray2Test {

    DuplicationInArray2 duplicationInArray;

    @Before
    public void before() throws Exception {
        duplicationInArray = new DuplicationInArray2();
    }

    @Test
    public void test1() throws Exception {
        int nums[] = {0};
        int length = nums.length;
        Assert.assertEquals(-1, duplicationInArray.duplicate(nums, length));
    }

    @Test
    public void test2() throws Exception {
        int nums[] = {0,1,2};
        int length = nums.length;
        Assert.assertEquals(-1, duplicationInArray.duplicate(nums, length));
    }

    @Test
    public void test3() throws Exception {
        int nums[] = {2, 3, 5, 4, 3, 2, 6, 7};
        int length = nums.length;
        Assert.assertEquals(3, duplicationInArray.duplicate(nums, length));
    }

}