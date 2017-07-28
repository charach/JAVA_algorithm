package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
    push_front X: 정수 X를 덱의 앞에 넣는다.
    push_back X: 정수 X를 덱의 뒤에 넣는다.
    pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    size: 덱에 들어있는 정수의 개수를 출력한다.
    empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
    front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.

 * @author "SukHwanYoon"
 *
 */
public class e10866 {

    public e10866() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String strBuf;
        SukDeq sukDeq = new SukDeq();
        while(cnt-->0){
            st = new StringTokenizer(br.readLine(), " ");
            strBuf = st.nextToken();
            if(st.countTokens() == 1){
                if(strBuf.equals("push_front")){
                    sukDeq.pushFront(Integer.parseInt(st.nextToken()));
                }else{
                    sukDeq.pushBack(Integer.parseInt(st.nextToken()));
                }
            }else{
                if(strBuf.equals("pop_front")){
                    System.out.println(sukDeq.popFront());
                }else if(strBuf.equals("pop_back")){
                    System.out.println(sukDeq.popBack());
                }else if(strBuf.equals("size")){
                    System.out.println(sukDeq.size());
                }else if(strBuf.equals("empty")){
                    System.out.println(sukDeq.empty());
                }else if(strBuf.equals("front")){
                    System.out.println(sukDeq.front());
                }else if(strBuf.equals("back")){
                    System.out.println(sukDeq.back());
                }
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e10866();
    }

    class SukDeq{
        private SukNode firstNode;
        private SukNode lastNode;
        private int size;

        public SukDeq(){
            size = 0;
            firstNode = new SukNode();
            lastNode = new SukNode();
            lastNode.prevNode = firstNode;
            firstNode.nextNode = lastNode;
        }

        public void pushFront(int value){
            SukNode nodeBuf = new SukNode(value);
            nodeBuf.prevNode = firstNode;
            nodeBuf.nextNode = firstNode.nextNode;
            firstNode.nextNode.prevNode = nodeBuf;
            firstNode.nextNode = nodeBuf;
            size++;
        }

        public void pushBack(int value){
            SukNode nodeBuf = new SukNode(value);
            nodeBuf.nextNode = lastNode;
            nodeBuf.prevNode = lastNode.prevNode;
            nodeBuf.prevNode.nextNode = nodeBuf;
            lastNode.prevNode = nodeBuf;
            size++;
        }

        public int popFront(){
            if(size == 0){
                return -1;
            }else{
                int value = firstNode.nextNode.value;
                firstNode.nextNode = firstNode.nextNode.nextNode;
                firstNode.nextNode.prevNode = firstNode;
                size--;
                return value;
            }
        }

        public int popBack(){
            if(size == 0){
                return -1;
            }else{
                int value = lastNode.prevNode.value;
                lastNode.prevNode = lastNode.prevNode.prevNode;
                lastNode.prevNode.nextNode = lastNode;
                size--;
                return value;
            }
        }
        public int size(){
            return size;
        }

        public int empty(){
            return size == 0?1:0;
        }

        public int front(){
            if(size == 0){
                return -1;
            }else{
                return firstNode.nextNode.value;
            }
        }
        public int back(){
            if(size == 0){
                return -1;
            }else{
                return lastNode.prevNode.value;
            }
        }
    }
    class SukNode{
        int value;
        SukNode nextNode;
        SukNode prevNode;
        SukNode(){

        }
        SukNode(int value){
            this.value = value;
        }
    }
}
