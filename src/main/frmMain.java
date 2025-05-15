package main;

import javax.swing.*;
import logic_add_sub.frmCong;
import logic_add_sub.frmTru;
import logic_mul.frmNhan;
import logic_div.frmChia;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class frmMain extends JFrame implements ActionListener {
    private JButton btnCong, btnTru, btnNhan, btnChia;

    public frmMain() {
        setTitle("Calculator Navigation");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnCong = new JButton("Cộng");
        btnTru = new JButton("Trừ");
        btnNhan = new JButton("Nhân");
        btnChia = new JButton("Chia");

        btnCong.addActionListener(this);
        btnTru.addActionListener(this);
        btnNhan.addActionListener(this);
        btnChia.addActionListener(this);

        setLayout(new GridLayout(2, 2, 10, 10));
        add(btnCong);
        add(btnTru);
        add(btnNhan);
        add(btnChia);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCong) {
            new frmCong();
        } else if (e.getSource() == btnTru) {
            new frmTru();
        } else if (e.getSource() == btnNhan) {
            new frmNhan();
        } else if (e.getSource() == btnChia) {
            new frmChia();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new frmMain().setVisible(true);
        });
    }

}

