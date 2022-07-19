package com.demo.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Movie;
import com.demo.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repo;

	public List<Movie> findAll() {
		return repo.findAll();
	}
	
	public Movie findOneById(int id) {
		Optional<Movie> optional = repo.findById(id);
		if(optional.isEmpty()) {
			throw new RuntimeException("Could not find movie with id: "+id);
		} else {
			return optional.get();
		}
	}
	
	public Movie createNewMovie(Movie m) {
		return repo.save(m);
	}

}
