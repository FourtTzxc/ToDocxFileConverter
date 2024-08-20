import java.io.File;
import java.nio.file.Path;
import javax.swing.*;
public class FileChoserWindow {
    private File pdfFile;
    private JFileChooser fileopen = new JFileChooser();
    static File fileDirect;
    public File openFileChoser(){
        int ret = fileopen.showDialog(null, "Открыть файл");

        if (ret == JFileChooser.APPROVE_OPTION) {
            pdfFile = fileopen.getSelectedFile();
            fileDirect= fileopen.getCurrentDirectory();
        }
        return pdfFile;


    }
}
