package komplexeZahlen;

public interface KomplexeZahl {

	//Gibt den Realteil dieses Komplexen Zahl zurück.
	public double getRealteil();
	
	//Gibt den Imaginärteil dieser Komplexen Zahl zurck.
	public double getImaginaerteil();


	public KomplexeZahl addieren(KomplexeZahl zahl);

	public KomplexeZahl multiplizieren(KomplexeZahl zahl);
}