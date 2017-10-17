package com.cg.uas.service;

import com.cg.uas.dao.IUniversityLoginDAO;
import com.cg.uas.dao.UniversityLoginDAOImpl;
import com.cg.uas.dto.Users;
import com.cg.uas.exception.UniversityException;

public class UniversityLoginServiceImpl implements IUniversityLoginService {

	IUniversityLoginDAO udao=new UniversityLoginDAOImpl();
	@Override
	public Boolean validateUser(Users user) throws UniversityException {
		
		return udao.validateUser(user);
	}

}
