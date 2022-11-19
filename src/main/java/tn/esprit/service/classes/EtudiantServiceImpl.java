package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.Persistance.Contrat;
import tn.esprit.Persistance.Department;
import tn.esprit.Persistance.Equipe;
import tn.esprit.Persistance.Etudiant;
import tn.esprit.Persistance.Repository.ContratRepository;
import tn.esprit.Persistance.Repository.DepartementRepository;
import tn.esprit.Persistance.Repository.EquipeRepository;
import tn.esprit.Persistance.Repository.EtudiantRepository;
import tn.esprit.service.Interfaces.EtudiantService;

@Service
@Slf4j
public class EtudiantServiceImpl  implements EtudiantService{
	@Autowired
	EtudiantRepository etudRep;
	@Autowired
	ContratRepository contratRep;
	@Autowired
	EquipeRepository equipeRep;
	@Autowired
	DepartementRepository departementRep;

	
	@Scheduled(fixedRate = 60000)
	public void chercherEtudiant2() {
		log.info( etudRep.findAll()+" getting students ...");
	}
	@Scheduled(fixedDelay = 60000)
	public void fixedDelayMethod() {
		log.info( etudRep.findAll()+" getting students ...");
	}
	@Scheduled(cron = "0 0 1 1 * *" )
	public void cronMethod() {
		etudRep.deleteAll();
	}
	@Override
	public Etudiant afficherEtudiant(int id) {
		log.info("test"+etudRep.findById(id).get().getNomE());
		log.info(" getting students ...");
		return etudRep.findById(id).get();
	}

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		try {
			 etudRep.save(e);
		}catch (Exception ex) {
			// TODO: handle exception
			  log.info("test1"+ex.getStackTrace());	
		}
		return e.getIdEtudiant();
		
	}

	@Override
	public Etudiant modifierEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
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
	
	@Override
	public List<Etudiant> getAllEtudiantsBeginByNomE(String name) {
		log.info(""+name);
		return etudRep.getAllEtudiantsBeginByNomE(name);
	}
	@Override
	public List<Etudiant> getAllEtudiant() {
		return etudRep.getAllEtudiant();
	}
	@Override
	public Etudiant getEtudiantByNomE(String name) {
		log.info("resultat de recherche :"+etudRep.getEtudiantByNomE(name));
		return etudRep.getEtudiantByNomE(name);
		
	}
	@Override
	public void affectContratEtudiant(int idE,int inC) {
		Etudiant e = etudRep.findById(idE).get();
		Contrat c = contratRep.findById(inC).get();
		c.setEtudiant(e);
		contratRep.save(c);
	}
	//public void affectEquipeEtudiant(int idE,int inEQ) {
		//Etudiant e = etudRep.findById(idE).get();
		//Equipe c = equipeRep.findById(inEQ).get();
		//c.setEtudiant(e);
		//equipeRep.save(c);
	//}
	@Override
	public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
		Etudiant e = etudRep.findById(etudiantId).get();
		Department d = departementRep.findById(departementId).get();	
		e.setDepartment(d);
		etudRep.save(e);
        log.info("etudiant "+e.getPrenomE()+" "+e.getNomE()+" assigné au departement "+d.getNomDepart());

	}
}
