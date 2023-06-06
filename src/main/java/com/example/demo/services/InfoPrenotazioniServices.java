package com.example.demo.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class InfoPrenotazioniServices {

	private Map<String, List<String>> infoByLanguage;
	private Map<String, List<String>> infoOrdination;

	public InfoPrenotazioniServices() {
		// Inizializza le regole per ogni lingua supportata
		infoByLanguage = new HashMap<>();
		infoByLanguage.put("it", List.of("Regole in italiano..."));
		infoByLanguage.put("en", List.of("Rules in English..."));

		infoOrdination = new HashMap<>();
		infoOrdination.put("it", List.of(
				"Effettua la prenotazione con anticipo: Assicurati di prenotare il tuo appuntamento con un adeguato preavviso per garantire la disponibilità del servizio richiesto.",
				"Rispetta l'orario concordato: Sii puntuale per la tua prenotazione. Se sei in ritardo, potresti perdere il tuo slot di prenotazione o dover aspettare più a lungo",
				"Cancella o modifica la prenotazione con adeguato preavviso: Se non puoi rispettare la tua prenotazione, assicurati di cancellarla o modificarla con un preavviso sufficiente per consentire ad altri di prenotare l'orario disponibile."));
		infoOrdination.put("en", List.of(
				"Make the reservation in advance: Ensure to book your appointment with sufficient notice to secure the availability of the desired service.",
				"Respect the agreed-upon time: Be punctual for your reservation. If you are late, you may risk losing your time slot or have to wait longer.",
				"Cancel or modify the booking with appropriate notice: If you are unable to honor your reservation, make sure to cancel or modify it with sufficient notice to allow others to book the available time."));
	}

	public List<String> getRulesByLanguage(String lang) {
		// Controlla se la lingua è supportata
		if (!infoByLanguage.containsKey(lang)) {
			System.out.println("Lingua non supportata: " + lang);
			return List.of("Lingua non supportata: " + lang);
		}

		// Recupera le regole per la lingua specificata
		return infoByLanguage.get(lang);
	}

	public List<String> getOrdinByLanguage(String lang) {
		// Controlla se la lingua è supportata
		if (!infoOrdination.containsKey(lang)) {
			System.out.println("Regole dell'ordine con Lingua non supportata: " + lang);
			return List.of("Regole dell'ordine con Lingua non supportata: " + lang);
		}

		// Recupera il testo delle regole dell'ordine per la lingua specificata
		return infoOrdination.get(lang);
	}
}
