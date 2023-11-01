package algorithm2;

import java.util.Scanner;


public class Nov1st_2 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int no;
		int cd;
		int dno;
		char[]cno =new char[32];
		System.out.println("10진수를 기수변환합니다");

		do {
			System.out.println("양의정수");
			no=stdIn.nextInt();
			
		}while(no<0);
		do {
			System.out.println("몇진수?");
			cd=stdIn.nextInt();
			
		}while(cd<2||cd>36);
		// 배열은 참조변수기때문에 주소값을 복사한다(callbyValue아니고 callByReference)
		dno=cardConv(no,cd,cno);
		
		System.out.println(cd+"진수로 했을 때 결과");
		for(int i=0;i<dno;i++) {
			System.out.print(cno[i]);
		}
		System.out.println();
		//별찍기또하자
		star(13);
	}

	private static int cardConv(int x, int r, char[] d) {
		int digits=0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[digits++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		for(int i=0;i<digits/2;i++) {
			char t=d[i];
			d[i]=d[digits-i-1];
			d[digits-i-1]=t;
		}
		return digits;
	}
	static void star(int a) {
		for(int i=0;i<(a+1)/2;i++) {
			for(int j=a/2;j>i;j--) {
				System.out.print(" ");
			}
			if(i==0)System.out.print("*");
			for(int k=1;k<i*2+1;k++) {
				System.out.print("*");
			}
//			for(int j=a/2;j>i;j--) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
	}
}

