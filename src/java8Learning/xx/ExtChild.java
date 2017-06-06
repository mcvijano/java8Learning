package java8Learning.xx;

public class ExtChild  extends ExtParent{
	//comment
	private int val;

	public ExtChild(int i) {
		super(i);
		val = i;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	@Override
	int addBiVal(int newVal, int biVal){
		return super.getVal() + newVal * biVal;
	}

}
