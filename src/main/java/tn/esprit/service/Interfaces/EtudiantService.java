package tn.esprit.service.Interfaces;

import tn.esprit.Persistance.Etudiant;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EtudiantService {
	public Etudiant afficherEtudiant(int id);
	public int ajouterEtudiant(Etudiant e); 
	public Etudiant modifierEtudiant(Etudiant e);
	public void supprimerEtudiant(int id);
	public List<Etudiant> chercherEtudiant();
	Etudiant custom(@Param("id_etudiant") int id_etudiant);
	List<Etudiant> getAllEtudiantsBeginByNomE(String name);
	List<Etudiant> getAllEtudiant();
	Etudiant getEtudiantByNomE(String name);
	
}
