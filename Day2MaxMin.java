import java.util.Scanner;
public class Day2MaxMin {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int max=  Max(arr,n);
        System.out.println("The maximum element is "+max);

        int min=Min(arr,n);
        System.out.println("The minimum element is "+min);
    }
    static int Max(int arr[], int n){
        int l=arr[0];
        for(int i=0;i<n;i++){
            if (arr[i]>l){
                l=arr[i];
            }
        }
        return l;
    }

    static int Min(int arr[], int n){
        int l=arr[0];
        for(int i=0;i<n;i++){
            if (arr[i]<l){
                l=arr[i];
            }
        }
        return l;
    }
}
