package fr.eni.RetourVersFilmotheque.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.eni.RetourVersFilmotheque.bo.Genre;

public class GenreService {
	
	private List<Genre> listeGenres;
	private Map<Integer, Genre> mapGenres;
	
	public GenreService() {
		listeGenres = new ArrayList<>();
		listeGenres.add( new Genre(1, "Thriller"));
		listeGenres.add( new Genre(2, "Horreur"));
		listeGenres.add(new Genre(3, "Romantique"));
		listeGenres.add(new Genre(4, "Action"));
		
		mapGenres = new HashMap<Integer, Genre>();
		listeGenres.forEach(g -> mapGenres.put(g.getId(), g));	
	}
	
	public List<Genre> getListeGenres(){
		return listeGenres;		
	}
	
	public Map<Integer, Genre> getMapGenres(){
		return mapGenres;
	}

}
