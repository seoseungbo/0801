import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1 ; i < 6 ; i++) {
		   for(int j = i ; j < i+5 ; j++ ) {
			   System.out.printf(j + "\t");
		   }
		     System.out.println();
	}
  }
}
