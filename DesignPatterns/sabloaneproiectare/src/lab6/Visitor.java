package lab6;

public interface Visitor {
    void visit(Image image);
    void visit(Table table);
    void visit(Paragraph paragraph);
    void visit(Section section);
    void visit(ImageProxy imageProxy);
}
