import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        int [] arrayA = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};
        Arrays.sort(arrayA);

        System.out.println("El nombre més petit del vector és: " + arrayA[0]);
        System.out.println("El nombre més gran del vector és: " + arrayA[arrayA.length-1]);
    }
}