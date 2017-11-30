
public class Landbank_105_3 {

	public static void main(String[] args) {
		int n = 3;
		hanoi(n, 'A', 'B', 'C');
	}
	static void hanoi(int n, char from, char buffer, char to) 
	{
		if(n == 1)
			System.out.println("Move disk "+n+" from "+from+" to "+to);
		else
		{
			hanoi(n-1, from, to, buffer);
			System.out.println("Move disk "+n+" from "+from+" to "+to);
			hanoi(n-1, buffer, from, to);
		}
	}
}