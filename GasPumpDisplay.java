package gas.pump;

import java.util.*;

public class GasPumpDisplay {
	public GasPumpDisplay (int numberOfPosition){
		this.digits=numberOfPosition;
	}
	public void run() {
			max=stringMultiply(String.valueOf(MAX_DIGIT),digits);
			maximum=Integer.parseInt(max);
			ArrayList<Integer> elements=new ArrayList<Integer>();
			for(int i=0;i<=maximum;i++) {
				elements.add(i);
			}
			for(int j=0;j<elements.size();j++) {
			
			if(digitRange(j,MAX_DIGIT) && Integer.toString(j).length()==max.length()) {
			System.out.println(elements.get(j));
			}else if(digitRange(j,MAX_DIGIT) && Integer.toString(j).length()<max.length()) {
				System.out.println(stringMultiply(String.valueOf(0),max.length()-Integer.toString(j).length())+j);
			}}
	}
	
	public static String stringMultiply(String s, int n){
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < n; i++){
	        sb.append(s);
	    }
	    return sb.toString();
	}
	public static boolean digitRange(int x, int limit) {
		String number= Integer.toString(x);
		char[] digits=number.toCharArray();
		int[] test=new int[digits.length];
		boolean result=true;
		for(char c: digits) {
			if(Integer.parseInt(String.valueOf(c))>limit) {
				result=false;
			}
		}
		return result;
	}
	private String max;
	private int digits;
	private static final int MAX_DIGIT=4;
	private int maximum;
	}
