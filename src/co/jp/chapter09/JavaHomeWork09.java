package co.jp.chapter09;

public class JavaHomeWork09 {

	public static void main(String[] args) {
		// 質問１︓以下ソースにラムダ式の使う場所を解釈してください。
		/*
		 * import java.awt.event.ActionEvent; 
		 * import java.awt.event.ActionListener;
		 * import javax.swing.JButton; 
		 * import javax.swing.JFrame; 
		 * 
		 * public class GUISample{
		 * 		public static void main(String[] args) { 
		 * 			JFrame window = new JFrame("DCNet Java 教育");
		 * 			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		 * 			window.setSize(800,600); 
		 * 			JButton btn = new JButton("hello world");
		 * 			window.getContentPane().add(btn); 
		 * 
		 * 			btn.addActionListener((ActionEvent e) -> {
		 * 				System.out.println("ボタンクリックしました。"); 
		 * 			}); 
		 * 			window.setVisible(true); 
		 * 		} 
		 * }
		 */
		//答：ラムダ表达式括号里是ActionEvent类型的参数e，方法体具体处理方式是输出“ボタンクリックしました。”
		//     然后ラムダ表达式整体在括号里也是作为一个addActionListener方法的参数。
		
		
		
		//質問２︓以下ソースに匿名クラスの利⽤する⾏は︖
		/*public class Kicker {
 			public static void main(String... args) {
 				new Thread() {  //答：这一行是匿名クラス
 					@Override
 					public void run() {
 						System.out.println("thread running...");
 					}
 				}.start();
 			}
		}
		*/

	}

}
