package javaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindIP {
    private JPanel Ten_Mien;
    private JTextField jText_ten_mien;
    private JButton traCứuIPButton;
    private JTextArea jText_ket_qua;

    public FindIP() {
        traCứuIPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String ten_mien = jText_ten_mien.getText();
                    InetAddress a = InetAddress.getByName(ten_mien);
                    jText_ket_qua.setText("IP: " + a.getHostAddress());
                } catch (UnknownHostException ex) {
                    jText_ket_qua.setText("Không tìm thấy IP của tên miền!");
                }
            }
        });
    }

    public static void main(String[] args) {
            JFrame frame = new JFrame("Tìm IP");
            frame.setContentPane(new FindIP().Ten_Mien);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
    }

}
