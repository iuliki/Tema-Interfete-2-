import java.util.Objects;

public abstract class ContBancar implements SumaTotala {

	private String numarCont;
	private float suma;

	public ContBancar(String numarCont, float suma) {

		this.numarCont = numarCont;
		this.suma = suma;
	}

	public String getNumarCont() {
		return numarCont;
	}

	public void setNumarCont(String numarCont) {
		this.numarCont = numarCont;
	}

	public float getSuma() {
		return suma;
	}

	public void setSuma(float suma) {
		this.suma = suma;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numarCont);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContBancar other = (ContBancar) obj;
		return Objects.equals(numarCont, other.numarCont);
	}

	public boolean removeSuma(float suma) {
		if (this.suma < suma) {
			System.out.println("Fonduri insuficiente! ");
			return false;
		}
		this.suma -= suma;
		return true;
	}

	public void addSuma(float sum) {
		this.suma += sum;
	}

}
