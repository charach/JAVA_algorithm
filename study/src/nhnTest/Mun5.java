package nhnTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Mun5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] ary = new int[3];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<ary.length;i++){
			ary[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = Integer.parseInt(br.readLine());
		ArrayList<Person> list = new ArrayList<>();
		ArrayList<Person> result = new ArrayList<>();
		while(cnt-->0){
			st = new StringTokenizer(br.readLine(), " ");	
			if(st.countTokens() == 3){
				list.add(new Person(st.nextToken(),st.nextToken()));
			}else{
				list.add(new Person(st.nextToken(),st.nextToken(),st.nextToken()));
			}
		}
		
		for(int i=0;i<3;i++){
			if(ary[i] == 1){
				if(i==0){
					
				}
				else if(i==1){
					
				}else{
					
				}
			}else if(ary[i] == 2){
				
			}else if(ary[i] == 3){
				
			}
		}
		
		
		br.readLine();
	}

}
class Person{
	char sex;
	int age;
	String dis;
	
	
	
	public Person(String sex, String age) {
		super();
		this.sex = sex.charAt(0);
		this.age = Integer.parseInt(age);
	}



	public Person(String sex, String age, String dis) {
		super();
		this.sex = sex.charAt(0);
		this.age = Integer.parseInt(age);
		this.dis = dis;
	}



	public String toSP(){
		if(dis != null){
			return sex+" "+age+" "+dis;
		}else{
			return sex+" "+age;
		}
	}
}
