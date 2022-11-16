package tn.esprit.service.Interfaces;

import java.util.List;

import org.springframework.data.repository.query.Param;

import tn.esprit.Persistance.Detailequipe;

public interface DetailEquipeService {
	public Detailequipe afficherDetail(int id);
	public int ajouterDetail(Detailequipe e); 
	public Detailequipe modifierDetailequipe(Detailequipe e);
	public void supprimerDetailequipe(int id);
	public List<Detailequipe> chercherDetailequipe();
}
