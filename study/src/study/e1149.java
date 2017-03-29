package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* r = 1 g = 2 b = 3*/
public class e1149 {
    int minValue = 99999999;
    int valueBuf = 0;
    public e1149() throws IOException{

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine()," ");

        House rootHouse = new House(st.nextToken(),st.nextToken(),st.nextToken());
        House houseBuf = rootHouse;

        while(count -->1){
            st = new StringTokenizer(br.readLine()," ");
            houseBuf.nextHouse = new House(st.nextToken(),st.nextToken(),st.nextToken());
            houseBuf = houseBuf.nextHouse;
        }

        for(int i=1;i<=3;i++){
            rootHouse.color = i;
            findMinValue(rootHouse,rootHouse.value[i-1]);
        }

        System.out.println(minValue);


    }
    public void findMinValue(House house,int value){

        if(house.nextHouse != null){
            if(value>minValue)
                return;
            if(house.color == 1){

                house.nextHouse.color = 2;
                findMinValue(house.nextHouse,value+house.nextHouse.value[1]);
                house.nextHouse.color = 3;
                findMinValue(house.nextHouse,value+house.nextHouse.value[2]);

            }else if(house.color == 2){

                house.nextHouse.color = 1;
                findMinValue(house.nextHouse,value+house.nextHouse.value[0]);
                house.nextHouse.color = 3;
                findMinValue(house.nextHouse,value+house.nextHouse.value[2]);

            }else{

                house.nextHouse.color = 1;
                findMinValue(house.nextHouse,value+house.nextHouse.value[0]);
                house.nextHouse.color = 2;
                findMinValue(house.nextHouse,value+house.nextHouse.value[1]);

            }
        }else{
             if(value<minValue)
                 minValue = value;
             else
                 return;
        }
    }


    public static void main(String[] args) throws NumberFormatException, IOException{
        new e1149();
    }
}
class House{
    int color;
    int value[] = new int[3];
    House nextHouse;
    public House(String rvalue, String gvalue, String bvalue) {
        super();
        this.value[0] = Integer.parseInt(rvalue);
        this.value[1] = Integer.parseInt(gvalue);
        this.value[2] = Integer.parseInt(bvalue);
    }

}

