package tn.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Scheduled;
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

import tn.esprit.Persistance.Etudiant;
import tn.esprit.service.Interfaces.EtudiantService;

@RestController
@RequestMapping("/ControleurEtudiant")
public class EtudiantController {
	
	@Autowired
	EtudiantService etudServ; 

	
	@GetMapping("/displaystudent")
	public List<Etudiant> displayAllStudents(){
		return etudServ.chercherEtudiant();
		
	}
	
	@GetMapping("/retrieve/{id}")
	public Etudiant retrieve(@PathVariable("id") int id) {
     return etudServ.afficherEtudiant(id);
	}
	
	@GetMapping("/new/{id}")
	public Etudiant retrievee(@PathVariable("id") int id) {
     return etudServ.custom(id);
	}
	
	@PostMapping("/add")
	@ResponseBody
	public int addEtudiant(@RequestBody Etudiant e)
	{
	int id = etudServ.ajouterEtudiant(e);
	return id;
	}
	
	@DeleteMapping("/remove/{operateur-id}")
	@ResponseBody
	public void removeOperateur(@PathVariable("operateur-id") int operateurId) {
		etudServ.supprimerEtudiant(operateurId);
	
	}
	@PutMapping("/modify-operateur")
	@ResponseBody
	public Etudiant modifir(@RequestBody Etudiant operateur) {
	return etudServ.modifierEtudiant(operateur);
	}
	  
	  @GetMapping("existenceByName/{name}")
	 
	  public Etudiant testExistEtudiantByname(@PathVariable("name") String name) {
		  return etudServ.getEtudiantByNomE(name); 
	  }
	  
	  @GetMapping("filterEtudiantsBeginByName/{name}")
	  public List<Etudiant> allEtudiantsNameCommencePar(@PathVariable("name") String name){
		  return etudServ.getAllEtudiantsBeginByNomE(name);
	  }
	  
	  @GetMapping("getAllEtudiants")
	  public List<Etudiant> getAllEtudiant(){
		  return etudServ.getAllEtudiant();  
	  } 
}
