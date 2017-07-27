package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e10845 {

    public e10845() throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        SukQueue queue = new SukQueue();
        StringTokenizer st;
        String strBuf;
        while(cnt-->0){
            st = new StringTokenizer(br.readLine(), " ");
            if(st.countTokens() == 2){
                st.nextToken();
                queue.push(Integer.parseInt(st.nextToken()));
            }else{
                strBuf = st.nextToken();
                if(strBuf.equals("front")){
                    System.out.println(queue.front());
                }else if(strBuf.equals("back")){
                    System.out.println(queue.back());
                }else if(strBuf.equals("size")){
                    System.out.println(queue.size());
                }else if(strBuf.equals("empty")){
                    System.out.println(queue.empty());
                }else if(strBuf.equals("pop")){
                    System.out.println(queue.pop());
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        new e10845();
    }
}
class SukQueue{
    private int size;
    private SukNode headNode;
    public SukQueue(){
        size = 0;
        headNode = new SukNode();
    }
    public void push(int x){
        SukNode nodeBuf = headNode;
        while(nodeBuf.nextNode != null){
            nodeBuf = nodeBuf.nextNode;
        }
        nodeBuf.nextNode = new SukNode(x);
        size++;
    }
    public int pop(){
        if(size == 0){
            return -1;
        }else{
            size--;
            int value = headNode.nextNode.value;
            headNode.nextNode = headNode.nextNode.nextNode;
            return value;
        }
    }
    public int size(){
        return size;
    }
    public int empty(){
        return size == 0? 1:0;
    }
    public int front(){
        if(size == 0){
            return -1;
        }else{
            return headNode.nextNode.value;
        }
    }
    public int back(){
        if(size == 0){
            return -1;
        }else{
            SukNode nodeBuf = headNode;
            while(nodeBuf.nextNode != null){
                nodeBuf = nodeBuf.nextNode;
            }
            return nodeBuf.value;
        }
    }

}
class SukNode{
    int value;
    SukNode nextNode;
    public SukNode(){

    }
    public SukNode(int value){
        this.value = value;
    }
}
