package logic_add_sub;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmTru extends JFrame implements ActionListener {
    private JTextField txtSo1, txtSo2;
    private JButton btnTinh;
    private JLabel lblKetQua;

    public frmTru() {
        setTitle("Form Trá»«");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Sá»‘ thá»© nháº¥t:"));
        txtSo1 = new JTextField();
        add(txtSo1);

        add(new JLabel("Sá»‘ thá»© hai:"));
        txtSo2 = new JTextField();
        add(txtSo2);

        btnTinh = new JButton("TÃ­nh");
        btnTinh.addActionListener(this);
        add(btnTinh);

        lblKetQua = new JLabel("Káº¿t quáº£: ");
        add(lblKetQua);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double so1 = Double.parseDouble(txtSo1.getText());
            double so2 = Double.parseDouble(txtSo2.getText());
            double ketQua = so1 - so2;
            lblKetQua.setText("Káº¿t quáº£: " + ketQua);
        } catch (NumberFormatException ex) {
            lblKetQua.setText("Vui lÃ²ng nháº­p sá»‘ há»£p lá»‡!");
        }
    }

    public static void main(String[] args) {
        new frmTru();
    }

}

