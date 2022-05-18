package br.dev.mvidal.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.mvidal.dsmovie.entities.Score;
import br.dev.mvidal.dsmovie.entities.ScorePk;


public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}
