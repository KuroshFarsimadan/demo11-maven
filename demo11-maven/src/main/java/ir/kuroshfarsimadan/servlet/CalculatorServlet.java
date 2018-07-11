package ir.kuroshfarsimadan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ir.kuroshfarsimadan.calculator.Calculator;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculatorServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/jsp/calculator.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// First number
		int first = 0;
		String error1 = "";
		try {
			first = Integer.parseInt(request.getParameter("value1"));
		} catch (NumberFormatException e) {
			System.out.println("Value 1 is not a proper integer");
			error1 = "Value 1 is not a proper integer";
		}
		// Second number
		int second = 0;
		String error2 = "";
		try {
			second = Integer.parseInt(request.getParameter("value2"));
		} catch (NumberFormatException e) {
			System.out.println("Value 2 is not a proper integer");
			error2 = "Value 2 is not a proper integer";
		}

		// Calculate the sum with the calculator
		Calculator calc = new Calculator();
		int result = 0;
		String operation = request.getParameter("operation");
		if (operation != null && operation.equals("sum")) {
			System.out.println("Sum");
			result = calc.sum(first, second);
		} else if (operation != null && operation.equals("multiplication")) {
			System.out.println("Multiply");
			result = calc.multiply(first, second);
		} else {
			result = 0;
		}
		System.out.println("Result is " + result);
		// Forwarding back to JSP
		request.setAttribute("error", error1 + " " + error2);
		request.setAttribute("result", result);
		request.getRequestDispatcher("WEB-INF/jsp/calculator.jsp").forward(request, response);
	}

}