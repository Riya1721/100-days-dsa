import java.util.Scanner;
public class Day1ReverseArray{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println("Array before reversing");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }

        rev(arr,0,n-1);

    }

    static void rev(int[] arr,int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Array after reversing");
        for (int j : arr) {
            System.out.print(j);
        }
    }
}