package vezbi.br3;

public class SportskiKlub implements Comparable<SportskiKlub> {
	private String ime;
	private String sport;
	private int brojNaClenovi;
	
	public SportskiKlub(String ime, String sport, int brojClenovi) {
		this.ime = ime;
		this.sport = sport;
		this.brojNaClenovi = brojClenovi;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public int getBrojClenovi() {
		return brojNaClenovi;
	}
	public void setBrojClenovi(int brojClenovi) {
		this.brojNaClenovi = brojClenovi;
	}
	public int compareTo(SportskiKlub obj) {
		SportskiKlub a = (SportskiKlub) obj;
		if (this.ime.equals(a.ime))
			return 0;
		else
			return this.ime.compareTo(a.ime);
	}
}