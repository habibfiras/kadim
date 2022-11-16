package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.Persistance.Department;
import tn.esprit.Persistance.Repository.DepartementRepository;
import tn.esprit.service.Interfaces.DepartementService;

@Service
@Slf4j
public class DepartementServiceImpl implements DepartementService{
	@Autowired
	DepartementRepository departementRepository;
	@Override
	public Department afficherDepartment(int id) {
		// TODO Auto-generated method stub
		return departementRepository.findById(id).get();
	}

	@Override
	public int ajouterDepartment(Department e) {
		// TODO Auto-generated method stub
		departementRepository.save(e);
			return e.getIdDepart();
	}

	@Override
	public Department modifierDepartment(Department e) {
		// TODO Auto-generated method stub
		departementRepository.save(e);
		return (e);
	}

	@Override
	public void supprimerDepartment(int id) {
		// TODO Auto-generated method stub
		departementRepository.deleteById(id);
		
	}

	@Override
	public List<Department> chercherDepartment() {
		// TODO Auto-generated method stub
		return departementRepository.findAll();
	}

}
