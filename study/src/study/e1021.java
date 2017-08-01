package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.concurrent.LinkedBlockingDeque;

public class e1021 {

    public e1021() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        LinkedList<Integer> deque = new LinkedList();
        int size = Integer.parseInt(st.nextToken());
        st.nextToken();

        int cnt = 0;

        //ÃÊ±âÈ­
        for(int i=size;i>0;i--){
            deque.addFirst(i);
        }

        st = new StringTokenizer(br.readLine(), " ");
        int buf;
        int dqSize,index;
        while(st.hasMoreTokens()){
            buf = Integer.parseInt(st.nextToken());
            index = deque.indexOf(buf);
            if(index == 0){
                deque.pollFirst();
                continue;
            }
            dqSize = deque.size();
            if(dqSize - index > index){
                while(index-->0){
                    deque.addLast(deque.pollFirst());
                    cnt++;
                }
                deque.pollFirst();
            }else{
                index = dqSize - index;
                while(index-->0){
                    deque.addFirst(deque.pollLast());
                    cnt++;
                }
                deque.pollFirst();
            }
        }
        System.out.println(cnt);
    }


    public static void main(String[] args) throws IOException {
        new e1021();
    }

}
