package javabasic;

public class FabonacciSeries {

	public static void main(String[] args) {

		int cNo = 0;
		int pNo = 1;
		int c;

		for (int i = 0; i <= 10; i++) {
			System.out.print(cNo + " ");

			c = cNo + pNo;
			pNo = cNo;
			cNo = c;

		}
	}

}
