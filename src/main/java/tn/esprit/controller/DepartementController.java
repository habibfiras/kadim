package tn.esprit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.Persistance.Department;
import tn.esprit.Persistance.Etudiant;
import tn.esprit.service.Interfaces.DepartementService;

@RestController
@RequestMapping("/ControleurDepartement")
public class DepartementController {
	@Autowired
	DepartementService departementService;

	
	@GetMapping("/displaystudent")
	public List<Department> displayAllDepartments(){
		return departementService.chercherDepartment();
		
	}
	
	@GetMapping("/retrieve/{id}")
	public Department retrieve(@PathVariable("id") int id) {
     return departementService.afficherDepartment(id);
	}

	@PostMapping("/add")
	@ResponseBody
	public int addDepartment(@RequestBody Department e)
	{
	int id = departementService.ajouterDepartment(e);
	return id;
	}
	
	@DeleteMapping("/remove/{operateur-id}")
	@ResponseBody
	public void removeOperateur(@PathVariable("operateur-id") int operateurId) {
		departementService.supprimerDepartment(operateurId);
	
	}
	@PutMapping("/modify-operateur")
	@ResponseBody
	public Department modifir(@RequestBody Department operateur) {
	return departementService.modifierDepartment(operateur);
	}
}
