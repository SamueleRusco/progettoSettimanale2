package com.spring2_progettoSettimanale.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.spring2_progettoSettimanale.model.Dispositivo;
import com.spring2_progettoSettimanale.model.Stato;
import com.spring2_progettoSettimanale.model.Tipologia;
import com.spring2_progettoSettimanale.model.Utente;


@Repository
public interface DispositiviRepository extends CrudRepository<Dispositivo, Long>, PagingAndSortingRepository<Dispositivo, Long> {
	
	
	
	Page<Dispositivo> findByStatoAndTipologia(Stato stato, Tipologia tipologia, Pageable pageable);
	List<Dispositivo> findByUtente(Utente u);
	Page<Dispositivo> findByStato(Stato stato, Pageable pageable);
	Page<Dispositivo> findByTipologia(Tipologia tipologia, Pageable pageable);


	
}
