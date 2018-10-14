package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import matcher.Question;

/**
 * Servlet implementation class QuizServlet
 */
@WebServlet("/QuizServlet")
public class QuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuizServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Question one = new Question()
		
		Question one = new Question("Do you support gay marriage?", "marriage");
		Question two = new Question("Do you support gun control?", "guns");
		Question three = new Question("Do you believe in global warming?", "globalwarming");
		Question four = new Question("Do you think abortion should be legal?", "abortion");
		Question five = new Question("Should the government provide universal health care?", "abortion");

		Question[] allQuestions = {one, two,three,four,five};
		request.setAttribute("allQuestions", allQuestions);
		
		/**
		 * Question one = new Question()
		 * Question two = new Question()
		 * List [one, two, three, etc]
		 * request.setAttribute("listofquestions", List[one, two ...]);
		 */
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/quiz.jsp");
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
