//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPos {
    public static void main(String[] args){
        int[] nums={4,8,8,8,8,10,15,24};
        int target=8;
        int[] ans=new int[2];
        ans=searchRange(nums,target);
        for(int i=0;i<2;i++){
            System.out.println(ans[i]);
        }
}
    static int[] searchRange(int[] nums, int target) {
        int[] finalans={-1,-1};

        int start=search(nums,target,true);
        int last=search(nums,target,false);
        finalans[0]=start;
        finalans[1]=last;

        return finalans;
    }

    static int search(int[]nums, int target, boolean findFirst){
        int start=0;
        int end=nums.length-1;
        int ans=-1;

        while(start<=end){
            int mid=start+ (end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findFirst){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }

        return ans;
    }
}