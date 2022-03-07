package com.org.admincontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionImpl;

import com.org.model.HibernateUtil;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		SessionImpl sessionImpl = (SessionImpl) session;
		Connection conn = sessionImpl.connection();
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		int fid = Integer.parseInt(id);

		try {
			session.beginTransaction();
			PreparedStatement stmt = conn.prepareStatement("delete from FlightDetails where FlightID=?");
			stmt.setInt(1, fid);

			int x = stmt.executeUpdate();

			if (x > 0) {
				out.print("<body>");
				out.print("Data Deleted Successfully");
				out.print(
						"<br> <a href='list'>Click here to view updated flight details</a><br>");
			} else {
				out.print("<body>");
				out.print("Error while deleting a data");
			}
			session.getTransaction().commit();
			session.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}