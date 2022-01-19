package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
		
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a); //运行之后这一项没有输出，原因？
		//以下コードを完成してください。
		if(a > 90) {
			System.out.println("A");
		} else if(a > 80 && a <= 90) {
			System.out.println("B");
		} else if(a > 70 && a <= 80) {
			System.out.println("C");
		} else if(a >= 60 && a <= 70) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		
		
		//質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。
		
		//定义5种硬币
		int coin1 = 1;
		int coin2 = 5;
		int coin3 = 10;
		int coin4 = 100;
		int coin5 = 500;
		
		//定义5种硬币的数量
		int coin1N = 0;
		int coin2N = 0;
		int coin3N = 0;
		int coin4N = 0;
		int coin5N = 0;
		
		int total = 3340;
		int coinTotal = total;
		int coinTotal_min = 0;
		int number = 0;
		
		for(int i=0;i <= total; i++) {
			coin5N = i;
			
			if((coin5 * coin5N) > total) {
				break;
			}
			
			for(int j=0; j <= total; j++) {
				coin4N = j;
				for(int m=0;m <= total; m++) {
					coin3N = m;
					for(int n=0;n <= total; n++) {
						coin2N = n;
						coin1N = (total - coin5 * i - coin4 * j - coin3 * m - coin2 * n) / coin1;
						
						if(coin1N % 1 > 0) {
							continue;
						}
						
						if(coin1N < 0) {
							break;
						}
						
						
						coinTotal = coin1N + coin2N + coin3N + coin4N + coin5N;
						System.out.println("３３４０円のコイン数：" +  coinTotal);
						
						number++;
						if(coinTotal_min > coinTotal) {
							coinTotal_min = coinTotal;
						}
					}
				}
			}
		}
		System.out.println("全部" + number + "種類あります");
		System.out.println("コイン数最小値は" + coinTotal);
	}

}
