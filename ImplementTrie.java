package solved;

public class ImplementTrie{
	
}
class TrieNode{
    char data;
    boolean isWord;
     TrieNode children[];
     public TrieNode( char data){
             this.data=data;
             this.isWord=false;
             this.children=new TrieNode[26];
     }
}
class Trie {
     private TrieNode root;
 public Trie() {
     root=new TrieNode('\0');
 }
 
 public void insert(String word) {
     insert(word, root);
 }
 private void insert(String word, TrieNode root)
 {
         if(word.length()==0)
         {
                 root.isWord=true;
                 return;
         }
         
         int childIdx=word.charAt(0)-'a';
         TrieNode child=root.children[childIdx];
         if(child==null)
         {
                 child=new TrieNode(word.charAt(0));
                 root.children[childIdx]=child;
         }
         insert(word.substring(1), child);
 }
 public boolean search(String word) {
     return search(word, root);
 }
 private boolean search(String word, TrieNode root) {
     if(word.length()==0)
     {
             return root.isWord;
     }
         int childIdx=word.charAt(0)-'a';
         TrieNode child=root.children[childIdx];
         if(child==null)
         {
                 return false;
         }
         return search(word.substring(1), child);
 }
 public boolean startsWith(String word) {
     return startsWith(word, root);
 }
     private boolean startsWith(String word, TrieNode root) {
     if(word.length()==0)
             return true;
             
         int childIdx=word.charAt(0)-'a';
         TrieNode child=root.children[childIdx];
         if(child==null)
         {
                 return false;
         }
         return startsWith(word.substring(1), child); 
 }
}