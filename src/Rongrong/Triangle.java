package Rongrong;

import java.util.List;

public class Triangle {
//	< -- setter and constructor injection   -->
//	//member variable
//	private String type;
//	private int height;
//	
//	public int getHeight() {
//		return height;
//	}
////	constructor 1
//	public Triangle(String t){
//		this.type = t;
//	}
//	
////	constructor 3
//	public Triangle(int h){
//		this.height = h;
//	}
//	
////	constructor 2
//	public Triangle(String t,int h){
//		this.type = t;
//		this.height = h;
//	}
//	
//	public String getType() {
//		return type;
//	}
//
////	public void setType(String type) {
////		this.type = type;
////	}
//	
//	
//
//	public void draw(){
//		System.out.println("Triangle height and type ->" + getHeight() + getType());
//	}
	
	
//	object (self defined class obj)
	private Point p1;
	private Point p2;
	private Point p3;
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Point getP3() {
		return p3;
	}
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	
//	private List<Point> l;
//	
//	public List<Point> getL() {
//		return l;
//	}

//	public void setL(List<Point> l) {
//		this.l = l;
//	}

	public void draw(){
//		for(Point p:l){
			System.out.println(" Point = " + getP1().getX() + getP1().getY() + " Point 2 = " + getP2().getX() + getP2().getY() +" Point 3 = " + getP3().getX()+getP3().getY());
//			System.out.println(" Point = " + p.getX() + p.getY());
//		}
	}
	
}
