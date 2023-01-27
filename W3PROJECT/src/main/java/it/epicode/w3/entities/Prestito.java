package it.epicode.w3.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "prestiti")
@Getter
@Setter
@NoArgsConstructor
public class Prestito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Utente utente;
	
	@OneToOne
	@JoinColumn(name="libro_id", referencedColumnName = "id")
	private Libro libro;
	
	@OneToOne
	@JoinColumn(name="rivista_id", referencedColumnName = "id")
	private  Rivista rivista;
	
	@Column (name = "inizio_prestito")
	private LocalDate dataInizioPrestito;
	
	@Column (name = "restituzione_prevista")
	private LocalDate restituzionePrevista;
	
	@Column (name = "restituzione_effettiva")
	private LocalDate restituzioneEffettiva;
}
