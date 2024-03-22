import java.io.File;
import java.util.Scanner;

public class BT1_XML {
    public static void main(String[] args) {
        System.out.println("Vui lòng nhập đường dẫn thư mục:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();
        File direc = new File(path);

        if (!direc.exists() || !direc.isDirectory()) {
            System.out.println("Thư mục không tồn tại hoặc không hợp lệ.");
            return;
        }

        System.out.println("<" + direc.getName() + ">");
        listFiles(direc);
        System.out.println("</" + direc.getName() + ">");
    }
    public static void listFiles(File directory) {
        File[] files = directory.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("<" + file.getName() + ">");
                listFiles(file);
                System.out.println("</" + file.getName() + ">");
            } else {
                System.out.println("<file>" + file.getName() + "</file>");
            }
        }
    }
}

