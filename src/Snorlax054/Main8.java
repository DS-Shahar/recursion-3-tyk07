package Snorlax054;

public class Main8 {
	public static int sum(int n) //10
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n % 2 == 0)
		{
			return (int)(Math.pow(n, 2)) + sum(n-1);
		}
		return n*2 + sum(n-1);
	}
	public static double a(int n) //11
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n % 2 == 0)
		{
			return Math.sqrt(2*n-1)*(-1) + a(n-1);
		}
		return 2*n - 1 + a(n-1);
	}
	public static int mul(int n1, int n2, int i) //12
	{
		if(i < 1 || i >= n2)
		{
			return 0;
		}
		if(n1 % i == 0 && i < n2)
		{
			return i + mul(n1, n2, i+1);
		}
		return mul(n1, n2, i+1);
	}
	public static int sq(int a1, int a2, int n) //13.1
	{
		if(n == 0 && a1 > a2)
		{
			return a1;
		}
		if(n == 0 && a1 <= a2)
		{
			return a2;
		}
		if(a2 <= a1)
		{
			return sq(a1, (int)(Math.pow(a1, 2)) + (int)(Math.pow(a2, 2)), n-1);
		}
		return sq((int)(Math.pow(a1, 2)) + (int)(Math.pow(a2, 2)), a2, n-1);
	}
	public static int sq2(int a1, int a2, int n) //13.2
	{
		if(n == 0)
		{
			return a1 + a2;
		}
		if(a2 <= a1)
		{
			return a2 + sq2(a1, (int)(Math.pow(a1, 2)) + (int)(Math.pow(a2, 2)), n-1);
		}
		return a1 + sq2((int)(Math.pow(a1, 2)) + (int)(Math.pow(a2, 2)), a2, n-1);
	}
	public static int small(String x, int i) //21
	{
		if(i < 0 || i > x.length() - 1)
		{
			return 0;
		}
		if ("abcdefghijklmnopqrstuvwxyz".contains(Character.toString(x.charAt(i))))
		{
			return 1 + small(x, i-1);
		}
		return small(x, i-1);
	}
	public static String hash(String x, int i) //22
	{
		if(i < 0 || i > x.length() - 1)
		{
			return "";
		}
		if(i % 3 == 2)
		{
			return x.charAt(i) + "*" + hash(x, i+1);
		}
		return x.charAt(i) + hash(x, i+1);
	}
	public static String opp(String x, int i) //23
	{
		if(i < 0 || i > x.length() - 1)
		{
			return "";
		}
		return x.charAt(i) + opp(x, i-1);
	}
	public static void printBetween(char a, char b) //24
	{
		if(a == b)
		{
			System.out.print(a);
			return;
		}
		if(a > b)
		{
			System.out.print(b);
			printBetween(a, (char)(b+1));
			return;
		}
		System.out.print(a);
		printBetween((char)(a+1), b);
		return;
	}
	public static void div(int n, int i) //25
	{
		if(i < 1 || i > n)
		{
			return;
		}
		if(n % i == 0)
		{
			System.out.print(i + " ");
		}
		div(n, i+1);
		return;
	}
	public static void even(int n) //26
	{
		if(n == 0)
		{
			return;
		}
		if((n%10)%2 == 0)
		{
			System.out.print(n%10 + " ");
		}
		even(n/10);
		return;
	}
	public static void table(int i, int j) //27
	{
		if(j > 10)
		{
			return;
		}
		if(i > 10)
		{
			System.out.println();
			table(1, j+1);
			return;
		}
		System.out.print(i*j + " ");
		table(i+1, j);
		return;
	}
	public static void s(int a1, int d, int n) //28
	{
		if(n == 0)
		{
			return;
		}
		System.out.print(a1 + " ");
		s(a1+d, d, n-1);
		return;
	}
	public static void order(int a1, int n, int i) //29
	{
		if(n == 0)
		{
			return;
		}
		System.out.print(a1 + " ");
		order(a1+i, n-1, i+1);
		return;
	}
	public static void jumper(int a1, int n, int c) //30
	{
		if(n == 0)
		{
			return;
		}
		if(c % 2 != 0)
		{
			System.out.print(a1+ " ");
			jumper(a1-1, n-1, c+1);
			return;
		}
		System.out.print(a1 + " ");
		jumper(a1+2, n-1, c+1);
		return;
	}
	public static void evenIndex(int[] a, int i) //31
	{
		if(i < 0 || i > a.length - 1)
		{
			return;
		}
		if(i % 2 == 0)
		{
			System.out.print(a[i] + " ");
		}
		evenIndex(a, i-1);
		return;
	}
	public static void isBigger(int[] a, int i) //32
	{
		if(i < 1 || i > a.length - 1)
		{
			return;
		}
		if(a[i] > a[i-1])
		{
			System.out.print(a[i] + " ");
		}
		isBigger(a, i-1);
		return;
	}
	public static int check(int n) //42
	{
		if(n/10 == 0)
		{
			return n;
		}
		return check(helper(n));
	}
	public static int helper(int n) //42
	{
		if(n==0)
		{
			return 0;
		}
		return n%10 + helper(n/10);
	}
	public static void main(String[] args) {
		String username = "Snorlax054";
		int[] a = {2, 4, 5, 1, -4, 2, -7};
		System.out.println(sum(10));
		System.out.println(a(4));
		System.out.println(mul(8, 4, 1));
		System.out.println(sq(0, 1, 4));
		System.out.println(sq2(0, 1, 4));
		System.out.println(small(username, username.length()-1));
		System.out.println(hash(username, 0));
		System.out.println(opp(username, username.length()-1));
		printBetween('c', 'k');
		System.out.println();
		div(8, 1);
		System.out.println();
		even(2025);
		System.out.println();
		table(1, 1);
		s(2, 3, 5);
		System.out.println();
		order(1, 7, 1);
		System.out.println();
		jumper(4, 10, 1);
		System.out.println();
		evenIndex(a, a.length-1);
		System.out.println();
		isBigger(a, a.length-1);
		System.out.println();
		System.out.println(check(869419));
	}

}
