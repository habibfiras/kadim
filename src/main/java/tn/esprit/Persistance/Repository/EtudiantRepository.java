package tn.esprit.Persistance.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.Persistance.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{
	@Query("SELECT e FROM Etudiant e WHERE e.idEtudiant =:id_etudiant")
	Etudiant custom(@Param("id_etudiant") int id_etudiant);
	
} 
