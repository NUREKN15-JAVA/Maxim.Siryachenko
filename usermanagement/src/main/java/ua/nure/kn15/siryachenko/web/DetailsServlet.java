package ua.nure.kn15.siryachenko.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.nure.kn15.siryachenko.User;

/**
 * Servlet for viewing a user's data in the database
 */
public class DetailsServlet extends EditServlet {
	@Override
	protected void showPage(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.getRequestDispatcher("/details.jsp").forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void processUser(User user) {
	}
}
