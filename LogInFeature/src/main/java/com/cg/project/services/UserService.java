package com.cg.project.services;

import com.cg.project.beans.User;
import com.cg.project.daoservices.LogInDaoServices;

public class UserService  implements IUserService   {

	LogInDaoServices serviceDao;
	@Override
	public User acceptUserDetails(User users) {

		return 		serviceDao.save(users);
	}

}
