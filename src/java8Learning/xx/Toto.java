package java8Learning.xx;

public class Toto {

	private String jen;
	private String dva;

	public Toto(String jen, String dva) {
		
		this.setJen(jen);
		this.setDva(dva);
	}
	public Toto(Toto me) {
		
		this.setJen(me.getJen()+"..");
		this.setDva(me.getDva() +"..");
	}

	public String getDva() {
		return dva;
	}

	public void setDva(String dva) {
		this.dva = dva;
	}

	public String getJen() {
		return jen;
	}

	public void setJen(String jen) {
		this.jen = jen;
	}

	public String toString(){
		return super.toString() + "{jen: " + jen + ", dva = " + dva + "}";
	}
	public Toto deepCopy(Toto me){
		Toto t = new Toto (me.getJen()+".",me.getDva()+".");		
		return t;
	}
}
