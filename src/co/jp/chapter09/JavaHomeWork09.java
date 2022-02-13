package co.jp.chapter09;

//質問１︓以下ソースにラムダ式の使う場所を解釈してください。
/*
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUISample {
	public static void main(String[] args) {
		JFrame window = new JFrame("DCNet Java 教育");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800, 600);
		JButton btn = new JButton("hello world");
		window.getContentPane().add(btn);
		btn.addActionListener((ActionEvent e) -> {
			System.out.println("ボタンクリックしました。");
		});

		window.setVisible(true);
	}
}
*/

/*回答:
	btn.addActionListener((ActionEvent e) -> {
			System.out.println("ボタンクリックしました。");
		});

	此处使用了ラムダ。
	具体处理为输出"ボタンクリックしました。"
	若不使用Lambda的话，内部类为以下
	
	 	ActionListener btn = new ActionListener() {
			@Override		   	      
			public void actionPerformed(ActionEvent e) {
				System.out.println("ボタンクリックしました。");
		   }
*/


//質問２︓以下ソースに匿名クラスの利⽤する⾏は︖
/*
  		public class Kicker {
  		 
  		public static void main(String... args) {
  		 new Thread(){
			@Override 
  			public void run() { 
  				System.out.println("thread running..."); 
  			}
  		}.start(); 
  	} 
  }
*/


/* 回答:  
 		new Thread(){
			@Override 
  			public void run() { 
  				System.out.println("thread running..."); 
  			}
  		}.start();
 
  		此处使用了匿名内部类，而且省略了对象名称，也是匿名对象
 */