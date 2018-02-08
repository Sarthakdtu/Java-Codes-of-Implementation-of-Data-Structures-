package DynamicProgramming;

import java.util.ArrayList;

public class DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 30;
		int[][] strg = new int[N + 1][N + 1];
		// ComplexityDemos.startAlgo();
		// System.out.println(fib(N));
		// System.out.println("Fib Normal time " + ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(fibRS(N, strg));
		// System.out.println("Fib RS time " + ComplexityDemos.endAlgo());
		//
		// ComplexityDemos.startAlgo();
		// System.out.println(fibIS(N));
		// System.out.println("Fib IS time " + ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(cbp(N, 0));
		// System.out.println("cbp normal " + ComplexityDemos.endAlgo());
		//
		// ComplexityDemos.startAlgo();
		// System.out.println(cbpRS(N, 0, strg));
		// System.out.println("cbprs " + ComplexityDemos.endAlgo());
		//
		// ComplexityDemos.startAlgo();
		// System.out.println(cbpIS(N, 0));
		// System.out.println("cbpis normal " + ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(countMazePath(N, N, 0, 0));
		// System.out.println("cmp normal " + ComplexityDemos.endAlgo());

		// ComplexityDemos.startAlgo();
		// System.out.println(countMazePathRS(N, N, 0, 0, strg));
		// System.out.println("cmpRS " + ComplexityDemos.endAlgo());
		//
		// ComplexityDemos.startAlgo();
		// System.out.println(countMazePathIS(N, N, 0, 0));
		// System.out.println("cmpIS " + ComplexityDemos.endAlgo());

		String s1 = "abkbjcbhddjdncjdnjcddjcdjd", s2 = "agbbcncdjcj";
		// ComplexityDemos.startAlgo();
		// System.out.println(lcs(s1, s2));
		// System.out.println("LCS Recursion " + ComplexityDemos.endAlgo());
		//
		// ComplexityDemos.startAlgo();
		// System.out.println(lcsI(s1, s2));
		// System.out.println("LCS Iterative " + ComplexityDemos.endAlgo());

		//ComplexityDemos.startAlgo();
		System.out.println(editDistance(s1, s2));
	//	System.out.println("edit Distance Recursive " + ComplexityDemos.endAlgo());

		//ComplexityDemos.startAlgo();
		System.out.println(editDistanceI(s1, s2));
		//System.out.println("edit Distance Iterative " + ComplexityDemos.endAlgo());

	}

	public static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int fibnm1 = fib(n - 1);
		int fibnm2 = fib(n - 2);

		int fibn = fibnm1 + fibnm2;
		return fibn;
	}

	public static int fibRS(int n, int[] strg) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int fibnm1 = fibRS(n - 1, strg);
		int fibnm2 = fibRS(n - 2, strg);

		int fibn = fibnm1 + fibnm2;
		strg[n] = fibn;
		return fibn;
	}

	public static int fibIS(int n) {
		int[] strg = new int[n + 1];
		// seed
		strg[0] = 0;
		strg[1] = 1;

		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n];
	}

	public static int cbp(int end, int curr) {
		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + cbp(end, curr + dice);
		}

		return count;
	}

	public static int cbpRS(int end, int curr, int[] strg) {
		if (curr == end) {
			return 1;
		}

		if (curr > end) {
			return 0;
		}

		if (strg[curr] != 0) {
			return strg[curr];
		}

		int count = 0;
		for (int dice = 1; dice <= 6; dice++) {
			count = count + cbpRS(end, curr + dice, strg);
		}

		strg[curr] = count;

		return count;
	}

	public static int cbpIS(int end, int curr) {
		int[] strg = new int[end + 1];
		// seed
		strg[end] = 1;
		for (int i = end - 1; i >= 0; i--) {
			int sum = 0;
			for (int dice = 1; dice <= 6 && dice + i < strg.length; dice++) {
				sum = sum + strg[dice + i];
			}
			strg[i] = sum;
		}

		return strg[0];
	}

	public static int countMazePath(int er, int ec, int cr, int cc) {
		if (er == cr && ec == cc) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int count = 0;
		count = count + countMazePath(er, ec, cr, cc + 1);
		count = count + countMazePath(er, ec, cr + 1, cc);

		return count;
	}

	public static int countMazePathRS(int er, int ec, int cr, int cc, int[][] strg) {
		if (er == cr && ec == cc) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}
		int count = 0;
		count = count + countMazePathRS(er, ec, cr, cc + 1, strg);
		count = count + countMazePathRS(er, ec, cr + 1, cc, strg);
		strg[cr][cc] = count;
		return count;
	}

	public static int countMazePathIS(int er, int ec, int cr, int cc) {

		int[][] strg = new int[er + 1][ec + 1];
		strg[er][ec] = 1;

		for (int i = er; i >= 0; i--) {
			for (int j = ec; j >= 0; j--) {
				if (i == er || j == ec) {
					strg[i][j] = 1;
				} else {
					strg[i][j] = strg[i + 1][j] + strg[i][j + 1];
				}
			}
		}

		return strg[0][0];
	}

	public static int lcs(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int rv = 0;
		if (s1.charAt(0) == s2.charAt(0)) {
			rv = 1 + lcs(ros1, ros2);
		} else {
			int f1 = lcs(s1, ros2);
			int f2 = lcs(ros1, s2);
			rv = Math.max(f1, f2);
		}

		return rv;
	}

	public static int lcsI(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		// seed
		strg[s1.length()][s2.length()] = 0;
		for (int s1l = s1.length(); s1l >= 0; s1l--) {
			for (int s2l = s2.length(); s2l >= 0; s2l--) {
				if (s1l == s1.length() || s2l == s2.length()) {
					strg[s1l][s2l] = 0;
					continue;
				}
				if (s1.charAt(s1l) == s2.charAt(s2l)) {
					strg[s1l][s2l] = 1 + strg[s1l + 1][s2l + 1];
				} else {
					strg[s1l][s2l] = Math.max(strg[s1l + 1][s2l], strg[s1l][s2l + 1]);
				}
			}
		}

		return strg[0][0];
	}

	public static int editDistance(String s1, String s2) {
		if (s1.length() == 0) {
			return s2.length();
		}
		if (s2.length() == 0) {
			return s1.length();
		}
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int rv = 0;
		if (s1.charAt(0) == s2.charAt(0)) {
			rv = editDistance(ros1, ros2);
		} else {
			int f1 = 1 + editDistance(ros1, ros2);// replacement
			int f2 = 1 + editDistance(s1, ros2);// removal
			int f3 = 1 + editDistance(ros1, s2);// addition
			rv = Math.min(f1, Math.min(f2, f3));
		}
		return rv;

	}

	public static int editDistanceI(String s1, String s2) {
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		strg[s1.length()][s2.length()] = 0;
		for (int i = s1.length(); i >= 0; i--) {
			for (int j = s2.length(); j >= 0; j--) {
				if (i == s1.length()) {
					strg[i][j] = s2.length() - j;
					continue;
				}
				if (j == s2.length()) {
					strg[i][j] = s1.length() - i;
					continue;
				}

				if (s1.charAt(i) == s2.charAt(j)) {
					strg[i][j] = strg[i + 1][j + 1];
				} else {
					int f1 = 1 + strg[i + 1][j];
					int f2 = 1 + strg[i][j + 1];
					int f3 = 1 + strg[i + 1][j + 1];
					strg[i][j] = Math.min(f1, Math.min(f2, f3));

				}
			}
		}
		return strg[0][0];
	}
}



