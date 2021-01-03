package designpattern.builder;

public abstract class BuilderBase {
	public abstract void makeTitle(String title);
	public abstract void makeMessage(String message);
	public abstract void makePoints(String[] points);
	public abstract void close();
}
