package create_file;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class CreateFile extends JFrame {
    private JPanel createFile;
    private JTextField JTextFolder;
    private JButton openButton;
    private JTextField JTextFileName;
    private JButton JButtonCreate;

    public CreateFile() {
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int result = jFileChooser.showOpenDialog((Component) e.getSource());
                if (result == JFileChooser.APPROVE_OPTION) {
                    String path = jFileChooser.getSelectedFile().getAbsolutePath();
                    JTextFolder.setText(path);
                }
            }
        });
        JButtonCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String path = JTextFolder.getText() + "/" + JTextFileName.getText();
                File myFile = new File(path);
                if (JTextFileName.getText().length() == 0){
                    JOptionPane.showMessageDialog((Component) e.getSource(),"Bạn chưa nhâp tên file");
                    return;
                }
                if (myFile.exists()){
                    JOptionPane.showMessageDialog((Component) e.getSource(),"Tập tin đã tồn tại!");
                }else {
                    try{
                        myFile.createNewFile();
                        JOptionPane.showMessageDialog((Component) e.getSource(),"Tạo file thành công!");
                    }catch (Exception exception){
                        JOptionPane.showMessageDialog((Component) e.getSource(),"Lỗi không tạo được!");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        CreateFile createFile = new CreateFile();
        createFile.setContentPane(createFile.createFile);
        createFile.setTitle("TẠO FILE");
        createFile.setSize(600,300);
        createFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createFile.setVisible(true);
    }
}
