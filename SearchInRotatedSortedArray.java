package solved;

public class SearchInRotatedSortedArray {

	// O(log n) 
	public int search(int[] nums, int target)
	{
		int i=0;
		while(i<nums.length-1 && nums[i] <nums[i+1])
			i++;
		if(i!=nums.length-1)
		{
			int pivot=i+1;
			if(target>=nums[pivot] && target <nums[0])
				return binarySearch(nums, pivot, nums.length-1, target);
			return binarySearch(nums, 0, pivot-1, target);
		}
		return -1;
	}
	static int binarySearch(int[] nums, int i, int j, int target)
	{
		while(i<=j)
		{
			int mid= i+(j-i)/2;
			if(nums[mid]==target)
				return mid;
			else if(nums[mid] < target)
				i=mid+1;
			else 
				j=mid-1;
		}
		return binarySearch(nums, 0, nums.length-1, target);
	}
	/* O(n) 
	 public int search(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target))
                return map.get(target);
            map.put(nums[i], i);
        }
        return map.containsKey(target) ? map.get(target): -1;
    }
    */
}
