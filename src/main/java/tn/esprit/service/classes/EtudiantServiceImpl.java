package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.Persistance.Etudiant;
import tn.esprit.Persistance.Repository.EtudiantRepository;
import tn.esprit.service.Interfaces.EtudiantService;

@Service
@Slf4j
public class EtudiantServiceImpl  implements EtudiantService{
	@Autowired
	EtudiantRepository etudRep;
	
	@Scheduled(fixedRate = 60000)
	public void fixedrateMethod() {
		System.out.println("method with fixed rate");
	}

	@Override
	public Etudiant afficherEtudiant(int id) {
		log.info("test"+etudRep.findById(id).get().getNomE());
	
		return etudRep.findById(id).get();
	}

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		 etudRep.save(e);
		return e.getIdEtudiant();
		
	}

	@Override
	public Etudiant modifierEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
	etudRep.findById(e.getIdEtudiant()).get();
		etudRep.save(e);
		return (e);
	}
	
	@Override
	public void supprimerEtudiant(int id) {
		// TODO Auto-generated method stub
		etudRep.deleteById(id);
		
		
	}

	@Override
	public List<Etudiant> chercherEtudiant() {
		// TODO Auto-generated method stub
		return etudRep.findAll();
	}

	@Override
	public Etudiant custom(int id_etudiant) {
		return etudRep.custom(id_etudiant);
	}
	

}
