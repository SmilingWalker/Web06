package com.frank.Service;

import com.frank.Dao.UserDao;
import com.frank.domain.User;

import java.sql.SQLException;

public class UserService {
    public boolean findUser(User user) throws SQLException {
        UserDao userDao = new UserDao();
        User temp = userDao.findUser(user);
        return (temp !=null);
    }
}
