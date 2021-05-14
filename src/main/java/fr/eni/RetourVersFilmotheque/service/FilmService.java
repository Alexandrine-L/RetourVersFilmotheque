package fr.eni.RetourVersFilmotheque.service;

import java.util.List;

import fr.eni.RetourVersFilmotheque.bo.Film;

public interface FilmService {
	
	public List<Film> getListeFilms();

	public void ajouterFilm(Film film);

}
