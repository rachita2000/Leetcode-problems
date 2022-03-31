package solved;

public class ImplementstrStr {

	public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        if(haystack.contains(needle))
            return haystack.indexOf(needle);
        
        return -1;
    }
}
