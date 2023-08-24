package calculator.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculator.model.NumberBean;

@WebServlet("/calculator.action")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String operator = request.getParameter("operator");
		double operand1 = Double.parseDouble(request.getParameter("operand1"));
		double operand2 = Double.parseDouble(request.getParameter("operand2"));
		
		NumberBean number = new NumberBean(operator, operand1, operand2);
		number.determineOperation();
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("	<head><title>Basic Calculator</title></head>");
		out.print("	<body>");
		out.print(" <p><b>The selected mathematical operation is "+ number.getOperation() +"</b></p>");
		out.print(number.displayOperation());
		out.print(" <p>Thank you very much for using the system.</p>");
		out.print("		<form action='index.html'>");
		out.print("			<p><input type='submit' value='GO BACK'/></p>");
		out.print("		</form>");
		out.print("	</body>");
		out.print("</html>");
	}

}
