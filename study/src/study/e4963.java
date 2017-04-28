package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 섬으로 판명된 부분은 전부 0 으로.
public class e4963 {
    int width,height,count;
    int land[][];
    public e4963() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
         StringTokenizer st = new StringTokenizer(br.readLine()," ");
         width  = Integer.parseInt(st.nextToken());
         height = Integer.parseInt(st.nextToken());
         land = new int[height][width];
         if(height == 0 && width == 0){
             break;
         }
         for(int i=0;i<height;i++){
             st = new StringTokenizer(br.readLine(), " ");
             for(int j=0;j<width;j++){
                 land[i][j] = Integer.parseInt(st.nextToken());
             }
         }
         count = 0;
         checkIsLand();
         System.out.println(count);
        }
    }

    // Total Array check
    void checkIsLand(){
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(land[i][j] == 1){
                    recursionLand(i,j);
                    count++;
                }
            }
        }
    }

    void recursionLand(int verti,int hori){
        if(hori>=0 && hori<=width-1 && verti>=0 && verti<=height-1){
            land[verti][hori] = 0;
            if(hori-1>=0 && land[verti][hori-1] == 1)
                recursionLand(verti,hori-1);
            if(hori+1<width && land[verti][hori+1] == 1)
                recursionLand(verti,hori+1);
            if(verti-1>=0 && land[verti-1][hori] == 1)
                recursionLand(verti-1,hori);
            if(verti+1<height && land[verti+1][hori] == 1)
                recursionLand(verti+1,hori);
            if((hori-1>=0 && verti-1>= 0)  && land[verti-1][hori-1] == 1)
                recursionLand(verti-1,hori-1);
            if((hori-1>=0 && verti+1<height)  && land[verti+1][hori-1] == 1)
                recursionLand(verti+1,hori-1);
            if((hori+1<width && verti+1<height)  && land[verti+1][hori+1] == 1)
                recursionLand(verti+1,hori+1);
            if((hori+1<width && verti-1>= 0)  && land[verti-1][hori+1] == 1)
                recursionLand(verti-1,hori+1);

        }
    }
    public static void main(String[] args) throws IOException {
        new e4963();
    }

}
