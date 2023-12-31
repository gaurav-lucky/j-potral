package com.jobportal.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jobportal.entity.Company;
import com.jobportal.service.CompanyService;

@Repository
@Transactional
@Component
public abstract class CompanyServiceImpl implements CompanyService {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<String> PasswordLookUp(String emailid) {

		Query query = entityManager.createQuery("SELECT password FROM Company c WHERE c.companyUser = :emailId ");
		query.setParameter("emailId", emailid);
		List<String> list = new ArrayList<String>();
		List<?> querylist = query.getResultList();
		for (Iterator<?> iterator = querylist.iterator(); iterator.hasNext();) {
			String pwd = (String) iterator.next();
			System.out.println(pwd + " is the password");
			list.add(pwd);
		}
		System.out.println("list :::::::::::::::::::::::::::::       " + list);
		return list;
	}
	
	public Company createCompany(Company c) throws Exception {
		try {
			entityManager.persist(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public Company getCompany(int id) {
		Company js = null;

		js = entityManager.find(Company.class, id);

		return js;
	}

	public Company updateCompany(Company js) {
		Company c = getCompany(js.getCompanyId());
		c.setCompanyName(js.getCompanyName());
		c.setCompanyUser(js.getCompanyUser());
		c.setDescription(js.getDescription());
		c.setHeadquarters(js.getHeadquarters());
		c.setVerified(js.isVerified());
		try {
			if (c != null) {
				entityManager.merge(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	public void verify(Company c) {
		Company c1 = getCompany(c.getCompanyId());
		c1.setVerified(c.isVerified());
		try {
			if (c != null) {
				entityManager.merge(c1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<?> getJobsByCompany(int companyId) {
		Query query = entityManager.createQuery(
				"SELECT jobId, title, description, responsibilites, location, salary, state, companyId, companyName FROM JobPostingsView jp WHERE jp.companyId = :companyId");
		query.setParameter("companyId", companyId);
		List<?> querylist = query.getResultList();
		return querylist;
	}
	
	@Override
	public List<Integer> getCompanyIdFromEmail(String emailid) {

		Query query = entityManager.createQuery("SELECT companyId FROM Company c WHERE c.companyUser = :emailId ");
		query.setParameter("emailId", emailid);
		List<Integer> list = new ArrayList<Integer>();
		List<?> querylist = query.getResultList();
		for (Iterator<?> iterator = querylist.iterator(); iterator.hasNext();) {
			int cid = (int) iterator.next();
			list.add(cid);
		}
		return list;
	}
}
