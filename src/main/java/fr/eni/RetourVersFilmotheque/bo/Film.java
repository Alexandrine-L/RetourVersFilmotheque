package fr.eni.RetourVersFilmotheque.bo;

public class Film {
	
	private String titre;
	private int annee;
	private int duree;
	private String synopsis;
	private Genre genre;
	
	public Film(String titre, int annee, int duree, String synopsis) {
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
	}

	public Film() {	
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	
	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Film [titre=" + titre + ", annee=" + annee + ", duree=" + duree + ", synopsis=" + synopsis + "]";
	}

	
	
	
}
