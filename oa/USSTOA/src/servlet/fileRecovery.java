package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import dao.FileDao;

@WebServlet("/fileRecovery")
public class fileRecovery extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public fileRecovery() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		String fileid = request.getParameter("fileID");
		int fileID = Integer.parseInt(fileid);

		if (new FileDao().fileRecovery(fileID) > 0) {
			JOptionPane.showMessageDialog(null, "回收成功！");
			request.getRequestDispatcher("/filemanage.jsp").forward(request,
					response);
		} else {
			JOptionPane.showMessageDialog(null, "回收失败！");
			request.getRequestDispatcher("/filemanage.jsp").forward(request,
					response);
		}
	}

}
