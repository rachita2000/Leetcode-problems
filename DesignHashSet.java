package solved;


class MyHashSet {

    private boolean[] hash;
    private int capacity=(int) Math.pow(10,6)+1;
    public MyHashSet() {
        hash=new boolean[capacity];
    }
    
    public void add(int key) {
        hash[key]=true;
    }
    
    public void remove(int key) {
        hash[key]=false;
    }
    
    public boolean contains(int key) {
        return hash[key];
    }
}
public class DesignHashSet {

}
