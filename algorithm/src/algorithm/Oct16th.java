package algorithm;

import java.util.Scanner;

public class Oct16th {
	//네값의 최댓값을 구하는 max4 method
	static int max4(int a,int b, int c, int d) {
		int max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		if(d>max) max=d;
		
		return max;
	}
	//최솟값구하는 min4 method
	static int min4(int a,int b, int c, int d) {
		int min=a;
		if(b<min) min=b;
		if(c<min) min=c;
		if(d<min) min=d;
		
		return min;
	}
	
	//중앙값구하는 메서드
	static int avg (int a, int b, int c) {
		if((b>=a&&c<=a)||(b<=a&&c>=a))
			return a;
		else if((a>b&&c<b)||(a<b&&c>b))
			return b;
		else return c;
	}

	public static void main(String[] args) {
		System.out.println("minTest"+min4(0,2,1,4));
		System.out.println("MaxTest"+max4(0,1,2,3));

		//standard stream
		Scanner sc=new Scanner(System.in);
		sc.next();

	}

	//알고리즘: 어떤 문제를 해결하기 위한 절차로 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합
}
