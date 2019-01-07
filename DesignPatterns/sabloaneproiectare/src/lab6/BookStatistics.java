package lab6;

public class BookStatistics implements Visitor {

    Integer imageCount;
    Integer tableCount;
    Integer paragraphCount;
    Integer sectionCount;
    Integer imageProxyCount;

    public BookStatistics(){
        this.imageCount = 0;
        this.tableCount = 0;
        this.paragraphCount = 0;
        this.sectionCount = 0;
        this.imageProxyCount = 0;
    }

    @Override
    public void visit(Image image) {
        this.imageCount = this.imageCount + 1;
    }

    @Override
    public void visit(Table table) {
        this.tableCount = this.tableCount + 1;
    }

    @Override
    public void visit(Paragraph paragraph) {
        this.paragraphCount = this.paragraphCount + 1;
    }

    @Override
    public void visit(Section section) {
        this.sectionCount = this.sectionCount + 1;
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        this.imageProxyCount = this.imageProxyCount + 1;
    }

    @Override
    public String toString() {
        return "BookStatistics{" +
                "imageCount=" + imageCount +
                ", tableCount=" + tableCount +
                ", paragraphCount=" + paragraphCount +
                ", sectionCount=" + sectionCount +
                ", imageProxyCount=" + imageProxyCount +
                '}';
    }
}
