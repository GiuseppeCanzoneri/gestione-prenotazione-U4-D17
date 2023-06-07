package com.example.demo.entities;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Prenotazione {

	private UUID id;

	private User user;

	private Postazione postazione;

	private LocalDate dataPrenotata;

	private LocalDate dataPrenotazione;

}
