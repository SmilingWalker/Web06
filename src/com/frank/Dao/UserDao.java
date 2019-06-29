package com.frank.Dao;

import com.frank.domain.User;
import org.apache.commons.dbutils.QueryRunner;
import com.yl.lain.utils.C3p0DataSourceUtils;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDao {
    public User findUser(User user) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3p0DataSourceUtils.getDataSource());
        String sql = "Select * from register where username = ? and password = ?";
         return  queryRunner.query(sql,new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());

    }
}
