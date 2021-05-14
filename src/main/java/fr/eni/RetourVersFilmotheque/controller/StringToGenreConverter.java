package fr.eni.RetourVersFilmotheque.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.RetourVersFilmotheque.bo.Genre;
import fr.eni.RetourVersFilmotheque.service.GenreService;

@Component
public class StringToGenreConverter implements Converter<String, Genre>{
	
	private GenreService service;
	
	@Autowired
	public void setGenreService(GenreService service) {
		this.service = service;
	}
	
	@Override
	public Genre convert(String id) {
		Integer theid = Integer.parseInt(id);
		
		return service.getMapGenres().get(theid);

	}
}
