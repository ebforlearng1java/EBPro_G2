package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;

public class Line {
	String name;
	List<Station> stations;
	
	

	public Line(String value) {
		// TODO Auto-generated constructor stub
		this.name = value;
		this.stations = new ArrayList<Station>();
	}


	public void establish(Station value) {
		stations.add(value);
		System.out.println("成功新建车站："+value.name);
	}
}
