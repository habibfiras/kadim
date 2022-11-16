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
	@Query("select e from Etudiant e where e.nomE like %:prefixe%")
    List<Etudiant> getAllEtudiantsBeginByNomE(@Param("prefixe") String prefixe);
	@Query(value="SELECT  * from etudiant LEFT JOIN equipe_etudiants ON etudiant.id_etudiant=equipe_etudiants.etudiants_id_etudiant"
			+ "  LEFT JOIN equipe ON equipe_etudiants.equipe_id_equipe=equipe.id_equipe "
			,nativeQuery=true)
	public List<Etudiant> getAllEtudiant();
	public Etudiant getEtudiantByNomE(String name);

} 
