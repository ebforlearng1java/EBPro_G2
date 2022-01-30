package co.jp.chapter02;

public class Kicker {
	
	public static int []megerArray(int[]left,int[]right) {
	     int [] meger = new int[left.length+right.length];
	     for(int i= 0;i<left.length;i++) {
	    	 meger[i] = left[i];
	    	 
	    	 
	     }
	     for(int j =0;j<right.length;j++) {
	    	 meger[j+left.length] = right[j];
	    	 
	     }
	     return meger;
	}
	  
}
