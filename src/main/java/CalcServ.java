
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class CalcServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		double x;
		double y;
		String str="";
		x=Double.parseDouble(request.getParameter("num1"));
		y=Double.parseDouble(request.getParameter("num2"));
		str=request.getParameter("operation");
		if(str.equals("add"))
			out.println("<h1>Result of Addition is: "+ (x+y)+ "</h1>");
		else if(str.equals("sub"))
			out.println("<h1>Result of Subtraction is: "+ (x-y)+ "</h1>");
		else if(str.equals("mul"))
			out.println("<h1>Result of Multiplication is: "+ (x*y)+ "</h1>");
		else if(str.equals("div"))
			if(y==0) {
				out.println("<h1>It cannot bt zero it deals infinity as answer");
			}
			else out.println("<h1>Result of Division is: "+ (x/y)+ "</h1>");
		
	}

	
}
