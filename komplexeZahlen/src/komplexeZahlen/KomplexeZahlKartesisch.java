package komplexeZahlen;

public class KomplexeZahlKartesisch implements KomplexeZahl {

	private double realTeil;
	private double imaginärerTeil;

	public KomplexeZahlKartesisch(double realTeil, double imaginaerTeil) {
		this.realTeil = realTeil;
		this.imaginärerTeil = imaginaerTeil;
	};
	
	
	@Override
	public double getRealteil() {
		return realTeil;
	}

	@Override
	public double getImaginaerteil() {
		return imaginärerTeil;
	}

	@Override
	public KomplexeZahl addieren(KomplexeZahl zahl) {

		double summeRealteil = this.realTeil + zahl.getRealteil();
		double summeImaginärerTeil = this.imaginärerTeil + zahl.getImaginaerteil();
		
		KomplexeZahlKartesisch summeKomplexeZahl = new KomplexeZahlKartesisch(summeRealteil, summeImaginärerTeil);
		
		return summeKomplexeZahl;
	}

	@Override
	public KomplexeZahl multiplizieren(KomplexeZahl zahl) {
		
		double produktRealteil = this.realTeil * zahl.getRealteil() - this.imaginärerTeil * zahl.getImaginaerteil();
		double produktImaginärerTeil = this.realTeil * zahl.getImaginaerteil() + zahl.getRealteil() * this.imaginärerTeil;
		
		KomplexeZahlKartesisch produktKomplexeZahl = new KomplexeZahlKartesisch(produktRealteil, produktImaginärerTeil);
		
		return produktKomplexeZahl;
	}

}
