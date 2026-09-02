package org.yourcompany.yourproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    JButton login,clear,Signup;
    JTextField  cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setLayout(null);

        setTitle("Automated teller machine");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome To Atm");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("Card no:");
        cardno.setFont(new Font("raleway", Font.BOLD, 30));
        cardno.setBounds(120, 150, 150, 40);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        add(cardTextField);

        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Osward", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        pinTextField = new JPasswordField ();
        pinTextField.setBounds(300, 220, 250, 30);
        add(pinTextField);

        login = new JButton("Sign in");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.WHITE);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.WHITE);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);

        Signup = new JButton("SIGN UP");
        Signup.setBounds(300,350,230,30);
        Signup.setBackground(Color.WHITE);
        Signup.setForeground(Color.BLACK);
        Signup.addActionListener(this);
        add(Signup);


        getContentPane().setBackground(Color.white);
        setSize(800,480);
        setVisible(true);
        setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");

        }else if(ae.getSource() == login){

        }else if(ae.getSource() == Signup){
            setVisible(false);
            new SignupONE().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
