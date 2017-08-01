package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class e5430 {

    public e5430() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String cmd;
        String eleBuf;
        LinkedList<Integer> list;
        StringTokenizer st;
        boolean flag;
        boolean errorFlag;
        while(cnt-->0){
            flag = false;
            errorFlag = false;
            cmd = br.readLine();
            br.readLine();
            list = new LinkedList<>();

            eleBuf = br.readLine();
            eleBuf = eleBuf.replace("[","");
            eleBuf = eleBuf.replace("]","");
            st = new StringTokenizer(eleBuf,",");

            while(st.hasMoreTokens()){
                list.add(Integer.parseInt(st.nextToken()));
            }

            for(int i=0;i<cmd.length();i++){
                if(cmd.charAt(i) == 'R'){
                    flag = !flag;
                }else{
                    if(list.size() == 0){
                        System.out.println("error");
                        errorFlag = true;
                        break;
                    }else if(flag == false){
                        list.pollFirst();
                    }else if(flag == true){
                        list.pollLast();
                    }
                }
            }
            if(errorFlag == false){
                System.out.print("[");
                if(!list.isEmpty()){
                    if(flag == false){
                        System.out.print(list.pollFirst());
                        while(!list.isEmpty()){
                            System.out.print(","+list.pollFirst());
                        }
                    }else{
                        System.out.print(list.pollLast());
                        while(!list.isEmpty()){
                            System.out.print(","+list.pollLast());
                        }
                    }
                }
                System.out.print("]\n");
            }


        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e5430();
    }

}
