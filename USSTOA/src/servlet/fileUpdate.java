package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import dao.FileDao;

@WebServlet("/fileUpdate")
public class fileUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public fileUpdate() {
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

		String fileName = request.getParameter("fileName");
		String fileType = request.getParameter("fileType");

		if (new FileDao().updateFile(fileID, fileName, fileType) > 0) {
			JOptionPane.showMessageDialog(null, "修改成功！");
		} else {
			JOptionPane.showMessageDialog(null, "修改失败！");
		}

	}

}
