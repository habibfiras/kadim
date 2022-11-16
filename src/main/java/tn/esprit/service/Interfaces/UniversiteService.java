package tn.esprit.service.Interfaces;

import java.util.List;

import org.springframework.data.repository.query.Param;

import tn.esprit.Persistance.Universite;

public interface UniversiteService {
	public Universite afficherUniversite(int id);
	public int ajouterUniversite(Universite e); 
	public Universite modifierUniversite(Universite e);
	public void supprimerUniversite(int id);
	public List<Universite> chercherUniversite();
}
