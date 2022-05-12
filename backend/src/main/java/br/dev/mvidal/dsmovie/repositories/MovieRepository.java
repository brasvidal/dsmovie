package br.dev.mvidal.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.mvidal.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
