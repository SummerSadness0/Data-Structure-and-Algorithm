package SparseArray;

/**
 * @author summer
 * @date 2019-06-02 19:59
 */
public class SparseArray {
    public static void main(String[] args) {
        int[][] chess = new int[11][11];
        chess[1][2] = 1;
        chess[2][3] = 2;
        chess[4][5] = 2;
        System.out.println("原始的数组");
        for(int[] row : chess){
            for(int data: row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //二维数组转稀疏矩阵
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chess[i][j] != 0) {
                    count++;
                }
            }
        }
        int sparseArr[][] = new int[count + 1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = count;
        int cnt = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (cnt > count)
                    break;
                if (chess[i][j] != 0) {
                    cnt++;
                    sparseArr[cnt][0] = i;
                    sparseArr[cnt][1] = j;
                    sparseArr[cnt][2] = chess[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("得到稀疏矩阵为");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }
        System.out.println();

        //稀疏数组转换为二维数组
        int[][] chessArr = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i < sparseArr.length; i++) {
            chessArr[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        System.out.println();
        System.out.println("恢复后的二维数组");
        for (int[] row : chessArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

    }
}
