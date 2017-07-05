package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import dao.FileDao;

@WebServlet("/fileThoroughDelete")
public class fileThoroughDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public fileThoroughDelete() {
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
		if (new FileDao().fileThoroughDelete(fileID) > 0) {
			JOptionPane.showMessageDialog(null, "已彻底删除！");
		} else {
			JOptionPane.showMessageDialog(null, "修改失败！");
		}
	}

}
