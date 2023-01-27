package it.epicode.w3.entities;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "libri")
@Getter
@Setter
@NoArgsConstructor
@NamedQuery(name = "removeByIsbn", query = "DELETE Libro l WHERE l.isbn = :n")
@NamedQuery(name = "getByIsbn", query = "SELECT l FROM Libro l WHERE l.isbn = :n")
@NamedQuery(name = "getByAutore", query = "SELECT l FROM Libro l WHERE l.autore = :a")
@NamedQuery(name = "getByTitolo", query = "SELECT l FROM Libro l WHERE l.titolo LIKE :a")
@NamedQuery(name = "getByAnno", query = "SELECT l FROM Libro l WHERE l.annoPubblicazione = :n")

public class Libro extends ArticoloDiLettura {
	
	// ----------------------PROPRIETA--------------------------	
	
		private String autore;
		private String genere;
		
	    // ----------------------- COSTRUTTORE ---------------------
		
		public Libro(String isbn, String titolo, int annoPubblicazione, int numeroPagine, String autore,
				String genere) {
			super(isbn, titolo, annoPubblicazione, numeroPagine);

			this.autore = autore;
			this.genere = genere;
		}

		@Override
		public String toString() {
			return "Libro [ autore=" + autore + ", genere=" + genere + "Titolo = " + getTitolo() + "]";
		}

		

}
