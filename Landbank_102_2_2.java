import java.io.IOException;

public class Landbank_102_2_2 {
	public static int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) throws IOException {
		Landbank_102_2_2 a = new Landbank_102_2_2();
		a.sort(1);
		for (int i = 0; i < a.A.length; i++)
			System.out.print(a.A[i * 2 % 9]);
	}

	public void sort(int i) {
		if (i < A.length - 1) {
			if (A[i + 1] > A[i]) {
				int C = A[i];
				A[i] = A[i + 1];
				A[i + 1] = C;
			}
			sort(i + 1);
		}
	}
}