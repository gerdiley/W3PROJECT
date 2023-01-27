package it.epicode.w3.dao;

import it.epicode.w3.entities.Prestito;
import it.epicode.w3.utils.JpaUtils;

public class PrestitoDAO {
	public static void addElement(Prestito o) {
		try {
			JpaUtils.t.begin();
			JpaUtils.em.persist(o);
			JpaUtils.t.commit();

			System.out.println("Prestito aggiunto correttamente!");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
