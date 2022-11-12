package tn.esprit.Persistance;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "Detailequipe")
public class Detailequipe implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDetailEquipe")
	private Integer idDetailEquipe; // Clé primaire
	private int salle;
	private String thematique;

	public Detailequipe(Integer idDetailEquipe, int salle, String thematique) {
		super();
		this.idDetailEquipe = idDetailEquipe;
		this.salle = salle;
		this.thematique = thematique;
	}
	public Detailequipe() {
		super();
	}
	public Integer getIdDetailEquipe() {
		return idDetailEquipe;
	}
	public void setIdDetailEquipe(Integer idDetailEquipe) {
		this.idDetailEquipe = idDetailEquipe;
	}
	public int getSalle() {
		return salle;
	}
	public void setSalle(int salle) {
		this.salle = salle;
	}
	public String getThematique() {
		return thematique;
	}
	public void setThematique(String thematique) {
		this.thematique = thematique;
	}
	@OneToOne(mappedBy = "detailequipe")
	private Equipe equipe;

}
