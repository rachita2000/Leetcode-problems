package solved;

public class MirrorReflection {

	 public int mirrorReflection(int p, int q) {
	        //Extension
	        int ext=q;
	        //Reflection
	        int ref=p;
	        
	        while(ext%2==0 && ref%2==0){
	            ext=ext/2;
	            ref=ref/2;
	        }
	        
	        if(ext%2==0 && ref%2!=0)
	            return 0;
	        
	        else if(ext%2!=0 && ref%2==0)
	            return 2;
	        
	        else if(ext%2!=0 && ref%2!=0)
	            return 1;
	        
	        return 0;
	    }
}
