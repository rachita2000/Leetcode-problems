package solved;
import java.util.*;

  
 class NestedIterator implements Iterator<Integer> {

    Queue<Integer> q=new LinkedList<>(); 
    public NestedIterator(List<NestedInteger> nestedList) {
        helper(nestedList, q);
    }

    @Override
    public Integer next() {
        return q.remove();
    }

    @Override
    public boolean hasNext() {
        return !q.isEmpty();
    }
    
    private void helper(List<NestedInteger> list, Queue<Integer> q)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).isInteger())
                q.add(list.get(i).getInteger());
            else
                helper(list.get(i).getList(), q);
        }
    }
}

//This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
interface NestedInteger {

  // @return true if this NestedInteger holds a single integer, rather than a nested list.
   public boolean isInteger();

   // @return the single integer that this NestedInteger holds, if it holds a single integer
   // Return null if this NestedInteger holds a nested list
   public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return empty list if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}
public class FlattenNestedListIterator {

}
