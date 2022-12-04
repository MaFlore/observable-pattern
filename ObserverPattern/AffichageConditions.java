package ObserverPattern;

public class AffichageConditions implements Observateur, Affichage {
	private float temperature;
	private float humidite;
	private Subject donneesMeteo;
	
	public AffichageConditions(Subject donneesMeteo) {
		this.donneesMeteo = donneesMeteo;
		donneesMeteo.enregistrerObservateur(this);
	}
	public void actualiser(float temperature, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		afficher();
	}
	public void afficher() {
		System.out.println("Conditions actuelles : " + temperature + " degrés C et " + humidite + " % d’humidité");

	}
}