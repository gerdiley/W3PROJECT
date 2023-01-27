package it.epicode.w3.dao;

import it.epicode.w3.utils.JpaUtils;

public class UtenteDAO {
	public static void addElement(Object o) {
		try {
			JpaUtils.t.begin();
			JpaUtils.em.persist(o);
			JpaUtils.t.commit();

			System.out.println("Utente aggiunto correttamente!");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
