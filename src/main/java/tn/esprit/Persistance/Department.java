package tn.esprit.Persistance;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table( name = "Department")
public class Department implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDepart")
	private int idDepart;
	private String nomDepart;
	@OneToMany(mappedBy="department")
	@JsonIgnore
    private Set<Etudiant> etudiant;
	
	public Set<Etudiant> getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Set<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}
	public int getIdDepart() {
		return idDepart;
	}
	public void setIdDepart(int idDepart) {
		this.idDepart = idDepart;
	}
	public String getNomDepart() {
		return nomDepart;
	}
	public void setNomDepart(String nomDepart) {
		this.nomDepart = nomDepart;
	}

	public Department(int idDepart, String nomDepart, Set<Etudiant> etudiant) {
		super();
		this.idDepart = idDepart;
		this.nomDepart = nomDepart;
		this.etudiant = etudiant;
	}
	public Department() {
		super();
	}
	


}