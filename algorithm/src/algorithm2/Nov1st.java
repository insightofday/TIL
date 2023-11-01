package algorithm2;

public class Nov1st {
	//알고리즘의 효율성문제
	//시간과 메모리,, 무엇을 택할 것이냐
	//예제는 단순 계산횟수로 측정
	
	
	//소수(솟수)만 출력하는 프로그램1(리팩토링 전2~n-1까지의 모든 자연수를 대상으로 나눗셈)
	public static void main(String[] args) {
		int counter=0;		//알고리즘의 비용을 책정하기 위한 변수
		for(int n=2;n<=1000;n++) {
			int i;
			for(i=2;i<n;i++) {
				counter++;
				if(n%i==0) {
					break;
				}
			}
			if(n==i) {
				System.out.println(n);
			}
		}
		System.out.println("나눗셈을 수행한 횟수: "+counter);
		
		
		//소수출력프로그램2(2~n-1의 소수로 나누어 떨어지는지 검증)
		counter=0;//나눗셈횟수
		int ptr=0;//찾은소수의갯수
		int[]prime=new int[500];//소수를저장하는배열
		
		prime[ptr++]=2;//최초의 소수는2
		
		for(int n=3;n<=1000;n+=2) {//3부터 시작해서 2씩 커지도록(4이상의 짝수는 무조건 합성수임)
			int i;
			for(i=1;i<ptr;i++) {
				counter++;
				if(n%prime[i]==0) {
					break;
				}
			}
				if(ptr==i) {
					prime[ptr++]=n;//배열에저장
				}
		}
				for(int i=0;i<ptr;i++) {
					System.out.println(prime[i]);
				}
				System.out.println("나눗셈을 수행한 횟수: "+counter);			
				
				
				
				
		//소수출력프로그램3
				//제곱근을 구하여 같은 검증을 삭제
				//예:2*50, 50*2는 같은데 굳이 여러 번 계산할 필요가 없음
		counter=0;
		ptr=0;
		prime=new int[500];
		prime[ptr++]=2;
		prime[ptr++]=3;//2와3은 소수임
		for(int n=5;n<=1000;n+=2) {
			boolean flag=false;
			for(int i=1;prime[i]*prime[i]<=n;i++) {
				counter+=2;//알고리즘비용책정을 위한 변수 counter에 곱셈과 나눗셈 두 가지 계산을 더해 저장
				if(n%prime[i]==0) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				prime[ptr++]=n;
				counter++;
			}
		}
		for(int i=0;i<ptr;i++) {
			System.out.println(prime[i]);
		}
		System.out.println("곱셈과 나눗셈을 수행한 횟수: "+counter);
		}
		
	}
	

