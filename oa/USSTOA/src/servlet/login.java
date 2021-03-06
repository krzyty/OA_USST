package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import dao.AdminDao;
import dao.UserDao;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public login() {
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		String id = request.getParameter("id");
		int ID = Integer.parseInt(id);
		String password = request.getParameter("password");
		String role = request.getParameter("role");

		HttpSession session = request.getSession();

		if (role.equals("user")) {
			if (new UserDao().selectUser(ID, password)) {
				synchronized (session) {
					session.setAttribute("ID", ID);
				}
				response.sendRedirect("/USSTOA/userMain.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "请输入正确的身份信息！");
				request.getRequestDispatcher("/login.jsp").forward(request,
						response);
			}
		} else if (role.equals("admin")) {
			if (new AdminDao().selectAdmin(ID, password)) {
				synchronized (session) {
					session.setAttribute("ID", ID);
				}
				response.sendRedirect("/USSTOA/adminMain.jsp");
			} else {
				JOptionPane.showMessageDialog(null, "请输入正确的身份信息！");
				request.getRequestDispatcher("/login.jsp").forward(request,
						response);
			}
		}
	}

}
