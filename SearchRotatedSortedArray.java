public class SearchRotatedSortedArray {
    public static void main(String[] args){
     int[] nums={3,4,5,6,7,0,1,2};
     int target=2;
     int pivot=findpivot(nums);

    if(pivot==-1){
        System.out.println( binary(nums,target,0,nums.length-1));
    }
       if(nums[pivot]==target){
           System.out.println( pivot);

    }
       if(target>=nums[0]){
           System.out.println(binary(nums,target,0,pivot));
    }else {
           System.out.println( binary(nums, target, pivot + 1, nums.length - 1));
       }
}

    static int findpivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(start>=nums[mid]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int binary(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                end=mid;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }

        }
        return -1;
    }
}
