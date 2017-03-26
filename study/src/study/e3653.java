package study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e3653 {

	public e3653(){
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int haveMovie;
		int watchMovie;
		List<String> movieList;
		int findMovieNum;
		
		while(count-->0){
			movieList = new ArrayList();
			haveMovie = sc.nextInt();
			watchMovie = sc.nextInt();

			initList(movieList,haveMovie);
			
			while(watchMovie-->0){
				findMovieNum = sc.nextInt();
				findMovie(movieList,findMovieNum);
			}
			System.out.println();
			
		}
		
	}
	
	public void initList(List<String> movieList,int haveMovie){
		for(int i=1;i<=haveMovie;i++){
			movieList.add(i+"");
		}
	}
	public void findMovie(List<String> movieList,int findMovieNum){
		int index = movieList.indexOf(findMovieNum+"");
		String value = movieList.get(index);
		
		System.out.print(index+" ");
		if(index == 0){
			return;
		}else{
			movieList.remove(index);
			movieList.add(0, value);
		}
	}
	
	public static void main(String[] args) {
		new e3653();
	}
	
}