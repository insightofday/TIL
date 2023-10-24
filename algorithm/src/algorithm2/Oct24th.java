package algorithm2;

import java.util.Random;

public class Oct24th {
	static int maxOf(int[] a) {
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		//난수생성클래스
		Random r=new Random();
		int people=(int)(Math.random()*r.nextInt(100));
		System.out.println("사람수는 "+people+"명 입니다");
		System.out.println("===============");
		
		int[]height=new int[people];
		for(int i=0;i<people;i++) {
			//범위:100~189
			height[i]=100+r.nextInt(90);
			System.out.println(i+1+" 번째 사람의 키는..."+height[i]);
		}
		System.out.println("+++++++++");
		System.out.println("최댓값은.."+maxOf(height));
	}
}
