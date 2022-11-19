package tn.esprit.Persistance;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table( name = "Equipe")
public class Equipe implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idEquipe")
	private int idEquipe;
	private String nomEquipe;
	private Niveau niveau;
	@OneToOne
	private Detailequipe detailequipe;
	@ManyToMany
	private Set<Etudiant> etudiant;
	public Equipe(int idEquipe, String nomEquipe, Niveau niveau, Detailequipe detailequipe, Set<Etudiant> etudiant) {
		super();
		this.idEquipe = idEquipe;
		this.nomEquipe = nomEquipe;
		this.niveau = niveau;
		this.detailequipe = detailequipe;
		this.etudiant = etudiant;
	}
	
	public Equipe() {
	}
	public int getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	public Detailequipe getDetailequipe() {
		return detailequipe;
	}
	public void setDetailequipe(Detailequipe detailequipe) {
		this.detailequipe = detailequipe;
	}
	public Set<Etudiant> getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Set<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}
	
	
}
