import java.util.HashSet;
import java.util.Objects;

public class Client {

	private String client;
	private String adresa;

	HashSet<SumaTotala> list = new HashSet<SumaTotala>();

	public Client(String client, String adresa) {
		super();
		this.client = client;
		this.adresa = adresa;

	}

	public ContBancar addCont(String numarCont, float suma, String numeCont) {
		if (numeCont == "Ron")
			return new ContLei(numarCont, suma);
		else
			return new ContEuro(numarCont, suma);
	}

	@Override
	public int hashCode() {
		return Objects.hash(adresa, client, list);
	}

	@Override
	public String toString() {
		return "Client [client=" + client + ", adresa=" + adresa + ", list=" + list + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(adresa, other.adresa) && Objects.equals(client, other.client)
				&& Objects.equals(list, other.list);
	}

}
