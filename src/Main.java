import View.FileGetter;

public class Main {
    public static void main(String[] args) {
        String data = FileGetter.SelectFile();
        System.out.println(data);
    }
}