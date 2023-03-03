import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class proj_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("введите число: ");
        int n = scan.nextInt();
        scan.close();

        List<Integer> nums = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                nums.add(i);
            }
        }
        String s = nums.toString().replace("[", "").replace("]", "");
        System.out.println("Число простых чисел равно: " + nums.size() + ", и они представляют: " + s);
    }
}
