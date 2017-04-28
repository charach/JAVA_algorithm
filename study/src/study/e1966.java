package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e1966 {

    public e1966() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int queue[];
        int findPos,countLoop,i,j,index;
        boolean plag;
        StringTokenizer st;
        while(count-->0){
            // init Queue
            st = new StringTokenizer(br.readLine()," ");
            queue = new int[Integer.parseInt(st.nextToken())];
            findPos = Integer.parseInt(st.nextToken());
            index = 0;
            countLoop = 0;
            j = 1;

            st = new StringTokenizer(br.readLine(), " ");
            for(i=0;i<queue.length;i++)
                queue[i] = Integer.parseInt(st.nextToken());
            if(queue.length == 1){
                System.out.println(1);
                continue;
            }
            i = 0;
            while(queue[findPos] != 101){
                if(queue[index] != 101){
                    for(i=0;i<queue.length;i++){
                        j = (j >= queue.length-1?0:j+1);
                        if(queue[j] != 101 && queue[index] < queue[j]){
                            break;
                        }
                    }
                }
                if( i == queue.length && queue[index] != 101){
                    queue[index] = 101;
                    countLoop++;
                }
                index = (index == queue.length-1?0:index+1);
                j = (index == queue.length-1?0:index+1);
            }
            System.out.println(countLoop);
        }

    }


    public static void main(String[] args) throws NumberFormatException, IOException {
        new e1966();
    }

}
