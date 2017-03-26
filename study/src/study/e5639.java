package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class e5639 {
	public static void fs(Node pnode,Node node){
		if(pnode.value > node.value){
			if(pnode.left != null){
				fs(pnode.left,node);
			}else{
				pnode.left = node;
				node.parent = pnode;
			}
		}else{
			if(pnode.right != null){
				fs(pnode.right,node);
			}else{
				pnode.right = node;
				node.parent = pnode;
			}
		}
	}
	public static void ps(Node pnode){
		if(pnode == null){
			return;
		}else{
			ps(pnode.left);
			ps(pnode.right);
			System.out.println(pnode.value);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Node rnode = new Node(sc.nextInt());
		while(sc.hasNext()){
			fs(rnode,new Node(sc.nextInt()));
		}
		ps(rnode);
		
	}
}
class Node{
	Node left;
	Node right;
	Node parent;
	int value;
	public Node(int value){
		this.value = value;
	}
}
