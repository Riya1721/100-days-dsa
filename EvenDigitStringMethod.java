import java.util.Scanner;

import java.util.Scanner;
public class EvenDigitStringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int c = 0;
        for (int j = 0; j < n; j++) {
            String str = Integer.toString(nums[j]);
            if (str.length() % 2 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}
