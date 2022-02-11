package co.jp.chapter09;

public class JavachapterHomeWork09 {
	
	public static void main(String[] args) {
	
		/*
		 * 質問1:以下ソースにラムダ式の使う場所を解釈してください。
		 * 
		 * 	import java.awt.event.ActionEvent;
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
            
            		
		   解答:  1 ラムダを使う場所
		   
		            btn.addActionListener((ActionEvent e) -> {
					   System.out.println("ボタンクリックしました。");
			        });
		     
		   	     2 解釈: 引数ActionEvent e实现接口中的ActionListener方法,响应动作事件.
		   	     
				  //匿名内部class还原
				   	      
				   	       btn.addActionListener(new ActionListener () {
				   	      
					            public void actionPerformed(ActionEvent e) {
					            
		                           System.out.println("ボタンクリックしました。");
		                
		                        }
		                  }) ;

		   	     
		   	     //内部class还原
		   	      
					   	      ActionListener btn = new ActionListener() {
					   	      
					   	        public void actionPerformed(ActionEvent e) {
					   	        
					   	           System.out.println("ボタンクリックしました。");
					   	     
					   	        }
		 */
		
		/*
		 * 質問2: 以下ソースに匿名クラスの利用する行は?
		 *  public class Kicker {
				public static void main(String... args) {
				
				new Thread() {
					@Override
					public void run() {
					System.out.println("thread running...");
					}
				}.start();
				}
				}
				
		 * 解答：本文件中(68-73)
		 *      原PDF中(4-9)
		 * 
		 */
		
	
	
	
}

}
