import java.util.Scanner;
import java.util.Arrays;
public class KthSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //input of elements
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter array elements");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }


        System.out.println("Enter which small element you want");
        int k=sc.nextInt();
        int small= Small(arr,k);
        System.out.println("the"+k+"th smallest element is"+small);

    }

    static int Small(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];

    }
}
