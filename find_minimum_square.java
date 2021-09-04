package practic_dsa;


import java.util.Scanner;

public class Maths {
	//Find minimum squares
	static void swap(long a, long b) {
		a = a^b;
		b = a^b;
		a = a^b;
	}
	
	static int minsquare(long a, long b) {
		int res = 0;
		if(a<b) swap(a,b);
		while(b>0) {
			res += a/b;
			long rem = a%b;
			a = b;
			b = rem;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(minsquare(a,b));
	}
	

}
