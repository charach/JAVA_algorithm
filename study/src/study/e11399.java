package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

public class e11399 {

    public e11399() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        ArrayList<Integer> array = new ArrayList<>();
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int count = 0;
        int countbuf = 0;

        while(st.hasMoreTokens()){
            array.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(array);

        Iterator<Integer> iterator = array.iterator();

        while(iterator.hasNext()){
            countbuf += iterator.next();
            count += countbuf;
        }

        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        new e11399();
    }

}
