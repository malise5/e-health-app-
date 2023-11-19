package com.malise.app.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.malise.app.bean.UserBean;
import com.malise.app.bean.UserBeanI;
import com.malise.app.model.entity.User;

@WebServlet("/user")
// public class UserAction extends HttpServlet {
public class UserAction extends BaseAction {

  UserBeanI userBean = new UserBean();

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    User registerUser = new User();

    serializeForm(registerUser, req.getParameterMap());

    try {
      userBean.register(registerUser);
    } catch (SQLException e) {
      e.printStackTrace();
    }

    // String username = req.getParameter("username");
    // String password = req.getParameter("password");
    // String confirm_password = req.getParameter("confirm_password");

    // if (password.equals(confirm_password)) {
    // database.getUsers().add(new User(200L, username, password));
    // }

    resp.sendRedirect("./");

  }

}
