package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;
import com.jsp.dto.Admin;
import com.jsp.dto.Admin;
import com.jsp.dto.Admin;

public class AdminDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("god");

	public Admin saveAdmin(Admin admin) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (admin != null) {
			entityTransaction.begin();
			entityManager.persist(admin);
			entityTransaction.commit();
		}
		return admin;
	}
	public Admin updateAdmin(Admin admin) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Admin admin2 = entityManager.find(Admin.class, admin.getId());

		if (admin2 != null) {
			entityTransaction.begin();
			entityManager.merge(admin);
			entityTransaction.commit();
		}
		return admin2;
	}
	public Admin deleteAdmin(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Admin admin = entityManager.find(Admin.class, id);
		if (admin != null) {
			entityTransaction.begin();
			entityManager.remove(admin);
			entityTransaction.commit();
		}
		return admin;
	}

	public Admin getAdminById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Admin.class, id);
	}

	public List<Admin> getAllAdmin() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select a from Admin a");
		return query.getResultList();
	}
}