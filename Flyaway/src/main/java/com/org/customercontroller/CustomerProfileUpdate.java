package com.org.customercontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionImpl;

import com.org.model.HibernateUtil;

@WebServlet("/cupdate")
public class CustomerProfileUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		SessionImpl sessionImpl = (SessionImpl) session;
		Connection conn = sessionImpl.connection();
		PrintWriter out = response.getWriter();

		int id = (int) request.getSession().getAttribute("cid");
		String name = request.getParameter("uname");
		String age = request.getParameter("age");
		String city = request.getParameter("cof");

		try {
			session.beginTransaction();

			PreparedStatement stmt = conn.prepareStatement(
					"update CustomerDetails set Username=? , " + "Age=? , CityofResidence=? where CustomerID=?");

			stmt.setString(1, name);
			stmt.setInt(2, Integer.parseInt(age));
			stmt.setString(3, city);
			stmt.setInt(4, id);

			int x = stmt.executeUpdate();
			if (x > 0) {
				out.print("<body>");
				out.print("Data Updated Successfully");
				out.print(
						"<br> <a href='profile'>Click here to view updated profile</a><br>");
			} else {
				out.print("<body>");
				out.print("Error while updating a data");
			}

			session.getTransaction().commit();
			session.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}