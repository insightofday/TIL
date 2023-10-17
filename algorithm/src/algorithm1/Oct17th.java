package algorithm1;

public class Oct17th {
	//구조적프로그래밍의 제어흐름:반복, 선택, 순차
	
	//직각이등변삼각형
	static void triangleLB(int n) {
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		System.out.println();
	}
	//직각이등변2
	static void triangle2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("*");	
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//직각이등변3
	static void triangle3(int n) {
		for(int i=0;i<n;i++) {
			for(int k=0;k<=i;k++) {
	            System.out.print(" ");
		        }
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void triangle4(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		triangleLB(5);
		triangle2(5);
		triangle3(5);
		triangle4(3);
	}
}
