package lab4;

public class CenterAlign implements AlignStrategy{
    @Override
    public void print(String text) {
        System.out.println("+++++" + text + "+++++");
    }
}
