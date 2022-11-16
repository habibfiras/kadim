package tn.esprit.Persistance;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table( name = "Contrat")
	public class Contrat implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idContrat")
	private Integer idContrat; //cle primaire
	@Temporal(TemporalType.DATE)
	private Date dateDebutContrat;
	@Temporal(TemporalType.DATE)
	private Date dateFinContrat;
	@Enumerated(EnumType.STRING)
	@ManyToOne
	private Etudiant etudiant;
	private Specialite specialite;
	private boolean archive;
	private int montantContrat;
	public Integer getIdContrat() {
		return idContrat;
	}
	public void setIdContrat(Integer idContrat) {
		this.idContrat = idContrat;
	}
	public Date getDateDebutContrat() {
		return dateDebutContrat;
	}
	public void setDateDebutContrat(Date dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}
	public Date getDateFinContrat() {
		return dateFinContrat;
	}
	public void setDateFinContrat(Date dateFinContrat) {
		this.dateFinContrat = dateFinContrat;
	}
	public Specialite getSpecialite() {
		return specialite;
	}
	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}
	public boolean isArchive() {
		return archive;
	}
	public void setArchive(boolean archive) {
		this.archive = archive;
	}
	public int getMontantContrat() {
		return montantContrat;
	}
	public void setMontantContrat(int montantContrat) {
		this.montantContrat = montantContrat;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Contrat(Integer idContrat, Date dateDebutContrat, Date dateFinContrat, Etudiant etudiant,
			Specialite specialite, boolean archive, int montantContrat) {
		super();
		this.idContrat = idContrat;
		this.dateDebutContrat = dateDebutContrat;
		this.dateFinContrat = dateFinContrat;
		this.etudiant = etudiant;
		this.specialite = specialite;
		this.archive = archive;
		this.montantContrat = montantContrat;
	}
	public Contrat() {
		super();
	}
	
	
}
