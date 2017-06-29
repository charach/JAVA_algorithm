package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class e5052 {

	public e5052() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n,i;
		String[] strAry;
		Trie trie;
		boolean flag;
		while(t-->0){
			n = Integer.parseInt(br.readLine());
			strAry = new String[n];
			trie = new Trie();
			flag = false;
			for(i=0;i<n;i++){
				strAry[i] = br.readLine();
			}
			Arrays.sort(strAry, new Comparator<String>() {
				@Override
				public int compare(String o1, String o2) {
					if(o1.length() > o2.length()){
						return 1;
					}else if(o1.length() == o2.length()){
						return 0;
					}else{
						return -1;
					}
				}
			});;
			for(i=0;i<n;i++){
				if(trie.insert(strAry[i]) == false){
					System.out.println("NO");
					flag = true;
					break;
				}
			}
			if(!flag){
				System.out.println("YES");
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		new e5052();
	}

}
class Trie{
	
	HashMap<Integer,Object> root;
	public Trie(){
		this.root = new HashMap<>();
	}
	
	public boolean insert(String str){
		HashMap<Integer,Object> mapBuf = root;
		String strBuf = str;
		int numBuf;
		while(strBuf.length() > 0){
			if(mapBuf.get(10) != null){
				return false;
			}
			numBuf = Character.getNumericValue(strBuf.charAt(0));
			if(mapBuf.get(numBuf) == null){
				mapBuf.put(numBuf, new HashMap<Integer,Object>());
			}
			mapBuf = (HashMap<Integer,Object>)mapBuf.get(numBuf);
			strBuf = strBuf.substring(1);
		}
		mapBuf.put(10, new ArrayList<Object>());
		return true;
	}
}
