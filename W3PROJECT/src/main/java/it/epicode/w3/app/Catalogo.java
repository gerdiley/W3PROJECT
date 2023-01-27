package it.epicode.w3.app;

import java.time.LocalDate;

import it.epicode.w3.dao.LibroDAO;
import it.epicode.w3.dao.PrestitoDAO;
import it.epicode.w3.dao.RivistaDAO;
import it.epicode.w3.dao.UtenteDAO;
import it.epicode.w3.entities.Libro;
import it.epicode.w3.entities.Periodicita;
import it.epicode.w3.entities.Prestito;
import it.epicode.w3.entities.Rivista;
import it.epicode.w3.entities.Utente;

public class Catalogo {
	public static void main(String[] args) {
		//------------LIBRI---------
		Libro l1 = new Libro();
		l1.setAutore("Angelo");
		l1.setGenere("Fantasy");
		l1.setIsbn("l1");
		l1.setNumeroPagine(100);
		l1.setTitolo("Titolo 1");
		l1.setAnnoPubblicazione(2022);
		
		Rivista r1 = new Rivista();
		r1.setIsbn("l1");
		r1.setNumeroPagine(100);
		r1.setTitolo("Titolo 1");
		r1.setAnnoPubblicazione(2022);
		r1.setPeriodicita(Periodicita.semestrale);
		
		
		
//		LibroDAO.addElement(l1);
		RivistaDAO.addElement(r1);
		
		//------------UTENTI--------
		
		Utente u1 = new Utente();
		u1.setCognome("Di Letizia");
		u1.setNome("Gerardo");
		u1.setDataNascita("01-12-1994");
		u1.setNumeroTessera(10);
		
		Utente u2 = new Utente();
		u2.setCognome("Midolo");
		u2.setNome("Angelo");
		u2.setDataNascita("01-05-1997");
		u2.setNumeroTessera(11);
		
//		UtenteDAO.addElement(u1);
//		UtenteDAO.addElement(u2);
		
		// ----------PRESTITO--------
		
		Prestito p1 = new Prestito();
		p1.setLibro(l1);
		p1.setRivista(r1);
		p1.setDataInizioPrestito(LocalDate.parse("2022-01-20"));
		p1.setUtente(u2);
		p1.setDataInizioPrestito(LocalDate.parse("2022-10-09"));
		p1.setRestituzionePrevista(LocalDate.parse("2022-12-09"));
		
		
//		PrestitoDAO.addElement(p1);
		
		//---------METODI DAO----------
		
//		LibroDAO.removeByIsbn("l1");
//		
// 		LibroDAO.getByIsbn("l1");
// 		
//		LibroDAO.getByAnno(2022);
//		
//		LibroDAO.getByAutore("Angelo");
//		
//		LibroDAO.getByTitolo("Tito");
		
		
		
}
}
