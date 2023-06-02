import java.util.Arrays;

import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct_index=arr[i]-1;
            if(arr[i]!=arr[correct_index]){
                swap(arr,i,correct_index);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
