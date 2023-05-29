//https://leetcode.com/problems/find-in-mountain-array/description/

public class SearchInMountain {
    public static void main(String[] args){
        int[] arr={8,9,10,14,16,11,10,7,5};
        int target=10;
        int peak=peakElement(arr);
        int firsthalf= orderAgnostic(arr,target,0,peak);
        int secondhalf=orderAgnostic(arr,target,peak+1,arr.length-1);
        if(firsthalf!=-1){
            System.out.println(firsthalf);
        }
        else{

            System.out.println(secondhalf);

        }

    }
    static int peakElement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
    static int orderAgnostic(int[] arr,int target,int start,int end){
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc=true){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return -1;

    }


}
