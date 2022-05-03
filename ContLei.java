import java.util.Objects;

public class ContLei extends ContBancar {

	private String numarCont;
	private float suma;

	public ContLei(String numarCont, float suma) {
		super(numarCont, suma);

	}

	@Override
	public float getSumaTotala() {
		return 0;
	}

	public void transfer(ContLei contDestinatie, float suma) {

		if (this.removeSuma(suma))
			contDestinatie.addSuma(suma);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numarCont, suma);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContLei other = (ContLei) obj;
		return Objects.equals(numarCont, other.numarCont)
				&& Float.floatToIntBits(suma) == Float.floatToIntBits(other.suma);
	}

}
