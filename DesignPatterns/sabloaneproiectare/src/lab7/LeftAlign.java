package lab7;

public class LeftAlign implements AlignStrategy {
    @Override
    public void print(String text) {
        System.out.println(text + "+++++++++++++");
    }
}
