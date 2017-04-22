package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class e5397 {

	public e5397() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        LinkedNode root;
        LinkedNode posBuf;
        LinkedNode nodeBuf;
        String stringBuf;
        while(count-->0){
        	root = new LinkedNode();
        	posBuf = root;
        	stringBuf = br.readLine();
        	for(int i=0;i<stringBuf.length();i++){
        		if(stringBuf.charAt(i) == '<'){
        			if(posBuf != root)
        				posBuf = posBuf.prev;
        			
        		}else if(stringBuf.charAt(i) == '>'){
        			if(posBuf.next != null)
        				posBuf = posBuf.next;
        			
        		}else if(stringBuf.charAt(i) == '-'){
        			if(posBuf != root){
        				posBuf.prev.next = posBuf.next;
        				if(posBuf.next != null){
        					posBuf.next.prev = posBuf.prev;
        				}
        				posBuf = posBuf.prev;
        			}
        		}else{
        			if(posBuf == root){
        				posBuf = new LinkedNode();
        				posBuf.value = stringBuf.charAt(i);
        				posBuf.prev = root;
        				posBuf.next = root.next;
        				if(root.next != null){
        					root.next.prev = posBuf;
        				}
        				root.next = posBuf;
        			}else if(posBuf.next == null){
        				posBuf.next = new LinkedNode();
        				posBuf.next.value = stringBuf.charAt(i);
        				posBuf.next.prev = posBuf;
        				posBuf = posBuf.next;
        			}else{
        				nodeBuf = new LinkedNode();
        				nodeBuf.value = stringBuf.charAt(i);
        				nodeBuf.prev = posBuf;
        				nodeBuf.next = posBuf.next;
        				posBuf.next.prev = nodeBuf;
        				posBuf.next = nodeBuf;
        				posBuf = nodeBuf;
        			}
        		}
        		
        	}
        	posBuf = root.next;
        	while(posBuf != null){
        		System.out.print(posBuf.value);
        		posBuf = posBuf.next;
        	}
        	System.out.println();
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e5397();
    }

}
class LinkedNode{
    char value;
    LinkedNode prev;
    LinkedNode next;
}