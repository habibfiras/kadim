package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.Persistance.Contrat;
import tn.esprit.Persistance.Repository.ContratRepository;
import tn.esprit.service.Interfaces.ContratService;
@Service

public class ContratServiceImpl implements ContratService{
	@Autowired
	ContratRepository contratRepository;
	@Override
	public Contrat afficherContrat(int id) {
		// TODO Auto-generated method stub
		return contratRepository.findById(id).get();
	}
	@Override
	public int ajoutercontrat(Contrat e) {
		// TODO Auto-generated method stub
		contratRepository.save(e);
		return e.getIdContrat();
	}

	@Override
	public Contrat modifierContrat(Contrat e) {
		// TODO Auto-generated method stub
		contratRepository.save(e);
		return (e);
	}

	@Override
	public void supprimerContrat(int id) {
		// TODO Auto-generated method stub
		contratRepository.deleteById(id);

		
	}

	@Override
	public List<Contrat> chercherContrat() {
		// TODO Auto-generated method stub
		return contratRepository.findAll();
	}

}
