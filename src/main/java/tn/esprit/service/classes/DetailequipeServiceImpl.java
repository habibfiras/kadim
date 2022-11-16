package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.Persistance.Detailequipe;
import tn.esprit.Persistance.Repository.DetailEquipeRepository;
import tn.esprit.service.Interfaces.DetailEquipeService;

@Service
@Slf4j
public class DetailequipeServiceImpl implements DetailEquipeService {
	@Autowired
	DetailEquipeRepository detailEquipeRepository;
	@Override
	public Detailequipe afficherDetail(int id) {
		// TODO Auto-generated method stub
		return detailEquipeRepository.findById(id).get();
	}

	@Override
	public int ajouterDetail(Detailequipe e) {
		// TODO Auto-generated method stub
		detailEquipeRepository.save(e);
		return e.getIdDetailEquipe();
	}

	@Override
	public Detailequipe modifierDetailequipe(Detailequipe e) {
		// TODO Auto-generated method stub
		detailEquipeRepository.save(e);
		return (e);
	}

	@Override
	public void supprimerDetailequipe(int id) {
		// TODO Auto-generated method stub
		detailEquipeRepository.deleteById(id);
	}

	@Override
	public List<Detailequipe> chercherDetailequipe() {
		// TODO Auto-generated method stub
		return detailEquipeRepository.findAll();
	}

}
