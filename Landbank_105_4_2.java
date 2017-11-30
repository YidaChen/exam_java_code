
public class Landbank_105_4_2 {

	public static void main(String[] args) {
		System.out.print(bin(4, 2));
	}
	static int bin(int n, int m) 
	{
		if(m == 0 || n == m)
			return 1;
		else
			return bin(n-1, m) + bin(n-1, m-1);
	}
}