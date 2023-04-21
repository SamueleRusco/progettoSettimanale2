package com.spring2_progettoSettimanale.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import com.github.javafaker.Faker;

import com.spring2_progettoSettimanale.model.Dispositivo;
import com.spring2_progettoSettimanale.model.Stato;
import com.spring2_progettoSettimanale.model.Tipologia;
import com.spring2_progettoSettimanale.model.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class DispositivoConfiguration {
	
	@Bean("ParamsD")
    @Scope("prototype")
    public Dispositivo paramsDispositivo(Tipologia tipologia,Stato stato){
		return new Dispositivo(null, tipologia, stato, null);
	}
	


}
