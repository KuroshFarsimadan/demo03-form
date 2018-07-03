package ir.kuroshfarsimadan.demo03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java EE DEMO 03
 */
@WebServlet("/show_inserted_name")
public class NameServlet extends HttpServlet {
	/*
	 * The serialization runtime associates with each serializable class a
	 * version number, called a serialVersionUID, which is used during
	 * deserialization to verify that the sender and receiver of a serialized
	 * object have loaded classes for that object that are compatible with
	 * respect to serialization. If the receiver has loaded a class for the
	 * object that has a different serialVersionUID than that of the
	 * corresponding sender's class, then deserialization will result in an
	 * InvalidClassException. A serializable class can declare its own
	 * serialVersionUID explicitly by declaring a field named "serialVersionUID"
	 * that must be static, final, and of type long:
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NameServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * getParameter
		 * 
		 * java.lang.String getParameter(java.lang.String name) Returns the
		 * value of a request parameter as a String, or null if the parameter
		 * does not exist. Request parameters are extra information sent with
		 * the request. For HTTP servlets, parameters are contained in the query
		 * string or posted form data. You should only use this method when you
		 * are sure the parameter has only one value. If the parameter might
		 * have more than one value, use getParameterValues(java.lang.String).
		 * 
		 * If you use this method with a multivalued parameter, the value
		 * returned is equal to the first value in the array returned by
		 * getParameterValues.
		 * 
		 * If the parameter data was sent in the request body, such as occurs
		 * with an HTTP POST request, then reading the body directly via
		 * getInputStream() or getReader() can interfere with the execution of
		 * this method.
		 * 
		 * Parameters: name - a String specifying the name of the parameter
		 * Returns: a String representing the single value of the parameter
		 */
		String insertedName = request.getParameter("firstname");

		PrintWriter wout = response.getWriter();

		wout.println("<!DOCTYPE html>");
		wout.println(
				"<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"></head><body>");
		wout.println("<p>Hello " + insertedName + "!</p>");
		wout.println("<p><a href=\"form.jsp\">Try again!</a></p>");
		wout.println("</body></html>");

	}

}
