package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;



public class e9237 {

    public e9237() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int day = 1;
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        Collections.reverse(list);

        day += list.get(0);

        for(int i=1;i<list.size();i++){
            if(day < (i+1)+list.get(i)){
                day = (i+1)+list.get(i);
            }
        }

        System.out.println(day+1);
    }

    public static void main(String[] args) throws IOException {
        new e9237();
    }

}
