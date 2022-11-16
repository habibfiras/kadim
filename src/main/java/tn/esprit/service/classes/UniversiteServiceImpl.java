package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.Persistance.Universite;
import tn.esprit.Persistance.Repository.UniversiteRepository;
import tn.esprit.service.Interfaces.UniversiteService;

@Service
@Slf4j
public class UniversiteServiceImpl implements UniversiteService {
	
	@Autowired
	UniversiteRepository universiteRepository;
	@Override
	public Universite afficherUniversite(int id) {
		// TODO Auto-generated method stub
		return universiteRepository.findById(id).get();
	}

	@Override
	public int ajouterUniversite(Universite e) {
		// TODO Auto-generated method stub
		universiteRepository.save(e);
		return e.getIdUniv();
	}

	@Override
	public Universite modifierUniversite(Universite e) {
		// TODO Auto-generated method stub
		universiteRepository.save(e);
		return (e);
	}

	@Override
	public void supprimerUniversite(int id) {
		// TODO Auto-generated method stub
		universiteRepository.deleteById(id);
	}

	@Override
	public List<Universite> chercherUniversite() {
		// TODO Auto-generated method stub
		return universiteRepository.findAll();
	}

}
