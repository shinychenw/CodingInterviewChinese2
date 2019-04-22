import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @ClassName ReplaceSpacesTest
 * @Description TODO
 * @Author yuchenwang
 * @Date 2019-04-22 16:16
 * @Version 1.0
 **/
public class ReplaceSpacesTest {
    ReplaceSpaces replaceSpaces;

    @Before
    public void before() throws Exception {
        replaceSpaces = new ReplaceSpaces();
    }

    @Test
    public void testTrueAnswer() throws Exception {
        String str = "We are happy.";
        Assert.assertEquals("We%20are%20happy.", replaceSpaces.replaceBlank(str, 20));
    }

    @Test
    public void testNoSpace() throws Exception {
        String str = "Wearehappy.";
        Assert.assertEquals("Wearehappy.", replaceSpaces.replaceBlank(str, 20));
    }

    @Test
    public void testSpecial() throws Exception {
        String str1 = "Weare happy.";
        String str2 = "Weare   happy.";
        String str3 = null;
        String str4 = " ";

        Assert.assertEquals("Weare%20happy.", replaceSpaces.replaceBlank(str1, 20));
        Assert.assertEquals("Weare%20%20%20happy.", replaceSpaces.replaceBlank(str2, 20));
        Assert.assertEquals(null , replaceSpaces.replaceBlank(str3, 20));
        Assert.assertEquals("%20", replaceSpaces.replaceBlank(str4, 20));

    }
}
