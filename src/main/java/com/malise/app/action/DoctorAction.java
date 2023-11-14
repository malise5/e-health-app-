package com.malise.app.action;

import java.io.IOException;
// import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// import org.apache.commons.beanutils.BeanUtils;
// import org.apache.commons.lang3.StringUtils;

import com.malise.app.bean.DoctorBean;
import com.malise.app.bean.DoctorBeanI;
import com.malise.app.model.entity.Doctor;

@WebServlet("/doctor")
public class DoctorAction extends BaseAction {

  // private Doctor doctor = new Doctor();

  // private DoctorBeanI doctorBean = new DoctorBean();

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // HttpSession httpSession = req.getSession();

    // if (StringUtils.isNotBlank((String) httpSession.getAttribute("LoginId"))) {

    // Database database = Database.getDbInstance();
    // database.getDoctor().add(new Doctor(req.getParameter("index"),
    // req.getParameter("name"),
    // req.getParameter("email"), req.getParameter("specialization")));
    Doctor doctor = new Doctor();

    DoctorBeanI doctorBean = new DoctorBean();

    serializeForm(doctor, req.getParameterMap());

    doctorBean.addDoctors(doctor);

    // doctorBean.addDoctors(new Doctor(req.getParameter("index"),
    // req.getParameter("name"), req.getParameter("email"),
    // req.getParameter("specialization")));

    resp.sendRedirect("./home");

    // } else {
    // resp.sendRedirect("./");
    // }

  }

}