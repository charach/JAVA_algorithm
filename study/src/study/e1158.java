package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e1158 {
    int n;
    int m;
    int i;
    ElementNode root;
    e1158() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        root = new ElementNode(1);
        ElementNode nodeBuf = new ElementNode();
        root.next = nodeBuf;
        for(i=2;i<n;i++){
            nodeBuf.index = i;
            nodeBuf.next = new ElementNode();
            nodeBuf = nodeBuf.next;
        }
        nodeBuf.index = n;
        nodeBuf.next =root;


        System.out.print("<");
        deleteNode();
        System.out.print(">");
    }

    public void deleteNode(){
        ElementNode node = root;
        ElementNode nodeBuf = null;
        if(m != 1){
            while(n>1){
                    for(int i=0;i<this.m-1;i++){
                        if(i == this.m-2){
                            nodeBuf = node;
                            node = node.next;
                            continue;
                        }
                        node = node.next;
                    }
                    System.out.print(node.index+", ");
                    nodeBuf.next = node.next;
                    node = node.next;
                    n--;
            }
        }else{
            while(n>1){
                System.out.print(node.index+", ");
                nodeBuf = node;
                node = node.next;
                n--;
            }
        }
        System.out.print(node.index);
    }


    public static void main(String[] args) throws IOException {
        new e1158();
    }

}
class ElementNode{
    int index;
    ElementNode next;
    public ElementNode(){

    }
    public ElementNode(int index){
        this.index = index;
    }
}