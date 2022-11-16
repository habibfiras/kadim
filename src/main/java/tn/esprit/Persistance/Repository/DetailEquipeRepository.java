package tn.esprit.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.Persistance.Detailequipe;
import tn.esprit.Persistance.Etudiant;

public interface DetailEquipeRepository extends JpaRepository<Detailequipe, Integer>{

}
