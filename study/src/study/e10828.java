package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e10828 {
    int size;
    int root;
    int stack[];
    public e10828() throws NumberFormatException, IOException {
        size = 0;
        root = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        stack = new int[10000];
        String operator;
        while(count-->0){
            st = new StringTokenizer(br.readLine(), " ");
            operator = st.nextToken();
            if(operator.equals("push")){
                stack[size++] = Integer.parseInt(st.nextToken());
            }else if(operator.equals("pop")){
                System.out.println(size==0?-1:stack[(size--)-1]);
            }else if(operator.equals("size")){
                System.out.println(size);
            }else if(operator.equals("empty")){
                System.out.println(size==0?1:0);
            }else{
                System.out.println(size==0?-1:stack[size-1]);
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e10828();
    }

}
