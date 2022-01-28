package co.jp.chapter06;

import java.util.Arrays;

public class JavaHomeWork06 {

	
	/*
	質問1.以下関数の修飾子、返却型、関数名、引数(引数の型・名称)を回答してくださ
	い。
	1 public static void main(String[] args);
	
	回答:
	修飾子: public static
	返却型: void(値なし)
	関数名: main
	引数:   
	 引数の型:  String
	 名称:      args	 
	*/

	/*
	質問2.配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼
	び出してください。

	回答:
	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3,4,5};
		
		int sum = sum(array);
		int min = min(array);
		int max = max(array);
		  
		System.out.println("sum: " + sum);
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}

	public static int max(int[] datas) {
		int max = datas[0];
 		for(int i=0; i< datas.length; i++) {
	 		if(max < i) {
		 	max = datas[i];
	        }
        }
		return max;
    }
		

	public static int min(int[] datas) {
		int min = datas[0];
 		for(int i = 0; i < datas.length; i++) {
	 		if(min > i) {
		 	min = datas[i];
	        }
        }
		return min;
	}

	public static int sum(int[] datas) {
		int sum = 0;
 		for(int i = 0; i < datas.length; i++) {
	 		
		 	sum += datas[i];
	        
        }
		return sum;
	}
	*/

	/*
	質問3.以下メソッドの実施結果を教えてください。
		public class Kicker {
		 private static void sayHello(String y) {
		    y = "Hello world";
		 }
		 public static void main(String args[]) {
		    String x = null;
		    sayHello(x);
		    System.out.println(x);
		 }
	
        }
    
    回答:null
	*/
		
	/*
	質問４︓以下メソッドの実施結果を教えてください。
		public class Kicker {
		 private static void fillArray(String[] array) {
		 array[0] = "value2";
		 }
		 public static void main(String args[]) {
		 String[] array = new String[]{"value1"};
		 fillArray(array);
		 System.out.println(array[0]);
		 }
		}
	
	回答:value2
	*/
	
	/*
    質問５︓以下メソッドの実施結果を教えてください。
    	public class Kicker {
		 private static void fillArray(String[] array) {
		 array = new String[]{"1", "2"};
		 }
		 public static void main(String args[]) {
		 String[] array = null;
		 fillArray(array);
		 System.out.println(array == null);
		 }
		}
	回答: true
	*/
    
	/*
    質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintしま
    す。以下メソッドを呼び出してください。
    
	回答:
	public static void main(String[] args) {

		String[] array = new String[] {};
		printArray(array);
		}
	
	public static void printArray(Object[] objs) {
		
		 if(objs == null) {
		 System.out.println("null");
		 return;
		 }
		 
		 String prefix = "";
		 StringBuilder sb = new StringBuilder();
		 sb.append("[");
		 for(Object obj : objs) {
		 sb.append(prefix);
		 sb.append(String.valueOf(obj));
		 prefix = ", ";
		 }
		 sb.append("]");
		 System.out.println(sb.toString());
		}
	
	*/
   
	/*
    質問6-1:以下静的なメソッドを定義してください。
    1. メソッド名: megerArray
	2. 引数1:intの配列 left
	3. 引数2:intの配列 right
	4. 戻り値:intの配列
	5. 処理内容:引数left と 引数right をマージして、新しい配列を作成して返却する。
	回答:
		   public static void main(String[] args) {
		  
	        int[] left = {1, 2, 3, 4};
	        int[] right= {5, 6, 7, 8};
	        
	        //调用printArray方法 
	    
	        printArray(mergerArray(left,right));
	        
	   }
	  
	  public static int[] mergerArray(int[] a, int [] b) {
		  int[] c = new int [a.length + b.length];
		  
		  for (int i = 0;i < a.length; i++) {
			  c[i] = a[i];	  
		  }
		  for (int j = 0; j < b.length; j++) {
			  c[a.length + j] = b[j];	  
		  }
		  for (int j = 0; j < c.length; j++) {
			  
		  }
		  return c;
	  }
	  public static void printArray(int[]  arr) {
	        for(int i:arr) {
	            System.out.print(i+ "  ");
	        }
	    }
	*/

	/*
	質問6-2:以下静的なメソッドを定義してください。
    1. メソッド名: subArray
	2. 引数1:intの配列 array
	3. 引数2:開始のstartIndex
	4. 引数3:⻑さlength
	5. 戻り値:intの配列
	6. 処理内容:startIndexからstartIndex + lengthまでサブ配列を取得する	
    
    
	回答:
	public static void main(String[] args) {
		
		int[] array = new int[] {1, 2, 3, 4};
	
		printArray(subArray(array,1,2));
	}


	
	public static int[] subArray(int[] array,int startIndex,int length) {
	        int result[] = new int[length];
	      
		  	for (int i = 0; i < length; i++) {
			 result[i] = array[startIndex + i];
		    }
		  	
		    return result;
	}
	
	public static void printArray(int[]  arr) {
	        for(int i:arr) {
	            System.out.print(i+ "  ");
	        }
	}

	
	*/

	/*
    質問7:以下静的なメソッドを定義してください。
	1. メソッド名:trim
	2. 引数1: charの配列
	3. 戻り値:charの配列
	4. 処理内容:引数1のcharの配列先頭と末尾の空白文字列を削除してください。
	
	回答:
	public static void main(String[] args) {
		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};	  
        char[] output= trim(input);
		
        System.out.println(Arrays.toString(output));
	}
	
	public static char[] trim(char[] array) {
		int begin = 0;
		int over = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] != ' ') {
				begin = i;
				break;
			}
		}
		for(int j = array.length-1;j >= 0; j--) {
			if(array[j]!= ' ') {
				over = j;
				break;
			}
			
		}
		
		char[] arr = new char[1 + over - begin];
		for(int k = begin; k <= over; k++) {
			arr[k-]=array[k];
		}
		return arr;
		
	}	
	*/
	
	/*
    質問8:バブルソート用メソッドを作成してください。
    1. メソッド名:bubbleSort
    2. 引数1:intの配列
    3. 戻り値:ソート済みの配列
    4. 処理内容:bubbleSortアルゴリズムを用い、入力した引数の配列をソートしてください。 
    
	回答:
		public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            
       
        }
        return arr;
        
    }
	*/

	/*
    質問9:メソッドの呼び出す練習。
    1. 質問6-1を用い、2つ配列をマージします。
    2. 質問8を用い、ステップ1のマージした配列をソートする。
    3. 注意:コードを1行にしてください。
    
	回答:
	
	*/
   

	public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {9, 6, 7, 8};
        //调用printArray方法
        printArray(bubbleSort(mergerArray(arr1,arr2)));

    }
	public static int[] mergerArray(int[] a, int [] b) {
		  int[] c = new int [a.length + b.length];
		  
		  for (int i = 0;i < a.length; i++) {
			  c[i] = a[i];	  
		  }
		  for (int j = 0; j < b.length; j++) {
			  c[a.length + j] = b[j];	  
		  }
		  for (int j = 0; j < c.length; j++) {
			  
		  }
		  return c;
	  }


	public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            
       
        }
        return arr;
        
    }



    public static void printArray(int[]  arr) {
      for(int i:arr) {
        System.out.print(i+ "  ");
      }
    }
	
	
	
	
	
	
	
}			 
	
	
	
		 
			 
