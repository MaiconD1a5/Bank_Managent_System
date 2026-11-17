
package bank.mangement.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel Label1, Label2, Label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton Button1, Button2, Button3;

    Login(){

        super("Bank Mangement System");

        //Location and Size of Logo
        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image logo2 = logo.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon logo3 = new ImageIcon(logo2);
        JLabel image = new JLabel(logo3);
        image.setBounds(350,10,100,100);
        add(image);

        //CardLogo
        ImageIcon CardLogo = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image CardLogo2 = CardLogo.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon CardLogo3 = new ImageIcon(CardLogo2);
        JLabel CardLogoimage = new JLabel(CardLogo3);
        CardLogoimage.setBounds(630,350,100,100);
        add(CardLogoimage);

        Label1 = new JLabel("WELLCOME TO ATM");
        Label1.setForeground(Color.white);
        Label1.setFont(new Font("AvantGarde", Font.BOLD,38));
        Label1.setBounds(230,125,450,40);
        add(Label1);

        Label2 = new JLabel("Card No: ");
        Label2.setFont(new Font("Ralway", Font.BOLD,28));
        Label2.setForeground(Color.white);
        Label2.setBounds(150,190,375,30);
        add(Label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);


        Label3 = new JLabel("PIN: ");
        Label3.setFont(new Font("Ralway", Font.BOLD,28));
        Label3.setForeground(Color.white);
        Label3.setBounds(150,250,375,30);
        add(Label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);

        Button1 = new JButton("Sign in");
        Button1.setFont(new Font("Arial", Font.BOLD, 14));
        Button1.setForeground(Color.WHITE);
        Button1.setBackground(Color.BLACK);
        Button1.setBounds(325,300,100,30);
        Button1.addActionListener(this);
        add(Button1);

        Button2 = new JButton("Clear");
        Button2.setFont(new Font("Arial", Font.BOLD, 14));
        Button2.setForeground(Color.WHITE);
        Button2.setBackground(Color.BLACK);
        Button2.setBounds(455,300,100,30);
        Button2.addActionListener(this);
        add(Button2);

        Button3 = new JButton("Sign up");
        Button3.setFont(new Font("Arial", Font.BOLD, 14));
        Button3.setForeground(Color.WHITE);
        Button3.setBackground(Color.BLACK);
        Button3.setBounds(325,350,230,30);
        Button3.addActionListener(this);
        add(Button3);

        //BackGround
        ImageIcon Background = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image Background2 = Background.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon Background3 = new ImageIcon(Background2);
        JLabel Bgimage = new JLabel(Background3);
        Bgimage.setBounds(0,0,850,480);
        add(Bgimage);


        //Location and Size of Screen
        setLayout(null);
        setSize(850, 480);
        setLocation(500,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource() ==Button1){

            } else if (e.getSource()==Button2) {
                textField2.setText("");
                passwordField3.setText("");
            }else if (e.getSource()==Button3){

            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    static void main(String[] args) {
        new Login();
    }
}
