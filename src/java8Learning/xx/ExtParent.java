package java8Learning.xx;

public class ExtParent {

	private int val;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	final int addSingleVal(int newVal){
		return this.val +newVal;
	}
	
	int addBiVal(int newVal, int biVal){
		return this.val +newVal +biVal;
	}
	private int  getPVal(){
		return val;
	}

	public ExtParent(int i) {
		val = i;
	}
	protected ExtParent() {
		val = 0;
	}

}
