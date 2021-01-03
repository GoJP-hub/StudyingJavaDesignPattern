package designpattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BuilderHtml extends BuilderBase{
	/****************************************
	 * Description--Create an instance for ①name and ②writer to put contents into file
	 * ※Actual file is created at template method: makeTitle
	 * @author gohir
	 *****************************************/
	private String filename;
	private PrintWriter pw;

	/****************************************
	 * Description--Insert into template methods
	 * @author gohir
	 *****************************************/
	@Override
	public void makeTitle(String title) {
		// TODO 自動生成されたメソッド・スタブ
		filename = title + ".html";
		/****************************************
		 * Description--Create a file
		 * @author gohir
		 *****************************************/
		try {
			pw = new PrintWriter(new FileWriter(filename));
		}catch (IOException e) {
			e.printStackTrace();
		}

		/****************************************
		 * Description--Add title
		 * @author gohir
		 *****************************************/
		pw.println("<html><head><title>" + title + "</title></head><body>");
		pw.println("<h1>" + title + "</h1>");
	}

	@Override
	public void makeMessage(String message) {
		// TODO 自動生成されたメソッド・スタブ
		pw.println("<p>" + message + "</m>");
	}

	@Override
	public void makePoints(String[] points) {
		// TODO 自動生成されたメソッド・スタブ
		pw.println("<ul>");
		for (int i = 0; i < points.length; i++) {
			pw.println("<li>" + points[i] + "</li>");
		}
		pw.println("</ul>");
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		pw.println("</body></html>");
		pw.close();
	}

	/****************************************
	 * Description--Show the inserted items in String format
	 * @author gohir
	 *****************************************/
	public String showResult() {
		return filename;
	}
}
