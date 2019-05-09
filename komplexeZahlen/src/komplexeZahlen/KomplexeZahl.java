package komplexeZahlen;

public interface KomplexeZahl {

	//Gibt den Realteil dieses Komplexen Zahl zur�ck.
	public double getRealteil();
	
	//Gibt den Imagin�rteil dieser Komplexen Zahl zurck.
	public double getImaginaerteil();


	public KomplexeZahl addieren(KomplexeZahl zahl);

	public KomplexeZahl multiplizieren(KomplexeZahl zahl);
}