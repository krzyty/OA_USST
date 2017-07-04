package servlet;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;

import model.User;
import dao.FileDao;

@WebServlet("/fileUpload")
@MultipartConfig(location = "D:\\", fileSizeThreshold = 4096)
public class fileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public fileUpload() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		String fileName = request.getParameter("fileName");
		String fileType = request.getParameter("fileType");
		Date fileDate = new Date();

		String path = this.getServletContext().getRealPath("/");

		Part p = request.getPart("fileSrc");

		if (p.getSize() > 1024 * 1024 * 4) {
			p.delete();
			JOptionPane.showMessageDialog(null, "文件超过了4M！");
		} else {
			path = path + "\\file\\";
			File f = new File(path);
			if (!f.exists()) {
				f.mkdir();
			}

			String h = p.getHeader("content-disposition");
			String string = h
					.substring(h.lastIndexOf(";") + 12, h.length() - 1);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
			String fname = sdf.format(fileDate).toString()
					+ request.getSession().getAttribute("ID") + string;
			p.write(path + "\\" + fname);
			String fileAddress = "\\USSTOA\\" + "\\file\\" + fname;

			float fileSize = (float) p.getSize();

			model.File file = new model.File();
			file.setFileName(fileName);
			file.setFileType(fileType);
			file.setFileDate(fileDate);
			file.setFileSize(fileSize);
			file.setFileAddress(fileAddress);

			User user = new User();
			user.setUserID(((Integer) request.getSession().getAttribute("ID"))
					.intValue());
			file.setUser(user);

			if (new FileDao().addFile(file) > 0) {
				JOptionPane.showMessageDialog(null, "文件上传成功！");
			} else {
				JOptionPane.showMessageDialog(null, "文件上传失败！");
			}

		}

	}
}
