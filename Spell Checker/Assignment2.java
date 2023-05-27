package Lab;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;

public class Assignment2 {
	public static void main(String[] ags) throws FileNotFoundException{
		Scanner scf = new Scanner(new File("Dictionary.txt"));
		Scanner scl = new Scanner(new File("Letters.txt"));
		
		HashSet<Character> let = new HashSet<Character>();
		HashSet<String> set = new HashSet<String>();
		while (scf.hasNextLine()) {
			String l = scf.next();
			set.add(l);
		}
		while (scl.hasNextLine()) {
			String l2 = scl.next();
			char l3 = l2.charAt(0);
			let.add(l3);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.next();
		
		System.out.println(check(set,let,s));
	}
	public static ArrayList<String> check(HashSet<String>set , HashSet<Character>let, String s) {
		ArrayList<String> arr = new ArrayList<String>();
		Iterator<Character> it = let.iterator();
		StringBuilder st = new StringBuilder(s);
		
		if(set.contains(s)) {
			arr.add(s);
		}
		else {
			for (int i=0 ; i<=st.length()-1 ; i++) {				
				st.deleteCharAt(i);
				String s5 = st.toString();
				st = new StringBuilder(s);
				
				if (set.contains(s5)) {
					if (arr.contains(s5)) {
						continue;
					}
					else {
						arr.add(s5);
					}
				}
			}
			st = new StringBuilder(s);
			int count = 0;
			String s6 ;
			for (int i=0 ; i<=st.length()-1 ; i++) {
				
				if (count==1) {
					i--;
					st.deleteCharAt(i);
					s6 = st.toString();
					i++;
					st = new StringBuilder(s);
					count = 0;
				}
				else {
					st.deleteCharAt(i);
					s6 = st.toString();
					count ++;
				}
				if (set.contains(s6)) {
					if (arr.contains(s6)) {
						continue;
					}
					else {
						arr.add(s6);
					}
				}
			}
			st = new StringBuilder(s);
			for (int i=0 ; i<=st.length()-1 ; i++) {
				
				while (it.hasNext()){
					st = new StringBuilder(s);
					char str = it.next();
					st.setCharAt(i, str);
					String s7 = st.toString();
					if(set.contains(s7)) {
						arr.add(s7);
					}
				}
			}
		}
		return arr;
	}
}
