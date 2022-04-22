package solved;

import java.util.Arrays;

class MyHashMap {

    private int size=(int)Math.pow(10,6)+1;
    private int[] arr;
    public MyHashMap() {
        arr=new int[size];
        Arrays.fill(arr,-1);
    }
    
    public void put(int key, int value) {
        arr[key]=value;
    }
    
    public int get(int key) {
        return arr[key];
    }
    
    public void remove(int key) {
        arr[key]=-1;
    }
}
public class DesignHashMap {

}
