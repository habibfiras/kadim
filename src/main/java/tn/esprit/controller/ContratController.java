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

import tn.esprit.Persistance.Contrat;
import tn.esprit.Persistance.Etudiant;
import tn.esprit.service.Interfaces.ContratService;
import tn.esprit.service.Interfaces.EquipeService;

@RestController
@RequestMapping("/ControleurContrat")
public class ContratController {
	@Autowired
	ContratService contratService;

	@GetMapping("/displaycontrat")
	public List<Contrat> displayAllContrat(){
		return contratService.chercherContrat();
		
	}
	
	@GetMapping("/retrieve/{id}")
	public Contrat retrieve(@PathVariable("id") int id) {
     return contratService.afficherContrat(id);
	}
	
	@PostMapping("/add")
	@ResponseBody
	public int addContrat(@RequestBody Contrat e)
	{
	int id = contratService.ajoutercontrat(e);
	return id;
	}
	
	@DeleteMapping("/remove/{operateur-id}")
	@ResponseBody
	public void removeOperateur(@PathVariable("operateur-id") int operateurId) {
		contratService.supprimerContrat(operateurId);
	
	}
	@PutMapping("/modify-operateur")
	@ResponseBody
	public Contrat modifir(@RequestBody Contrat operateur) {
	return contratService.modifierContrat(operateur);
	}
}
