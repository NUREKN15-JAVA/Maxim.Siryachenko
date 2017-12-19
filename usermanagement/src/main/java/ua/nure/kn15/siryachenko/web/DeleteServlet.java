package ua.nure.kn15.siryachenko.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.nure.kn15.siryachenko.User;
import ua.nure.kn15.siryachenko.db.DaoFactory;
import ua.nure.kn15.siryachenko.db.DatabaseException;

/**
 * Servlet for deleting a user's entry to the database
 */
public class DeleteServlet extends EditServlet {
	@Override
	protected void processUser(User user) {
		try {
			DaoFactory.getInstance().getUserDao().delete(user);
		} catch (DatabaseException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void showPage(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.getRequestDispatcher("/delete.jsp").forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
