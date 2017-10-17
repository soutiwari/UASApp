package com.cg.uas.dao;

import com.cg.uas.dto.Users;
import com.cg.uas.exception.UniversityException;

public interface IUniversityLoginDAO {

	Boolean validateUser(Users user) throws UniversityException;
}
