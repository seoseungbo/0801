
public class Array {
	public static void main(String[] args) {
		
		
		int [] a = {10,50,44,56,29,30,9,48,84,92};
		int sum = ;
		double avg;
		int max;
		int min;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}	
				
		}
		System.out.println();
		System.out.print("배열원본:");
		
		for(int su : a) {
			System.out.printf("%d\t", su);
		}
		
		
	}
}
