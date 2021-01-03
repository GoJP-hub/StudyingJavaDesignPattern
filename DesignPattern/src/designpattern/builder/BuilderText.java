package designpattern.builder;

public class BuilderText extends BuilderBase {
	/****************************************
	 * Description--Create an instance for buffering the inserted words
	 * @author gohir
	 *****************************************/
	private StringBuffer buffer = new StringBuffer();

	/****************************************
	 * Description--Insert into template methods
	 * @author gohir
	 *****************************************/
	@Override
	public void makeTitle(String title) {
		// TODO 自動生成されたメソッド・スタブ
		buffer.append("=================================\n");
		buffer.append("[" + title + "]");
	}

	@Override
	public void makeMessage(String message) {
		// TODO 自動生成されたメソッド・スタブ
		buffer.append("・" + message);
		buffer.append("\n");
	}

	@Override
	public void makePoints(String[] points) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 0; i < points.length; i++) {
			buffer.append(">" + points[i] + "\n");
		}
		buffer.append("\n");
	}

	@Override
	public void close() {
		// TODO 自動生成されたメソッド・スタブ
		buffer.append("=================================\n");
	}

	/****************************************
	 * Description--Return all buffers inserted
	 * @author gohir
	 *****************************************/
	public String showResult() {
		return buffer.toString();
	}
}
