package java8Learning.xx;

public class ClassesLrn {

	public static void main(String[] args) {
		System.out.println("start");
		Parent p = new ClassesLrn().new Parent();
		Parent pp = new ClassesLrn().new ParentChild();
		if(pp instanceof Parent)
			System.out.println(pp.toString() + " is instance of Parent");
		if (pp.getClass() == Parent.class)
			System.out.println(pp.toString() + " is Parent");
		if (pp instanceof ParentChild)
			System.out.println(pp.toString() + " is instance of ParentChild");
		if (pp.getClass() == ParentChild.class)
			System.out.println(pp.toString() + " is ParentChild");
		
		if(p instanceof Parent)
			System.out.println(p.toString() + " is instance of Parent");
		if (p.getClass() == Parent.class)
			System.out.println(p.toString() + " is Parent");
		if (p instanceof ParentChild)
			System.out.println(p.toString() + " is instance of ParentChild");
		if (p.getClass() == ParentChild.class)
			System.out.println(p.toString() + " is ParentChild");
		
			System.out.println(p.addSingleVal(123));
			System.out.println(p.addBiVal(123,2));
			
			System.out.println(pp.addSingleVal(123));
			System.out.println(pp.addBiVal(123,2));
			
			ExtParent ep = new ExtParent(2);
			ExtChild epp = new ExtChild(3);
		};


	
	class Parent {
		private int val;
		
		final int addSingleVal(int newVal){
			return this.val +newVal;
		}
		
		int addBiVal(int newVal, int biVal){
			return this.val +newVal +biVal;
		}
		private int  getVal(){
			return val;
		}

	}
	
	class ParentChild extends Parent {
		@Override
		int addBiVal(int newVal, int biVal){
			return super.val + newVal * biVal;
		}
		
		
		int addVal(int newVal){
			return super.getVal() + newVal * 2;
		}
	}

}
