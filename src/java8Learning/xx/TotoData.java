package java8Learning.xx;

public class TotoData implements ImmutableToto{
	public String jen;
	public void setJen(String jen) {
		this.jen = jen;
	}

	public TotoData(String jen, String dva) {
		
		this.jen = jen;
		this.dva = dva;
	}
	public TotoData(ImmutableToto me) {
		
		this.jen = me.getJen();
		this.dva = me.getDva();
	}
	public void setDva(String dva) {
		this.dva = dva;
	}

	public String dva;

	public TotoData() {
	}

	@Override
	public String getDva() {
		// TODO Auto-generated method stub
		return dva;
	}

	@Override
	public String toString(){
		return super.toString() + "{jen: " + jen + ", dva = " + dva + "}";
	}

	@Override
	public String getJen() {
		// TODO Auto-generated method stub
		return jen;
	}
}