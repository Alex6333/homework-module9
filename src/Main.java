import java.io.File;

public class Main {

    public static void main(String[] args) {
        File folder = new File("C:\\Program Files\\Git\\dev");
        int count = getFilesCount(folder);
        System.out.println(count + " шт. файлов в папке.");
    }

    private static int getFilesCount(File folder) {
        File[] files = folder.listFiles();
        int count = 0;
        assert files != null;
        for (File file : files) {
            if (file.isFile()) {
                count++;
            } else {
                count += getFilesCount(file);
            }
        }
        return count;
    }
}
