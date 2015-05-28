import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
import java.util.Arrays;

public class Kop {
    File file = new File("C://");
    File [] fileList = file.listFiles();

    public void getFileList() {
        System.out.println("Каталоги:");
        for (int i=0; i<fileList.length; i++) {
            if (fileList[i].isDirectory()) {
                System.out.println(fileList[i]);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Файлы");
        for (int i=0; i<fileList.length; i++) {
            if (fileList[i].isFile()) {
                System.out.println(fileList[i]);
            }
        }
    }

    public static void main(String[] args) {
        Kop n1 = new Kop();
        n1.getFileList();
    }


}
