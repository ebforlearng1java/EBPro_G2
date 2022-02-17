package co.jp.chapter11;

import java.util.List;

public class Line {
	//路线名
	String name;
	
	//站
	List<Station> station; 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Station> getStstion() {
		return station;
	}

	public void setStstion(List<Station> ststion) {
		this.station = ststion;
	}
}
