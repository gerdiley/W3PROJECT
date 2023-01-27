package it.epicode.w3.dao;

import it.epicode.w3.utils.JpaUtils;

public class RivistaDAO {
	public static void addElement(Object o) {
		try {
			JpaUtils.t.begin();
			JpaUtils.em.persist(o);
			JpaUtils.t.commit();

			System.out.println("Rvista aggiunto correttamente!");
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
