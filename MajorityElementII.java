package solved;

import java.util.*;

public class MajorityElementII {

	 public List<Integer> majorityElement(int[] nums) {
	        List<Integer>ans=new ArrayList<>();
	        int num1=-1;
	        int num2=-1;
	        int count1=0;
	        int count2=0;
	        for(int i:nums){
	            if(i==num1)
	                count1++;
	            else if(i==num2)
	                count2++;
	            else if(count1==0){
	                num1=i;
	                count1=1;
	            }
	            else if(count2==0){
	                num2=i;
	                count2=1;
	            }else{
	                count1--;
	                count2--;
	            }
	        }
	        //checking if both numbers are really exist or not as majority or not
	        int check=0;
	        for(int i:nums){
	            if(i==num1){
	                check++;
	            }
	        }
	        if(check>nums.length/3)
	            ans.add(num1);
	        check=0;
	        for(int i:nums){
	            if(i==num2){
	                check++;
	            }
	        }
	         if(check>nums.length/3)
	             if(num1!=num2)
	            ans.add(num2);
	        return ans;
	    }
}
