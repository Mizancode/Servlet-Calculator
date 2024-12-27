package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
	        "Why do Java developers wear glasses? Because they don't C#!",
	        "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
	        "Why don't programmers like nature? It has too many bugs.",
	        "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
	        // Add more jokes here
	    };

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num1=request.getParameter("num1");
		String num2=request.getParameter("num2");
		String operation=request.getParameter("bt");
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		int result=0;
		if(operation.equals("1")) {
			result=n1+n2;
		}else if(operation.equals("2")) {
			result=n1-n2;
		}else if(operation.equals("3")) {
			result=n1*n2;
		}else {
			result=n1/n2;
		}
		int randomIndex = (int) (Math.random() * jokes.length);
	     String randomJoke = jokes[randomIndex];
	     response.sendRedirect("index.jsp?ans="+result+"&joke="+randomJoke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
