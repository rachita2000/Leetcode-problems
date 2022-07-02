package solved;
import java.util.*;
public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {

	public int maxArea(int h, int w, int[] horiCuts, int[] vertiCuts) {
        Arrays.sort(horiCuts);
        Arrays.sort(vertiCuts);
        int hl=horiCuts.length;
        int vl=vertiCuts.length;
        
        long hMax=Math.max(horiCuts[0]-0, h-horiCuts[hl-1]); 
        long vMax=Math.max(vertiCuts[0]-0, w-vertiCuts[vl-1]); 
        
        for(int i=0;i<hl-1;i++)
        {
            //System.out.println("hmax= "+hMax);
            hMax=Math.max(horiCuts[i+1]-horiCuts[i], hMax);
        }
        for(int i=0;i<vl-1;i++)
        {
            //System.out.println("vmax= "+vMax);
            vMax=Math.max(vertiCuts[i+1]-vertiCuts[i], vMax);
        }
        
        long ans=vMax*hMax;
        return (int)(ans%1000000007);
    }
}
