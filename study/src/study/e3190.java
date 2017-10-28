package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;

public class e3190 {
	int[][] ary;
	Map<Integer,Object> time;
	LinkedList<PosNode> snake;
	int second;
	// 0= 오른쪽, 1= 아래쪽 , 2 = 왼쪽 , 3= 위쪽, 4 = 과일
	int direct;
	public e3190() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ary = new int[n][n];
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				ary[i][j] = 5;
			}
		}
		
		StringTokenizer st;
		while(cnt-->0){
			st = new StringTokenizer(br.readLine(), " ");
			ary[Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1] = 4;
		}
		
		cnt = Integer.parseInt(br.readLine());
		time = new HashMap<Integer,Object>();
		while(cnt-->0){
			st = new StringTokenizer(br.readLine(), " ");
			time.put(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		
		simul();

	}
	
	public void simul(){
		second = -1;
		snake = new LinkedList<>();
		snake.add(new PosNode(0,0));
		ary[0][0] = 0;
		direct = 0;
		
		Iterator<PosNode> iterator;
		PosNode buf;
		PosNode add;
		boolean fruit;
		while(true){
			
			second++;
			//방향 체크
			if(time.get(second) != null){
				if(time.get(second).equals("D")){
					direct = direct == 3? 0:direct+1;
				}else{
					direct = direct == 0? 3:direct-1;
				}
			}
			iterator = snake.iterator();
			buf = iterator.next();
			
			add = new PosNode(snake.getLast().x,snake.getLast().y);
			

			if(ary[buf.x][buf.y] == 4){
				fruit = true;
			}else{
				fruit = false;
			}			
			
			ary[buf.x][buf.y] = direct;
			
			
			if(direct == 0){
				buf.y++;
			}else if(direct == 1){
				buf.x++;
			}else if(direct == 2){
				buf.y--;
			}else{
				buf.x--;
			}
			if(buf.x < 0 || buf.x >= ary.length || buf.y < 0 || buf.y >= ary[0].length || 
					ary[buf.x][buf.y] <= 3){
				System.out.println(second+1);
				break;
			}
			
			
			while(iterator.hasNext()){
				buf = iterator.next();
				if(ary[buf.x][buf.y] == 0){
					buf.y++;
				}else if(ary[buf.x][buf.y] == 1){
					buf.x++;
				}else if(ary[buf.x][buf.y] == 2){
					buf.y--;
				}else{
					buf.x--;
				}
			}
			
			if(fruit){
				snake.add(add);
			}else{
				ary[add.x][add.y] = 5;
				
			}
			
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		new e3190();
	}

}

class PosNode{
	int x;
	int y;
	PosNode(){
		
	}
	PosNode(int x,int y){
		this.x = x;
		this.y = y;
	}
}
