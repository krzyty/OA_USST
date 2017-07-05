package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.File;
import dao.FileDao;

@WebServlet("/fileSearch")
public class fileSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public fileSearch() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String fileName = request.getParameter("fileName");
		int ID = ((Integer) request.getSession().getAttribute("ID")).intValue();

		List<File> searchFilesList = new FileDao().searchFiles(ID, fileName);

		request.setAttribute("searchFilesList", searchFilesList);
		request.getRequestDispatcher("fileSearch.jsp").forward(request,
				response);
	}
}
