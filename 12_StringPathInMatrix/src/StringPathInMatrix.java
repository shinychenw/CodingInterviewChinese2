/**
 * @ClassName StringPathInMatrix
 * @Description TODO
 * @Author yuchenwang
 * @Date 2019-04-24 16:52
 * @Version 1.0
 **/
public class StringPathInMatrix {
    public StringPathInMatrix() {
    }

    public boolean hasPath(char[][] matrix, int rows, int cols, char[] str) {
        if(matrix == null || rows <= 0 || cols <=0 || str == null){ return false;}
        if(str.length == 1){ return true; }
        boolean[][] visited = new boolean[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(findPath(matrix, rows, cols, i, j, 0, visited,  str)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findPath(char[][] matrix, int rows, int cols, int row, int col, int l, boolean[][] visited, char[] str) {
        if(row < 0 || cols < 0 || row >= rows || col >= cols || visited[row][col] || str[l] != matrix[row][col]) { return false;}
        if(l == str.length - 1){ return true;}
        visited[row][col] = true;
        if(findPath(matrix, rows, cols, row + 1, col, l + 1, visited, str )
                || findPath(matrix, rows, cols, row, col + 1, l + 1, visited, str)
                || findPath(matrix, rows, cols, row - 1, col, l + 1, visited, str)
                || findPath(matrix, rows, cols, row, col - 1, l + 1, visited, str)){
            return true;
        }
        visited[row][col] = false;
        return false;
    }
    public static void main(String[] args) {
        StringPathInMatrix stringPathInMatrix = new StringPathInMatrix();
        char[][] matrix = {{'a', 'b', 't', 'g'}, {'c', 'f', 'c', 's'}, {'j', 'd', 'e', 'h'}};
        char[] str1 = {'b', 'f', 'c', 'e'};
        char[] str2 = {'a', 'b', 'f', 'b'};
        boolean result = stringPathInMatrix.hasPath(matrix, 3, 4, str2);
        System.out.println(result);
    }
}
