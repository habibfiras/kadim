package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import javax.websocket.server.PathParam;

import tn.esprit.Persistance.Equipe;
import tn.esprit.Persistance.Repository.EquipeRepository;
import tn.esprit.service.Interfaces.EquipeService;

@RestController
@RequestMapping("/ControleurEquipe")
public class EquipeController {
	
	@Autowired
	EquipeService equService;

	@GetMapping("/displayequipe")
	public List<Equipe> displayAllStudents(){
		return equService.chercherEquipe();
		
	}
	@GetMapping("/retrieve/{id}")
	public Equipe retrieve(@PathVariable("id") int id) {
     return equService.afficherEquipe(id);
	}
	@PostMapping("/add")
	@ResponseBody
	public int addEquipe(@RequestBody Equipe e)
	{
	int id = equService.ajouterEquipe(e);
	return id;
	}
	
	@DeleteMapping("/remove/{operateur-id}")
	@ResponseBody
	public void removeOperateur(@PathVariable("operateur-id") int operateurId) {
		equService.supprimerEquipe(operateurId);
	
	}
	@PutMapping("/modify-operateur")
	@ResponseBody
	public Equipe modifir(@RequestBody Equipe operateur) {
	return equService.modifierEquipe(operateur);
	}

}
