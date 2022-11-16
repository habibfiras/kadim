package tn.esprit.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.Persistance.Etudiant;
import tn.esprit.Persistance.Universite;

public interface UniversiteRepository extends JpaRepository<Universite, Integer>{

}
