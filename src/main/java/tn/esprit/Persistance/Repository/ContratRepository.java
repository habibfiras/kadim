package tn.esprit.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.Persistance.Contrat;
@Repository
public interface ContratRepository extends JpaRepository<Contrat, Integer> {

}
