package br.dev.mvidal.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.dev.mvidal.dsmovie.dto.MovieDTO;
import br.dev.mvidal.dsmovie.dto.ScoreDTO;
import br.dev.mvidal.dsmovie.entities.Movie;
import br.dev.mvidal.dsmovie.entities.Score;
import br.dev.mvidal.dsmovie.entities.User;
import br.dev.mvidal.dsmovie.repositories.MovieRepository;
import br.dev.mvidal.dsmovie.repositories.ScoreRepository;
import br.dev.mvidal.dsmovie.repositories.UserRepository;

@Service
public class ScoreService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		if (user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		//Save changes
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0.0;
		for (Score s : movie.getScores()) {
			sum = sum + s.getValue();
		}
		
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		//Save Changes
		movie = movieRepository.save(movie);
		
		
		return new MovieDTO(movie);		
	}
	
	
}
