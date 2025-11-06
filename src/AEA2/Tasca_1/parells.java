public class parells {
    public static void main(String[] args){

        int[] arrayNum = new int[101];
        int mida = arrayNum.length;
        int i = 0;
        int num = 0;

        while (i <  mida) {
            if (num % 2 == 0) {
                arrayNum[i] = num;
                System.out.println(arrayNum[i]);
                i++;
            }
            num++;
        }
    }
}