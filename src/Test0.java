import java.util.Scanner;

public class Test0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력하세요: ");
		int su = sc.nextInt();
		
	    int hour = su / 3600;
		int seconds = su % 3600;
		int minuite = seconds / 60;
		seconds = seconds / 60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.", su, hour, minuite, seconds);
		
	}
	

}
