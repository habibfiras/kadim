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

@Enumerated(EnumType.STRING)
private Option option;
// Constructeur et accesseurs (getters) et mutateurs (setters)
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


public Etudiant() {
}
public Etudiant(Integer idEtudiant, String prenomE, String nomE, Date dateDebut, Option option) {
	super();
	this.idEtudiant = idEtudiant;
	this.prenomE = prenomE;
	this.nomE = nomE;
	this.dateDebut = dateDebut;
	this.option = option;
}
public Date getDateDebut() {
	return dateDebut;
}
public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}
public Option getOp() {
	return option;
}
public void setOp(Option op) {
	this.option = op;
}


@ManyToOne

Department department;
@ManyToMany(cascade = CascadeType.ALL)

private Set<Equipe> equipe;


}