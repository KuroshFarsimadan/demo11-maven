package ir.kuroshfarsimadan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ir.kuroshfarsimadan.clock.Clock;
import ir.kuroshfarsimadan.clock.FinnishDateTimeClock;
import ir.kuroshfarsimadan.clock.SystemClockSource;

/**
 * Servlet implementation class ClockServlet
 */
@WebServlet("/clock")
public class ClockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ClockServlet() {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Clock clock = new FinnishDateTimeClock(new SystemClockSource());

		request.setAttribute("time", clock.getTime());
		request.setAttribute("date", clock.getDate());
		request.setAttribute("test", "test");
		request.getRequestDispatcher("WEB-INF/jsp/clock.jsp").forward(request, response);
	}

}