package algorithm2;

import java.util.Arrays;
import java.util.Scanner;

public class Oct25th {
	//내용변경
	static void swap(int[]a,int idx1,int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
		System.out.println(a[idx2]+"와 "+a[idx1]+"를 교환");
	}
	//첫과끝자리바꾸기
	static void reverse(int[]a) {
		for(int i=0;i<a.length/2;i++) {
			System.out.println(Arrays.toString(a));
			swap(a,i,a.length-i-1);
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("요솟수: ");
		int num=in.nextInt();
		
		int[]x=new int[num];
		for(int i=0;i<num;i++) {
			System.out.println("x["+i+"]:");
			x[i]=in.nextInt();
		}
		reverse(x);
		System.out.println("역순정렬~~");
		System.out.println("x= "+Arrays.toString(x));
	}
}
