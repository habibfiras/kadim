package tn.esprit.service.Interfaces;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import tn.esprit.Persistance.Equipe;

public interface EquipeService {
	public Equipe afficherEquipe(int id);
	public int ajouterEquipe(Equipe e); 
	public Equipe modifierEquipe(Equipe e);
	public void supprimerEquipe(int id);
	public List<Equipe> chercherEquipe();
}
