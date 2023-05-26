//Ceiling of a number in a sorted array = smallest element in array greater than or equal to the number
/* if arr=[2,3,5,9,14,16] and the number is 11 then the ceiling is 14 and if number is 9 then ceiling is 9 */

import java.util.Scanner;

public class Ceiling_in_array {
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

        int index= ceiling(arr,element);
        if(index==-1){
            System.out.println("ceiling does not exists");
        }
        else{
            System.out.println("ceiling at index "+index+" is "+arr[index]);
        }
    }

static int ceiling(int[] arr,int element){
        int start=0;
        int end=arr.length-1;

        //This condition is executed when element is greater than the largest element of the array
        if(element>arr[arr.length-1]){
            return -1;
        }

        while(start<=end){
            int mid=start+ (end-start)/2;
            if(element==arr[mid]){   //if the element is present in the array the ceiling will be the number itself
                return mid;
            }
            else if(element<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start; //this is returned when while loop breaks i.e. start becomes greater than end

    }
}
