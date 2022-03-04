package solved;

public class FindFirstAndLastPositionOfElementInSortedArray {

	public int[] searchRange(int[] nums, int target) {
        
        int[] ans=new int[2];
        ans[0]=binarysearch1(nums, 0, nums.length-1, target);
        ans[1]=binarysearch2(nums, 0, nums.length-1, target);
        return ans;
    }
    
    private int binarysearch1(int[] input, int i, int j, int target)
    {
        int ans=-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(input[mid]==target){
                ans= mid;
                j=mid-1;
            } 
            else if(input[mid]<target)
                i=mid+1;
            else 
                j=mid-1;
        }
        
        return ans;
    }
    private int binarysearch2(int[] input, int i, int j, int target)
    {
        int ans=-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(input[mid]==target){
                ans= mid;
                i=mid+1;
            } 
            else if(input[mid]<target)
                i=mid+1;
            else 
                j=mid-1;
        }
        
        return ans;
    }
}
