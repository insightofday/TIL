package algorithm2;

import java.util.Scanner;

public class Oct26th {
	//모듈화와 테스트를 위해 d를 매개변수로 받음
	static int cardConv(int x,int r, char[]d) {
		int digits=0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		
		for(int i=0;i<digits/2;i++) {
			char t=d[i];
			d[i]=d[digits-1-i];
			d[digits-1-i]=t;
		}
		return digits;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[]cno =new char[32];
		
		System.out.println("10진수를 기수 변환합니다");
		do {
			do {
				System.out.print("별환하는 음이 아닌 정수");
				no=sc.nextInt();
			}while(no<0);
			
			do {
				System.out.print("어떤 진수로 변환할까요?(2~36):");
				cd=sc.nextInt();
			}while(cd<2||cd>36);
			
			dno=cardConv(no,cd,cno);
			
			System.out.print(cd+"진수로");
			for(int i=0;i<dno;i++) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다");
			System.out.println("one more?1.yes 2.no");
			retry=sc.nextInt();
		}while(retry==1);
	}
}
