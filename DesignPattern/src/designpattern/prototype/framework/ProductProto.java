package designpattern.prototype.framework;

public interface ProductProto extends Cloneable {
	public abstract void use(String s);

	public abstract ProductProto createClone();
}
