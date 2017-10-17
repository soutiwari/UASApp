package com.cg.uas.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cg.uas.DBUtil.DBUtil;
import com.cg.uas.dto.Users;
import com.cg.uas.exception.UniversityException;

public class UniversityLoginDAOImpl implements IUniversityLoginDAO {
	static String VALIDATE_QUERY="SELECT * FROM users WHERE login_Id=(?) and password=(?) and role=(?)";
	Connection conn;
	@Override
	public Boolean validateUser(Users user) throws UniversityException {
		conn=DBUtil.getConnection();
		try {
			PreparedStatement pst=conn.prepareStatement(VALIDATE_QUERY);
			pst.setString(1,user.getLoginId());
			pst.setString(2,user.getPassword());
			pst.setString(3,user.getRole());
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				return true;
			}
			else
				return false;
			
		} catch (SQLException e) {
			throw new UniversityException("Problem in getting details "+e.getMessage());
		}
	}

}
