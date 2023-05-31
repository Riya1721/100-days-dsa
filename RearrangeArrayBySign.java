//https://leetcode.com/problems/rearrange-array-elements-by-sign/description/
import java.util.Arrays;
public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] nums = {-7, 2, -5, -9, 3, 4};
        int[] arr = rearrangeArray(nums);
        System.out.print(Arrays.toString(arr));
    }
    static int[] rearrangeArray(int[] nums) {
        int len=nums.length;
        int[] pos=new int[len/2];
        int[] neg=new int[len/2];
        int p=0;int n=0;
        for(int i=0;i<len;i++){
            if(nums[i]>=0){
                pos[p]=nums[i];
                p++;
            }
            else{
                neg[n]=nums[i];
                n++;
            }
        }
        p=0;n=0;
        for(int j=0;j<len;j++){
            if(j%2==0){
                nums[j]=pos[p];
                p++;
            }
            else{
                nums[j]=neg[n];
                n++;
            }

        }
        return nums;

    }
}

