public class FindInPartiallySortedMatrix {
    public boolean find(int[][] matrix, int rows, int columns, int number) {
        boolean flag = false;
        if(matrix!=null && rows>0 && columns>0) {
            int row = 0, column = columns-1;
            while(row<rows && column>=0) {
                if(matrix[row][column] == number){
                    flag = true;
                    break;
                }else if(matrix[row][column] > number){
                    column--;
                }else{
                    row++;
                }
            }
        }
        return flag;
    }

    public FindInPartiallySortedMatrix() {
    }
}
