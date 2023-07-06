//https://leetcode.com/problems/missing-number/

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        int missing=missingNumber(nums);
        System.out.println(missing);
    }
    static int missingNumber(int[] nums) {

        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }

        return nums.length;
    }

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


}

