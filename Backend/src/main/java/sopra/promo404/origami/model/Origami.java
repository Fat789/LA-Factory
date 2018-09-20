package sopra.promo404.origami.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;
@Entity
@Table(name = "origami")
public class Origami {
	@Id
	@GeneratedValue
	@Column(name = "origami_id")
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@JsonView(Views.ViewCommon.class)
	private String nom;
	@JsonView(Views.ViewCommon.class)
	private String tempsRea;
	@JsonView(Views.ViewCommon.class)
	private int nbFeuille;
	@JsonView(Views.ViewCommon.class)
	private Niveau niveau;
	@JsonView(Views.ViewCommon.class)
	private float note;
	@JsonView(Views.ViewCommon.class)
	private boolean actif;
	@JsonView(Views.ViewCommon.class)
	private String youtube;
	@JsonView(Views.ViewCommon.class)
	private String imageOri;
	@OneToMany(mappedBy="etape" , fetch=FetchType.EAGER)
	@JoinColumn(name="etape_id")
	private List<Etape> etapes;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="categorie_id")
	private List<Categorie> categories;

	
	public Origami() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getTempsRea() {
		return tempsRea;
	}


	public void setTempsRea(String tempsRea) {
		this.tempsRea = tempsRea;
	}


	public int getNbFeuille() {
		return nbFeuille;
	}


	public void setNbFeuille(int nbFeuille) {
		this.nbFeuille = nbFeuille;
	}


	public Niveau getNiveau() {
		return niveau;
	}


	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}


	public float getNote() {
		return note;
	}


	public void setNote(float note) {
		this.note = note;
	}


	public boolean isActif() {
		return actif;
	}


	public void setActif(boolean actif) {
		this.actif = actif;
	}


	public String getYoutube() {
		return youtube;
	}


	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}


	public String getImageOri() {
		return imageOri;
	}


	public void setImageOri(String imageOri) {
		this.imageOri = imageOri;
	}


	public List<Etape> getEtapes() {
		return etapes;
	}


	public void setEtapes(List<Etape> etapes) {
		this.etapes = etapes;
	}


	public List<Categorie> getCategories() {
		return categories;
	}


	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}

	
}