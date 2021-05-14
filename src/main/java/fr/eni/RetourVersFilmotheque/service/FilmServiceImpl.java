package fr.eni.RetourVersFilmotheque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.RetourVersFilmotheque.bo.Film;

@Service
public class FilmServiceImpl implements FilmService {

	private List<Film> listeFilms;
	
	public FilmServiceImpl() {
		this.listeFilms = new ArrayList<Film>();
	}

	@Override
	public List<Film> getListeFilms() {	
		return listeFilms;
	}

	@Override
	public void ajouterFilm(Film film) {
		listeFilms.add(film);	
	}

}
