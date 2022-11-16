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

import tn.esprit.Persistance.Detailequipe;
import tn.esprit.Persistance.Etudiant;
import tn.esprit.service.Interfaces.DetailEquipeService;

@RestController
@RequestMapping("/ControleurDetailEquipe")
public class DetailEquipeController {
	
	@Autowired
	DetailEquipeService detailEquipeService;

	@GetMapping("/displayDetail")
	public List<Detailequipe> displayAllStudents(){
		return detailEquipeService.chercherDetailequipe();
		
	}
	
	@GetMapping("/retrieve/{id}")
	public Detailequipe retrieve(@PathVariable("id") int id) {
     return detailEquipeService.afficherDetail(id);
	}
	
	@PostMapping("/add")
	@ResponseBody
	public int addEtudiant(@RequestBody Detailequipe e)
	{
	int id = detailEquipeService.ajouterDetail(e);
	return id;
	}
	
	@DeleteMapping("/remove/{operateur-id}")
	@ResponseBody
	public void removeOperateur(@PathVariable("operateur-id") int operateurId) {
		detailEquipeService.supprimerDetailequipe(operateurId);
	
	}
	@PutMapping("/modify-operateur")
	@ResponseBody
	public Detailequipe modifir(@RequestBody Detailequipe operateur) {
	return detailEquipeService.modifierDetailequipe(operateur);
	}
}
