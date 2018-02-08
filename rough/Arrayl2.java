package rough;

import java.util.ArrayList;

public class Arrayl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// TODO Auto-generated method stub
				// System.out.println(getSS("abc"));
				// System.out.println(getSSWAscii("ab"));
				// System.out.println(getPermutations("abc"));
				// System.out.println(getBoardPath(10, 0).size());
				// printSS("abc", "");
				// printSSWAscii("ab", "");
				// printPermutations("abc", "");
				//printBoardPath(10, 0, "");
		printLexicoSmaller("cab", "", "cab", false);
			}

			public static ArrayList<String> getSS(String str) {
				if (str.length() == 0) {
					ArrayList<String> baseResult = new ArrayList<>();
					baseResult.add("");
					return baseResult;
				}

				char cc = str.charAt(0);
				String ros = str.substring(1);
				ArrayList<String> myResult = new ArrayList<>();
				ArrayList<String> recResult = getSS(ros);

				for (int i = 0; i < recResult.size(); i++) {
					myResult.add(recResult.get(i));
					myResult.add(cc + recResult.get(i));
				}

				return myResult;
			}

			public static ArrayList<String> getSSWAscii(String str) {
				if (str.length() == 0) {
					ArrayList<String> baseResult = new ArrayList<>();
					baseResult.add("");
					return baseResult;
				}

				char cc = str.charAt(0);
				String ros = str.substring(1);
				ArrayList<String> myResult = new ArrayList<>();
				ArrayList<String> recResult = getSSWAscii(ros);

				for (int i = 0; i < recResult.size(); i++) {
					myResult.add(recResult.get(i));
					myResult.add(cc + recResult.get(i));
					myResult.add((int) cc + recResult.get(i));
				}

				return myResult;
			}

			public static ArrayList<String> getPermutations(String str) {
				if (str.length() == 0) {
					ArrayList<String> baseResult = new ArrayList<>();
					baseResult.add("");
					return baseResult;
				}

				char cc = str.charAt(0);
				String ros = str.substring(1);
				ArrayList<String> myResult = new ArrayList<>();
				ArrayList<String> recResult = getPermutations(ros);
				for (int i = 0; i < recResult.size(); i++) {
					String recString = recResult.get(i);
					for (int j = 0; j <= recString.length(); j++) {
						String myString = recString.substring(0, j) + cc + recString.substring(j);
						myResult.add(myString);
					}
				}

				return myResult;
			}

			public static ArrayList<String> getBoardPath(int end, int current) {
				if (current == end) {
					ArrayList<String> baseResult = new ArrayList<>();
					baseResult.add("");
					return baseResult;
				}
				if (current > end) {
					ArrayList<String> baseResult = new ArrayList<>();
					return baseResult;
				}
				ArrayList<String> recResult = null;
				ArrayList<String> myResult = new ArrayList<>();
				for (int i = 1; i <= 6; i++) {
					recResult = getBoardPath(end, current + i);
					for (int j = 0; j < recResult.size(); j++) {
						myResult.add(i + recResult.get(j));
					}
				}

				return myResult;
			}

			public static void printSS(String str, String result) {
				if (str.length() == 0) {
					System.out.println(result);
					return;
				}

				char cc = str.charAt(0);
				String ros = str.substring(1);
				printSS(ros, result);
				printSS(ros, result + cc);
			}

			public static void printSSWAscii(String str, String result) {
				if (str.length() == 0) {
					System.out.println(result);
					return;
				}

				char cc = str.charAt(0);
				String ros = str.substring(1);
				printSSWAscii(ros, result);
				printSSWAscii(ros, result + cc);
				printSSWAscii(ros, result + (int) cc);
				;
			}

			public static void printPermutations(String str, String result) {
				if (str.length() == 0) {
					System.out.println(result);
					return;
				}

				for (int i = 0; i < str.length(); i++) {
					char cc = str.charAt(i);
					String ros = str.substring(0, i) + str.substring(i + 1);
					printPermutations(ros, result + cc);
				}

			}

			public static void printBoardPath(int end, int curr, String result) {
				if (curr == end) {
					System.out.println(result);
					return;
				}
				if (curr > end) {
					return;
				}
				for (int i = 1; i <= 6; i++) {
					printBoardPath(end, curr + i, result + i);
				}
			}
			public static void printLexicoSmaller(String str, String result, String orig, boolean smaller) {
				  
				if (str.length()==0) {
					for(int j=0;j<result.length();j++)
				    if(result.charAt(j)<orig.charAt(j))
							{System.out.println(result);
							return;}
							
				    else 
				    	return;
				}
						for (int i = 0; i < str.length(); i++) {
							char cc = str.charAt(i);
							String ros = str.substring(0, i) + str.substring(i + 1);
							
							printLexicoSmaller(ros, result + cc,orig,false);
						}

			} 
		}
