package patterns.part1;

public class NumberHalfPyramid {
	public static void main(String[] args) {
		int n = 4;

		for(int line = 1; line <= n; line++) {
			for(int num = 1; num <= line; num++) {
				System.out.print(num + " ");
			}
			
			System.out.println();
        }
	}
}

/*
Print the following pattern:

1
1 2
1 2 3
1 2 3 4
 */