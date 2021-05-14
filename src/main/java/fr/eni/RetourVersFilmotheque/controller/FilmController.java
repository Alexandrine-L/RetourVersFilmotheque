package fr.eni.RetourVersFilmotheque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.RetourVersFilmotheque.bo.Film;
import fr.eni.RetourVersFilmotheque.service.FilmService;
import fr.eni.RetourVersFilmotheque.service.GenreService;

@Controller
public class FilmController {
	
	private FilmService filmService;
	private GenreService genreService;
		
	public FilmController(FilmService filmService,GenreService genreService) {
		super();
		this.filmService = filmService;
		this.genreService = genreService;
	}

	@GetMapping("/")
	public String getAccueil(Model modele) {
		modele.addAttribute("listeFilms", filmService.getListeFilms());
		return "index";
	}
	
	@GetMapping("/film/ajouter")
	public String afficherFormulaire(Model modele) {
		modele.addAttribute("film", new Film());
		modele.addAttribute("listeGenres", genreService.getListeGenres());
		return "FilmAjout";
	}
	
	
	@PostMapping("/film/ajouter")
	public String ajouter(@ModelAttribute Film film, 
							Model modele) {
		filmService.ajouterFilm(film);
		return "redirect:/";
	}

}
