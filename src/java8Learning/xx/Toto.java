package java8Learning.xx;

public final class Toto implements ImmutableToto {
	private final String jen;
	private final String dva;

	
	public Toto(String jen, String dva) {
		
		this.jen = jen;
		this.dva = dva;
	}
	public Toto(ImmutableToto me) {
		
		this.jen = me.getJen();
		this.dva = me.getDva();
	}

	/* (non-Javadoc)
	 * @see java8Learning.xx.ImmutableToto#getDva()
	 */
	@Override
	public String getDva() {
		return dva;
	}

	

	/* (non-Javadoc)
	 * @see java8Learning.xx.ImmutableToto#getJen()
	 */
	@Override
	public String getJen() {
		return jen;
	}


	/* (non-Javadoc)
	 * @see java8Learning.xx.ImmutableToto#toString()
	 */
	@Override
	public String toString(){
		return super.toString() + "{jen: " + jen + ", dva = " + dva + "}";
	}
	
	/* (non-Javadoc)
	 * @see java8Learning.xx.ImmutableToto#hashCode()
	 */
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
