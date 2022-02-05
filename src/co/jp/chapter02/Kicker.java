package co.jp.chapter02;

public class Kicker {
	
//	public static int []megerArray(int[]left,int[]right) {
//	     int [] meger = new int[left.length+right.length];
//	     for(int i= 0;i<left.length;i++) {
//	    	 meger[i] = left[i];
//	    	 
//	    	 
//	     }
//	     for(int j =0;j<right.length;j++) {
//	    	 meger[j+left.length] = right[j];
//	    	 
//	     }
//	     return meger;
//	}
//	  
//}
//	質問６-２︓以下静的なメソッドを定義してください。 
////	1. メソッド名: subArray 
////	2. 引数１︓intの配列 array
////	3. 引数２︓開始のstartIndex 
////	4. 引数３︓⻑さlength 
////	5. 戻り値︓intの配列
////	6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
//	
////	回答:
//		public static int[]subArray(int[]array,int startIndex,int length){
//		startIndex = array[0];
//		length = array.length;
//		int []sub = {startIndex,startIndex+length};
//				
//		
//			
//		
//		return sub;
//				}
////	}
//	質問７︓以下静的なメソッドを定義してください。 
//	1. メソッド名︓trim 
//	2. 引数１︓charの配列
//	3. 戻り値︓charの配列 
//	4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
	
//	public static char []trim(char[]input) {
//		 char []output1 = new char[input.length-1];
//		 char []output2 = new char[input.length-1];
//		 char[]output3 = new char[input.length-2];
//	     if(input[0]== ' ' && input[input.length-1]!= ' ') {
//	    	 
//	    	 for(int i = 0;i>input.length;i++) {
//	    		
//	    	 
//	    		 output1[i]= input[i+1];
//	    	 }
//	    	 
//	    	 }
//	    
//	    	 if(input[input.length-1]==' '&& input[0]!= ' ') {
//	    		 
//	    	 
//	    		 for(int i = 0;i>input.length;i++) {
//	    			
//	    			 output2[i] = input[i];
//	    		 }
//	    		 
//	    		
//	    		 
//	    			 
//	    		 }
//	    	 if(input[input.length-1]==' ' && input[0]== ' ' ) {
//	    		 
//	    		 for(int i = 0;i>input.length;i++) {
//		    			
//	    			 output3[i] = input[i+1];
//	    		 }
//	    		 
//	    		 
//	    	 
//			
//	    	 }
//	    	 return output1;
//	    	 
//	    	 return output2;
//	    	 
//	    	 return output3;
//	    		 
//	    	 }
//}
//	質問８︓バブルソート⽤メソッドを作成してください。 
//	1. メソッド名︓bubbleSort 
//	2. 引数１︓intの配列
//	3. 戻り値︓ソート済みの配列
//	4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ い。
	
	public static int[]bubbleSort(int []input){
		for(int i=0;i<input.length;i++) {
			for(int j = 0;j<input.length-1;j++) {
				if(input[j]>input[j+1]) {
					int h = input[j];
					input[j]=input[j+1];
					input[j+1]=h;
					
					
				}
				
				
			}
			
		}
		return input;
		
		
	
		
		
	}
}
	
	    	 
	    		 
	    	 
	    	 
	     
	     
	     
		
	
	