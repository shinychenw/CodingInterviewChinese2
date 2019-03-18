import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DuplicationInArray1Test {

    DuplicationInArray1 duplicationInArray;

    @Before
    public void before() throws Exception {
        duplicationInArray = new DuplicationInArray1();
    }

    @Test
    public void test1() throws Exception {
        int nums[] = {0};
        int length = nums.length;
        Assert.assertEquals(false, duplicationInArray.duplicate(nums, length));
    }

    @Test
    public void test2() throws Exception {
        int nums[] = {0,1,2};
        int length = nums.length;
        Assert.assertEquals(false,duplicationInArray.duplicate(nums, length));
    }

    @Test
    public void test3() throws Exception {
        int nums[] = {2, 3, 1, 0, 2, 5, 3};
        int length = nums.length;
        Assert.assertEquals(true, duplicationInArray.duplicate(nums, length));
    }

}