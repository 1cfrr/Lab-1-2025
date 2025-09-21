class MyFirstClass {
	public static void main(String[] args) {
		MySecondClass o = new MySecondClass(0,0);

		int i, j;
		for (i = 1; i <= 8; i++) {
			for(j = 1; j <= 8; j++) {
				o.setFirstNumber(i);
				o.setSecondNumber(j);
				System.out.print(o.mult());
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}

class MySecondClass {
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
	
	public MySecondClass(int x1, int y1) {
		x = x1;
		y = y1;
	}

	public int mult() {
	return x * y;
	}
}