package myfirstpackage;

public class MyFirstPackage {
	private int x;
	private int y;

	public int getFirstNumber() {
		return x;
	}
	public int getSecondNumber() {
		return y;
	}
    
	public void setFirstNumber(int value) {
		x = value;
	}
	public void setSecondNumber(int value) {
		y = value;
	}
	
	public MyFirstPackage(int x1, int y1) {
		x = x1;
		y = y1;
	}

	public int mult() {
		return x * y;
	}
}