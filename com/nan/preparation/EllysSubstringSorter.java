package com.nan.preparation;

/**
 * Problem Statement
    	Elly has a String S of uppercase letters and a magic device that can modify the string. The strength of the device is an int L.


The device does the following: The user enters a 0-based index i such that 0 <= i <= length(S)-L. 
The device then takes L letters of S, starting at index i, and puts these letters into alphabetical order.

Formally, the letters that get reordered are the letters S[i], S[i+1], and so on, until and including S[i+L-1].

For example, let S="TOPCODER" and let L=4. If the user chooses i=0, the selected substring will be "TOPC". 
These letters are rearranged into alphabetical order ("COPT") while the rest of the string remains unchanged ("....ODER"). 
Thus, the result would be the string "COPTODER". If the user were to choose i=2 instead, the resulting string would be "TOCDOPER". 
Here, "TO....ER" was left unchanged, and "PCOD" was changed into "CDOP".

Elly's magic device has a flaw: it can only be used once and then it self-destructs. 
You are given the String S and the int L described above. Return the lexicographically smallest string Elly can create by using 
the device exactly once.
 
Definition
    	
Class:	EllysSubstringSorter
Method:	getMin
Parameters:	String, int
Returns:	String
Method signature:	String getMin(String S, int L)
(be sure your method is public)
    
 
Notes
-	A string S1 is lexicographically smaller than a string S2 if S1 contains a smaller character than S2 at the first index where they differ.
 
Constraints
-	L will be between 2 and 50, inclusive.
-	S will contain between L and 50 characters, inclusive.
-	Each character of S will be an uppercase letter of the English alphabet ('A'-'Z').
 
Examples
0)	
    	
"TOPCODER"
4
Returns: "COPTODER"
The best we can do here is to sort the first 4 characters of the string.
1)	
    	
"ESPRIT"
3
Returns: "EPRSIT"
The best solution is obtained by choosing i=1, i.e., by sorting the letters in the substring "SPR".
2)	
    	
"AAAAAAAAA"
2
Returns: "AAAAAAAAA"
Sometimes sorting doesn't do anything.
3)	
    	
"ABRACADABRA"
5
Returns: "AAABCRDABRA"
4)	
    	
"BAZINGA"
6
Returns: "ABGINZA"
5)	
    	
"AAAWDIUAOIWDESBEAIWODJAWDBPOAWDUISAWDOOPAWD"
21
Returns: "AAAAAABDDDEEIIIJOOSUWWWWDBPOAWDUISAWDOOPAWD"

 *
 */
public class EllysSubstringSorter {

	public static void main(String[] args) {
		EllysSubstringSorter solution = new EllysSubstringSorter();
		System.out.println(solution.getMin("TOPCODER", 4));
		System.out.println(solution.getMin("ESPRIT", 3));
		System.out.println(solution.getMin("AAAAAAAAA", 2));
		System.out.println(solution.getMin("ABRACADABRA", 5));
		System.out.println(solution.getMin("BAZINGA", 6));
		System.out.println(solution.getMin("AAAWDIUAOIWDESBEAIWODJAWDBPOAWDUISAWDOOPAWD", 21));
	}

	public String getMin(String str, int i) {
		// Your solution goes here.
	}
}
