package br.com.bgit.easyProject.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.bgit.easyProject.web.model.UserTO;

@Component
public class UserServices {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void save(UserTO user) {
		entityManager.persist(user);
	}

	@SuppressWarnings("unchecked")
	public List<UserTO> list() {
		return entityManager.createQuery("select u from UserTO u")
				.getResultList();
	}

}
