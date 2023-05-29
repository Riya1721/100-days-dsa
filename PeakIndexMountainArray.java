//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class PeakIndexMountainArray {
    public static void main(String[] args){
        int[] arr={8,9,10,12,15,22,18,16,14,7};
        int peak=peakIndexInMountainArray(arr);
        System.out.println(peak);

    }

    static int peakIndexInMountainArray(int[] arr) {
            int start=0;
            int end=arr.length-1;
            while(start<end){
                int mid=start+(end-start)/2;
                if(arr[mid]<arr[mid+1]){
                    start=mid+1;
                }
                else if(arr[mid]>arr[mid+1]){
                    end=mid;

                }
            }
            return start;
        }
    }

