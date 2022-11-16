package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.Persistance.Equipe;
import tn.esprit.Persistance.Etudiant;
import tn.esprit.Persistance.Repository.EquipeRepository;
import tn.esprit.service.Interfaces.EquipeService;
import tn.esprit.service.Interfaces.EtudiantService;
@Service

public class EquipeServiceImpl  implements EquipeService{
	
	@Autowired
	EquipeRepository equipRep;

	@Override
	public Equipe afficherEquipe(int id) {
		// TODO Auto-generated method stub
		return equipRep.findById(id).get();
	}

	@Override
	public int ajouterEquipe(Equipe e) {
		// TODO Auto-generated method stub
		equipRep.save(e);
			return e.getIdEquipe();
	}

	@Override
	public Equipe modifierEquipe(Equipe e) {
		// TODO Auto-generated method stub
		equipRep.save(e);
		return (e);
	}

	@Override
	public void supprimerEquipe(int id) {
		// TODO Auto-generated method stub
		equipRep.deleteById(id);
		
	}

	@Override
	public List<Equipe> chercherEquipe() {
		// TODO Auto-generated method stub
		return equipRep.findAll();
	}

	
}
