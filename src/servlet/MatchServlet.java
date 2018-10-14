package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MatchServlet
 */
@WebServlet("/MatchServlet")
public class MatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside the MatchServlet.java class");
		
		// Receive the strings passed by the AJAX call in loadResults.js
		String marriage = request.getParameter("marriage_question");
		String guns = request.getParameter("guns_question");
		String globalwarming = request.getParameter("globalwarming_question");
		String abortion = request.getParameter("abortion_question");
		String healthcare = request.getParameter("healthcare_question");


		
		// Check if the answers came out correctly
		System.out.println("marriage: " + marriage);
		System.out.println("guns: " + guns);
		System.out.println("global warming: " + globalwarming);
		System.out.println("abortion: " + abortion);
		System.out.println("health care: " + healthcare);


		
		// Save the values of the strings so they can be used in the JSP file
		request.setAttribute("answer1", marriage);
		request.setAttribute("answer2", guns);
		request.setAttribute("answer3", globalwarming);
		request.setAttribute("answer4", abortion);
		request.setAttribute("answer5", healthcare);


		
		
		// Forwards the info from this servlet to the JSP
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/results.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
