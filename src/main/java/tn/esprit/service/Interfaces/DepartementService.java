package tn.esprit.service.Interfaces;

import java.util.List;

import org.springframework.data.repository.query.Param;

import tn.esprit.Persistance.Department;

public interface DepartementService {
	public Department afficherDepartment(int id);
	public int ajouterDepartment(Department e); 
	public Department modifierDepartment(Department e);
	public void supprimerDepartment(int id);
	public List<Department> chercherDepartment();
}
