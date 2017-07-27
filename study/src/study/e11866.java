package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e11866 {

    public e11866() throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new  StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        SukQueue queue = new SukQueue(m);
        for(int i=1;i<=n;i++){
            queue.push(i);
        }
        System.out.print("<");
        System.out.print(queue.pop());
        while(!queue.empty()){
            System.out.print(", "+queue.pop());
        }
        System.out.print(">");
    }

    public static void main(String[] args) throws IOException {
        new e11866();
    }
    class SukQueue{
        private int size;
        private SukNode headNode;
        private SukNode lastNode;
        private int m;
        public SukQueue(int m){
            size = 0;
            headNode = new SukNode();
            lastNode = headNode;
            this.m = m;
        }
        public void push(int x){
            if(size == 0){
                headNode.nextNode = new SukNode(x);
                lastNode = headNode.nextNode;
            }else{
                lastNode.nextNode = new SukNode(x);
                lastNode = lastNode.nextNode;
            }
            size++;
        }
        public int pop(){
            if(this.size == 1){
                size--;
                return headNode.nextNode.value;
            }
            SukNode nodeBuf;
            for(int i=1;i<m;i++){
                nodeBuf = headNode.nextNode;
                headNode.nextNode = headNode.nextNode.nextNode;
                lastNode.nextNode = nodeBuf;
                nodeBuf.nextNode = null;
                lastNode = nodeBuf;
            }
            int value = headNode.nextNode.value;
            headNode.nextNode = headNode.nextNode.nextNode;
            size--;
            return value;
        }
        public boolean empty(){
            return size == 0? true:false;
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
}
