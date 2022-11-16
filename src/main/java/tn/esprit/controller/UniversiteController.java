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

import tn.esprit.Persistance.Etudiant;
import tn.esprit.Persistance.Universite;
import tn.esprit.service.Interfaces.UniversiteService;

@RestController
@RequestMapping("/ControleurUniversite")
public class UniversiteController {
	@Autowired
	UniversiteService universiteService;
	@GetMapping("/displaystudent")
	public List<Universite> displayAllStudents(){
		return universiteService.chercherUniversite();
		
	}
	
	@GetMapping("/retrieve/{id}")
	public Universite retrieve(@PathVariable("id") int id) {
     return universiteService.afficherUniversite(id);
	}
	
	@PostMapping("/add")
	@ResponseBody
	public int addEtudiant(@RequestBody Universite e)
	{
	int id = universiteService.ajouterUniversite(e);
	return id;
	}
	
	@DeleteMapping("/remove/{operateur-id}")
	@ResponseBody
	public void removeOperateur(@PathVariable("operateur-id") int operateurId) {
		universiteService.supprimerUniversite(operateurId);
	
	}
	@PutMapping("/modify-operateur")
	@ResponseBody
	public Universite modifir(@RequestBody Universite operateur) {
	return universiteService.modifierUniversite(operateur);
	}
}
