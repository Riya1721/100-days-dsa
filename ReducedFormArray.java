import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


//convert array into reduced form
// https://practice.geeksforgeeks.org/problems/convert-an-array-to-reduced-form1101/1
public class ReducedFormArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] nums= new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Reduced(nums,n);


    }

    static void Reduced(int[] arr,int n){
        int[] temp= arr.clone();
        Arrays.sort(temp);
        int k=0;
        Map<Integer,Integer> mapped= new HashMap<>();
        for(int i=0;i<n;i++){
            mapped.put(temp[i],k++);
        }

        for(int i=0;i<n;i++){
            arr[i]=mapped.get(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        }

    }

