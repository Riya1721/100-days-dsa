import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){
    int[] arr={4,5,8,2,7,9,6};
    selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int last=n-1-i;
            int max=getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMaxIndex(int[] arr,int start,int last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
               max=i;
            }
        }
        return max;

    }
    static void swap(int[] arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
