import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Money:");
		int money = sc.nextInt();   // 145678
	
		int [] array = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		System.out.println("방 갯수 : " + array.length);
		
		for(int i = 0; i <array.length ; i++) {
			int mok = money / array[i]; //몫
			int na = money % array[i]; //나머지
			System.out.println(array[i] + "원 권: " + mok);
			money = na;
		}
	}
}
