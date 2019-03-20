import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindInPartiallySortedMatrixTest {

    FindInPartiallySortedMatrix findInPartiallySortedMatrix;

    @Before
    public void before() throws Exception {
        findInPartiallySortedMatrix = new FindInPartiallySortedMatrix();
    }

    @Test
    public void test1() throws Exception {
        int[][] matrix = null;
        Assert.assertEquals(false, findInPartiallySortedMatrix.find(matrix, 1,1,0));
    }

    @Test
    public void test2() throws Exception {
        int[][] matrix = {{1, 2, 8, 9},{2, 4, 9, 12},{4, 7, 10, 13},{6, 8, 11, 15}};
        int rows = matrix.length, columns = matrix[0].length;
        Assert.assertEquals(false,findInPartiallySortedMatrix.find(matrix, rows, columns, 20));
        Assert.assertEquals(false,findInPartiallySortedMatrix.find(matrix, rows, columns, -1));
        Assert.assertEquals(false,findInPartiallySortedMatrix.find(matrix, rows, columns, 5));
    }

    @Test
    public void test3() throws Exception {
        int[][] matrix = {{1, 2, 8, 9},{2, 4, 9, 12},{4, 7, 10, 13},{6, 8, 11, 15}};
        int rows = matrix.length, columns = matrix[0].length;
        Assert.assertEquals(true,findInPartiallySortedMatrix.find(matrix, rows, columns, 7));
    }

}