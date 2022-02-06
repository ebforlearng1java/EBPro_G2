package co.jp.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Presentation {
		
	 public static void main(String[] args) {
		 
		System.out.println("-----PETHOTEL-----");

		Pet[] hotel = new Pet[10];
		
		String name="";
		
		int age=0;
		
		String type="";
	
		 Scanner sc = new Scanner(System.in);
	        String[][] room = new String[2][5];
	        init(room);//初始化酒店房间
	        System.out.print("提示:");
	        while (true) {
	            System.out.println("输入search 查询所有房间；输入 in 办理入住； 输入out 办理退房； 输入exit 关闭系统");
	            System.out.print("请输入指令:");
	            String order = sc.next();
	            if (order.equals("search")) {
	                System.out.println("查询所有房间");
	                search(room);
	            } else if (order.equals("in")) {
	                System.out.println("办理入住");
	                in(room);
	                  } else if (order.equals("out")) {
	                System.out.println("办理退房");
	                out(room);
	            } else if (order.equals("quit")) {
	                System.out.println("关闭系统");
	                break;
	            } else {
	                System.out.println("请输入正确的指令!");
	            }
	        }
	    }

	//房间初始状态的方法
	public static void init(String[][] room) {
	  for (int i = 0; i < room.length; i++) {
	      for (int j = 0; j < room[i].length; j++) {
	          room[i][j] = "Empty";
	      }
	  }
	  System.out.println("房间初始化成功！");
	}

	//查询所有房间的方法
	public static void search(String[][] room) {

	  for (int i = 0; i < room.length; i++) {
	      System.out.print("第" + (i + 1) + "楼:   ");
	      for (int j = 0; j < room[i].length; j++) {
	          if (i < 2) {
	              System.out.print("0");
	          }
	          int floor = (i + 1) * 100 + j + 1;
	          System.out.print(floor + "\t");
	      }
	      System.out.println();
	      //打印房间状态
	      for (int k = 0; k < room[i].length; k++) {
	          System.out.print("\t" + room[i][k]);
	      }
	      System.out.println();
	  }

	}

	//入住方法
	public static void in(String[][] room) {
	  boolean flag = true;
	  System.out.print("请输入宠物品种及姓名：");
	  System.out.print("例如：dogabc");
	  Scanner sc = new Scanner(System.in);
	  String name = sc.next();
	  
	  
	  while (flag) {//当输入的房间有人住时，继续循环输入房间，直到选择一间没有住的房间
	      System.out.print("请输入入住的房间号，例如203：");
	      int rnum = sc.nextInt();
	      int floor = rnum / 100 - 1;//楼层号
	      int no = rnum % 100 - 1;//房间号
	      if (floor >= 0 && floor <= 2 && no >= 0 && no <= 5) {//判断输入的房间号是否正确
	          if (room[floor][no].equals("Empty")) {//判断房间是否空的，如果空的，则入住，把入住的后房间状态改为入住人姓名，然后结束            
	                                                 //循环
	              room[floor][no] = name;
	              flag = false;
	          } else {//反之，继续循环输入房间号
	              System.out.println("不好意思！这间房间有人入住了，请选择别的房间！");
	          }
	      } else {
	          System.out.println("输入房间号不正确，请重新输入！");
	      }
	  }
	  System.out.println("欢迎入住！");
	}

	//退房方法
	public static void out(String[][] room) {
	  System.out.print("请输入要退房的房间号，例如203：");
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();

	  int floor = (num / 100) - 1;
	  int no = (num % 100) - 1;
	  if (floor >= 0 && floor <= 2 && no >= 0 && no <= 5) {//判断输入的房间号是否正确
	      if (room[floor][no].equals("Empty")){
	          System.out.println("房间为空房，不需要退房");}
	      else {
	          room[floor][no] = "Empty";
	          System.out.println("恭喜您退房成功，欢迎下次再来");
	      }
	  }else{
	      System.out.println("你输入的房间号有误，请重新输入！");
	  }

	}
	}

	


















