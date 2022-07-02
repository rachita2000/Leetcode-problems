package solved;

import java.util.Arrays;

public class MaximumUnits_on_a_Truck {
	public int maximumUnits(int[][] boxType, int truckSize) {
        Arrays.sort(boxType,(a,b)->{
           return b[1]-a[1]; 
        });
        
        int maxUnit=0;
    
        for(int i=0;i<boxType.length;i++){
            if(boxType[i][0]<=truckSize){
                maxUnit+=(boxType[i][1]*boxType[i][0]);
                truckSize-=boxType[i][0];
            }
            else if(truckSize>0){
                maxUnit+=boxType[i][1]*truckSize;
                break;
            }
        }
        return maxUnit;
    }
}
