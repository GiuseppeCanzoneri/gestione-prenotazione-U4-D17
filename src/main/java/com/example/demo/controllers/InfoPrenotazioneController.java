package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.InfoPrenotazioniServices;

@RestController
public class InfoPrenotazioneController {

	private InfoPrenotazioniServices infoPrenSrv;

	public InfoPrenotazioneController(InfoPrenotazioniServices infoPrenSrv) {
		this.infoPrenSrv = infoPrenSrv;
	}

	@GetMapping("/customRules")
	public List<String> getCustomRules(@RequestParam("lang") String lang) {
		List<String> rules = new ArrayList<>();
		rules.addAll(infoPrenSrv.getRulesByLanguage(lang));
		rules.addAll(infoPrenSrv.getOrdinByLanguage(lang));
		return rules;
	}
}
