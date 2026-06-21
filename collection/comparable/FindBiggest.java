package collection.comparable;

public class FindBiggest {
	
	public static void main(String[] args) {
		
		
		int arr[] = {0,25,26,84};
		
		int biggest = arr[0];
		int secound = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>biggest) {
				secound=biggest;
				biggest = arr[i];
				
			}else if (arr[i]>secound && arr[i] != biggest) {
				secound =arr[i];
			}
		}
		System.out.println("biggest"+secound);
	}

}
