package lab6;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
	private String imageName;
	
	Image(String name) {
		imageName = name;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void print() {
		System.out.println("Image with name:" + imageName);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public int add(Element elem) throws Exception {
		throw new Exception("Not supported by Leaf Elements.");
	}

	public void remove(Element elem) throws Exception {
		throw new Exception("Not supported by Leaf Elements.");
		
	}

	public Element getElement(int index) throws Exception {
		throw new Exception("Not supported by Leaf Elements.");
	}
}
