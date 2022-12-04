package ObserverPattern;

public interface Subject {
	
	public void enregistrerObservateur(Observateur o);
	public void supprimerObservateur(Observateur o);
	public void notifierObservateurs();
}
