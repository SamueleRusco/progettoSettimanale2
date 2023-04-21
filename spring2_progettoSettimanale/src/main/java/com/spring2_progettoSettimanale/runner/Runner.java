package com.spring2_progettoSettimanale.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.spring2_progettoSettimanale.service.DispositiviService;
import com.spring2_progettoSettimanale.model.Dispositivo;
import com.spring2_progettoSettimanale.model.Stato;
import com.spring2_progettoSettimanale.model.Tipologia;
import com.spring2_progettoSettimanale.model.Utente;
import com.spring2_progettoSettimanale.service.UtenteService;



@Component

public class Runner implements ApplicationRunner {
	
	@Autowired
	UtenteService utenteService;
	
	@Autowired
	DispositiviService dispositiviService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("runner ok");
		
		
			//utenteService.saveFakeUtente();
		
		
		Dispositivo d = new Dispositivo();
		
		d.setStato(Stato.ASSEGNATO);
		d.setTipologia(Tipologia.TABLET);
		d.setUtente(utenteService.findById(1l));
		
		
		
		dispositiviService.saveDispositivo(d);
		
		


	}
	
	

}
