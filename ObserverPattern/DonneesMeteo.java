package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements Subject{

	private List<Observateur> observers;
	private float temperature;
	private float humidite;
	private float pression;
	
	public DonneesMeteo() {
		observers = new ArrayList();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidite() {
		return humidite;
	}

	public float getPression() {
		return pression;
	}
	
	public void supprimerObservateur (Observateur o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifierObservateurs() {
		for (int i = 0; i < observers.size(); i++) {
		Observateur observer = (Observateur)observers.get(i);
		observer.actualiser(temperature, humidite, pression);
		}
	}
		
	public void actualiserMesures() {
		notifierObservateurs();
	}
	
	public void setMesures(float temperature, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		this.pression = pression;
		actualiserMesures();
	}

	@Override
	public void enregistrerObservateur(Observateur o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

}