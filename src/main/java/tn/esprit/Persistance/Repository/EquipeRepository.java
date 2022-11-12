package tn.esprit.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.Persistance.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Integer>{

}
