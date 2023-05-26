import java.util.Scanner;

public class Floor_in_array {

//Floor of a number in a sorted array = greatest element in array less than or equal to the number
/* if arr=[2,3,5,9,14,16] and the number is 10 then the floor is 9 and if number is 9 then floor is 9 */


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element");
        int element = sc.nextInt();

        int index= flooring(arr,element);
        if(index==-1){
            System.out.println("floor does not exists");
        }
        else{
            System.out.println("ceiling at index "+index+" is "+arr[index]);
        }
    }

    static int flooring(int[] arr,int element){
        int start=0;
        int end=arr.length-1;
        //This condition is executed when element is smaller than the smallest element of the array
        if(element<arr[start]){
            return -1;
        }


        while(start<=end){
            int mid=start+ (end-start)/2;
            if(element==arr[mid]){
                return mid;
            }
            else if(element<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }
}
