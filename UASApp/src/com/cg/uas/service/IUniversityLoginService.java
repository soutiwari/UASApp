package com.cg.uas.service;

import com.cg.uas.dto.Users;
import com.cg.uas.exception.UniversityException;

public interface IUniversityLoginService {

	Boolean validateUser(Users user) throws UniversityException;
}
