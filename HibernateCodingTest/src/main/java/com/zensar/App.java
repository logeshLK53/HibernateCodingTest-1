package com.zensar;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.zensar.bean.Address;
import com.zensar.bean.BankAccount;
import com.zensar.bean.Employee;
import com.zensar.bean.Skill;

public class App {

	public static void loadTesting() {
		// code to load employee object.
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateTest");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Employee employee = em.find(Employee.class, 1);
		System.out.println(employee);
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	public static void insertTesting() {
		// code to persist employee object.
		Address address = new Address("Coimbatore", "641202");

		BankAccount bankAcc = new BankAccount("ICICI7273000726");

		List<Skill> skillList = new ArrayList<>();
		Skill skill1 = new Skill("java", 7);
		skillList.add(skill1);

		Employee employee = new Employee("Logesh", 30000.00, address, skillList, bankAcc);
		address.setEmployee(employee);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateTest");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		insertTesting();
		loadTesting();
	}
}
