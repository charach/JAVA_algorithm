package SWExpertAcadmy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SortBySuk {
	public static void main(String[] args){
		SortBySuk sort = new SortBySuk();
		int[] ary = makeAry();
		
		sort.Bubblesort(ary);
		
		System.out.println(checkAry(ary));
		
		ary = makeAry();
		
		sort.countSort(ary);
		
		System.out.println(checkAry(ary));
	}
	
	/**
	 * 버블 정렬
	 * @param ary
	 */
	public void Bubblesort(int[] ary){
		for(int i=ary.length-1;i>0;i--){
			for(int j=0;j<i-1;j++){
				if(ary[j] > ary[j+1]){
					int temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * 카운팅 정렬
	 * @param ary
	 */
	public void countSort(int[] ary){
		Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();
		
		for(int i=0;i<ary.length;i++){
			if(countMap.containsKey(ary[i]) == false){
				countMap.put(ary[i], 1);
			}else{
				countMap.put(ary[i], countMap.get(ary[i])+1);
			}
		}
		
		Set<Integer> keySet = countMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		int index = 0;
		int key;
		while(iterator.hasNext()){
			key = iterator.next();
			for(int i=0;i<countMap.get(key);i++){
				ary[index] = key;
				index++;
			}
		}
	}
	
	public static int[] makeAry(){
		int[] ary = new int[1000];
		for(int i=0;i<ary.length;i++){
			ary[i] = (int)Math.random() * 1000;
		}
		return ary;
	}
	public static boolean checkAry(int[] ary){
		for(int i=1;i<ary.length;i++){
			if(ary[i-1] > ary[i]){
				return false;
			}
		}
		return true;
	}
}
