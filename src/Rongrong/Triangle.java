package Rongrong;

public class Triangle {
	//member variable
	private String type;
	private int height;
	
	public int getHeight() {
		return height;
	}
//	constructor 1
	public Triangle(String t){
		this.type = t;
	}
	
//	constructor 3
	public Triangle(int h){
		this.height = h;
	}
	
//	constructor 2
	public Triangle(String t,int h){
		this.type = t;
		this.height = h;
	}
	
	public String getType() {
		return type;
	}

//	public void setType(String type) {
//		this.type = type;
//	}
	
	

	public void draw(){
		System.out.println("Triangle height and type ->" + getHeight() + getType());
	}
}
