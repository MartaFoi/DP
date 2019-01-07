package lab8;

public class Table implements Element {

	private String title;

	Table(String tableTitle) {
		title = tableTitle;
	}

	public void print() {
		System.out.println("Table with Title: " + title);
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

