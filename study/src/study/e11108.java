package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class e11108 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int pcount;
        int startTime,duration,value,endTime,maxValue = 0;
        StringTokenizer st;
        ArrayList<Program> pary = new ArrayList<Program>();
        Program programBuf;
        while(count-->0){
            pcount = Integer.parseInt(br.readLine());
            while(pcount-->0){
                st = new StringTokenizer(br.readLine(), " ");
                startTime = Integer.parseInt(st.nextToken());
                duration = Integer.parseInt(st.nextToken());
                value = Integer.parseInt(st.nextToken());
                pary.add(new Program(startTime,startTime+duration,duration,value,((float)value/duration)));
            }
            value = 0;
            for(int i=0;i<pary.size();i++){
                value = pary.get(i).value;
                endTime = pary.get(i).endTime;
                pary.sort(new Comparator<Program>() {

                    @Override
                    public int compare(Program o1, Program o2) {
                        if(o1.startTime > o2.startTime){
                            return -1;
                        }else if(o1.startTime < o2.startTime){
                            return 1;
                        }else{
                            return 0;
                        }
                    }

                });
                for(int j=0;j<pary.size();j++){
                    programBuf = pary.get(j);
                    if(programBuf.startTime < endTime){
                        break;
                    }
                    value += programBuf.value;
                }
                if(value > maxValue){
                    maxValue = value;
                }
            }

            System.out.println(maxValue);
        }
    }

}
class Program{
    int startTime;
    int duration;
    int endTime;
    int value;
    float timeValue;
    Program(int startTime,int endTime,int duration,int value,float timeValue){
        this.startTime = startTime;
        this.duration = duration;
        this.endTime = endTime;
        this.value = value;
        this.timeValue = timeValue;
    }
}