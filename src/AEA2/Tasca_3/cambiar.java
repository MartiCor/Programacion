public class cambiar{
    public static void main(String[] args) {

        int [] [] matriu = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Elements de l amatriu: ");
        for (int i = 0; i < matriu.length; i++ ) {
            for (int j = 0; j < matriu[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    matriu [i][j] = 1;
                }
                if (i % 2 == 0 && j % 2 != 0) {
                    matriu [i][j] = 2;
                }
                if (i % 2 != 0 && j % 2 == 0) {
                    matriu [i][j] = 3;
                }
                if (i % 2 != 0 && j % 2 != 0) {
                    matriu [i][j] = 4;
                }
                System.out.print(matriu[i][j]);
            }
        System.out.println();
        }
    } 
}