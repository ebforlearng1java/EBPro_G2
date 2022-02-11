package co.jp.chapter09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaHomeWork09 {
	public static void main(String[] args) {
		JFrame window = new JFrame("DCNet Java 教育");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800, 600);
		JButton btn = new JButton("hello world");
		window.getContentPane().add(btn);

//		質問１︓以下ソースにラムダ式の使う場所を解釈してください。
//		btn.addActionListener((ActionEvent e) -> {
//			System.out.println("ボタンクリックしました。");
//		});
		
//		回答１︓每点击一次按钮，就打印一次【ボタンクリックしました。】
//			把它还原成非lambda的形式：
		ActionListener lambda = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("lambda：点击了按钮");
			}
		};
		
		btn.addActionListener(lambda);

		window.setVisible(true);
	}
	

//	public static void main(String... args) {
////		質問２︓以下ソースに匿名クラスの利⽤する⾏は︖
////		回答２︓39-44
//		new Thread() {
//			@Override
//			public void run() {
//				System.out.println("thread running...");
//			}
//		}.start();
//	}

}
