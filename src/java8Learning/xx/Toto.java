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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dva == null) ? 0 : dva.hashCode());
		result = prime * result + ((jen == null) ? 0 : jen.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toto other = (Toto) obj;
		if (dva == null) {
			if (other.dva != null)
				return false;
		} else if (!dva.equals(other.dva))
			return false;
		if (jen == null) {
			if (other.jen != null)
				return false;
		} else if (!jen.equals(other.jen))
			return false;
		return true;
	}
	
}
