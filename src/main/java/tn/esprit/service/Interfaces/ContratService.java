package tn.esprit.service.Interfaces;

import java.util.List;

import tn.esprit.Persistance.Contrat;

public interface ContratService {
	public Contrat afficherContrat(int id);
	public int ajoutercontrat(Contrat e); 
	public Contrat modifierContrat(Contrat e);
	public void supprimerContrat(int id);
	public List<Contrat> chercherContrat();
}
