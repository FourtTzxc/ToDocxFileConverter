import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;
import java.io.*;

public class Window {
    private JFrame frame = new JFrame("PDF TO WORD");
    private GridLayout layout = new GridLayout(1,1);
    private JPanel panel = new JPanel(layout);
    private Button openButton = new Button("Открыть файл");
    private FileConverter fileConverter = new FileConverter();
    private File finalFile;
    public Window(){
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.add(openButton);
        frame.setSize(300,300);
        frame.setLocation(300,300);
    }
    public void open(){
        frame.setVisible(true);
        panel.setVisible(true);
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                FileChoserWindow fileChoserWindow = new FileChoserWindow();
                finalFile = fileConverter.convertFile(fileChoserWindow.openFileChoser());

                finalFile.renameTo(fileConverter.getNameFile());
                System.exit(1);


            }
        });
    }

}
