
public class Landbank_105_4_3 {

	public static void main(String[] args) {
		System.out.print(solve(4));
	}
	static int solve(int n) 
	{
		if(n == 1)
			return 0;
		
		return n*(n-1) + solve(n-1);
	}
}