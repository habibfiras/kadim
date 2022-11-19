package tn.esprit.Persistance;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table( name = "Etudiant")
public class Etudiant implements Serializable {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="idEtudiant")
private Integer idEtudiant; // Clé primaire
private String prenomE;
private String nomE;
@Temporal(TemporalType.DATE)
private Date dateDebut;
@OneToMany(mappedBy = "etudiant")
private Set<Contrat> contrat; 
@Enumerated(EnumType.STRING)
private Option option;
@ManyToOne
Department department;
@ManyToMany(mappedBy = "etudiant")
@JsonIgnore
private Set<Equipe> equipe;
public Etudiant() {
	super();
}

public Etudiant(Integer idEtudiant, String prenomE, String nomE, Date dateDebut, Set<Contrat> contrat, Option option,
		Department department, Set<Equipe> equipe) {
	super();
	this.idEtudiant = idEtudiant;
	this.prenomE = prenomE;
	this.nomE = nomE;
	this.dateDebut = dateDebut;
	this.contrat = contrat;
	this.option = option;
	this.department = department;
	this.equipe = equipe;
}

public Set<Contrat> getContrat() {
	return contrat;
}

public void setContrat(Set<Contrat> contrat) {
	this.contrat = contrat;
}

public Integer getIdEtudiant() {
	return idEtudiant;
}
public void setIdEtudiant(Integer idEtudiant) {
	this.idEtudiant = idEtudiant;
}
public String getPrenomE() {
	return prenomE;
}
public void setPrenomE(String prenomE) {
	this.prenomE = prenomE;
}
public String getNomE() {
	return nomE;
}
public void setNomE(String nomE) {
	this.nomE = nomE;
}
public Date getDateDebut() {
	return dateDebut;
}
public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}
public Option getOption() {
	return option;
}
public void setOption(Option option) {
	this.option = option;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public Set<Equipe> getEquipe() {
	return equipe;
}
public void setEquipe(Set<Equipe> equipe) {
	this.equipe = equipe;
}


}