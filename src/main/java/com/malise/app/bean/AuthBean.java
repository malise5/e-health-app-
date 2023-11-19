package com.malise.app.bean;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.malise.app.model.entity.User;
import com.malise.database.MysqlDb;

public class AuthBean implements AuthBeanI, Serializable {

  // Database database = Database.getDbInstance();

  public User authenticate(User loginUser) throws SQLException {

    // User userDetails = null;

    // for (User user : database.getUsers()) {
    // if (loginUser.getUsername().equals(user.getUsername()) &&
    // loginUser.getPassword().equals(user.getPassword())) {
    // userDetails = user;

    // break;

    // }

    // }

    // return userDetails;

    PreparedStatement statement = MysqlDb.getInstance().getConnection()
        .prepareStatement("SELECT id,username from users WHERE username=? and password=?");

    statement.setString(1, loginUser.getUsername());
    statement.setString(2, loginUser.getPassword());

    ResultSet result = statement.executeQuery();

    User user = new User();

    while (result.next()) {
      user.setId(result.getLong("id"));
      user.setUsername(result.getString("username"));
    }

    return user;

    // return (User) database.getData(User.class)
    // .stream()
    // .filter(user -> ((User) user).getUsername().equals(loginUser.getUsername())
    // && ((User) user).getPassword().equals(loginUser.getPassword()))
    // .findAny()
    // .orElse(null);
  }

}
