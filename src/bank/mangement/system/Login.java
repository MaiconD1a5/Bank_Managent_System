
package bank.mangement.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JLabel label1;

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

        label1 = new JLabel("WELLCOME TO ATM");
        //    label1.setForeground();
        label1.setBounds(230,125,450,40);
        add(label1);

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
    static void main(String[] args) {
        new Login();
    }
}
