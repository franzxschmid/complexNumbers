package komplexeZahlen;

public class KomplexeZahlKartesisch implements KomplexeZahl {

	private double realTeil;
	private double imagin�rerTeil;

	public KomplexeZahlKartesisch(double realTeil, double imaginaerTeil) {
		this.realTeil = realTeil;
		this.imagin�rerTeil = imaginaerTeil;
	};
	
	
	@Override
	public double getRealteil() {
		return realTeil;
	}

	@Override
	public double getImaginaerteil() {
		return imagin�rerTeil;
	}

	@Override
	public KomplexeZahl addieren(KomplexeZahl zahl) {

		double summeRealteil = this.realTeil + zahl.getRealteil();
		double summeImagin�rerTeil = this.imagin�rerTeil + zahl.getImaginaerteil();
		
		KomplexeZahlKartesisch summeKomplexeZahl = new KomplexeZahlKartesisch(summeRealteil, summeImagin�rerTeil);
		
		return summeKomplexeZahl;
	}

	@Override
	public KomplexeZahl multiplizieren(KomplexeZahl zahl) {
		
		double produktRealteil = this.realTeil * zahl.getRealteil() - this.imagin�rerTeil * zahl.getImaginaerteil();
		double produktImagin�rerTeil = this.realTeil * zahl.getImaginaerteil() + zahl.getRealteil() * this.imagin�rerTeil;
		
		KomplexeZahlKartesisch produktKomplexeZahl = new KomplexeZahlKartesisch(produktRealteil, produktImagin�rerTeil);
		
		return produktKomplexeZahl;
	}

}
