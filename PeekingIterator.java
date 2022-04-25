package solved;
import java.util.*;
class PeekingIterator implements Iterator<Integer> {
    private List<Integer> list;
    private int flag;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    list=new ArrayList<>();
        flag=0;
        while(iterator.hasNext())
        {
            list.add(iterator.next());
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return list.get(flag);
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int res=list.get(flag);
        flag++;
        return res;
	}
	
	@Override
	public boolean hasNext() {
	    if(list.size()!=flag)
            return true;
        else
            return false;
	}
}
