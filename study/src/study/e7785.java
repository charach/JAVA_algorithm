package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class e7785 {
	String[] strBuf = new String[2];
	ArrayList<String> personMap = new ArrayList<String>();
	StringTokenizer st;
	
	public e7785(){
		int count;
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<count;i++){
			makeAry(sc.nextLine());
		}
		Collections.sort(personMap);
		Collections.reverse(personMap);
		
		Iterator<String> iterator = personMap.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	public void makeAry(String str){
		st = new StringTokenizer(str," ");
		strBuf[0] = st.nextToken();
		strBuf[1] = st.nextToken();
		if(strBuf[1].equals("leave")){
			personMap.remove(strBuf[0]);
		}else{
			personMap.add(strBuf[0]);
		}
	}

	public static void main(String[] args){
		new e7785();
	}
}
