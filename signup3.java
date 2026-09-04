package org.yourcompany.yourproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class signup3 extends JFrame implements ActionListener
{

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    String formno;

    public signup3(String formno) {
        this.formno=formno;
        setTitle("card details page 3");
        setLayout(null);



        JLabel l1 = new JLabel("Page 3 : Account details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1); 
        
         JLabel l2 = new JLabel("Account Type");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(100,130,400,40);
        add(l2); 
        
        r1 = new JRadioButton("savings account");
        r1.setFont(new Font("raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 150, 20);
        add(r1);


        r2 = new JRadioButton("Fixed deposit");
        r2.setFont(new Font("raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 180, 250, 20);
        add(r2);

        r3 = new JRadioButton("current account");
        r3.setFont(new Font("raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220, 250, 20);
        add(r3);

        r4 = new JRadioButton("reoccuring account");
        r4.setFont(new Font("raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 220, 250, 20);
        add(r4);

        ButtonGroup accButtonGroup = new ButtonGroup();
        accButtonGroup.add(r1);
        accButtonGroup.add(r2);
        accButtonGroup.add(r3);
        accButtonGroup.add(r4);

        JLabel cardno = new JLabel("Card Number:");
        cardno.setFont(new Font("Raleway",Font.BOLD,22));
        cardno.setBounds(100,300,200,30);
        add(cardno);

        JLabel no = new JLabel("XXXX - XXXX - XXXX - 4184");
        no.setFont(new Font("Raleway",Font.BOLD,22));
        no.setBounds(330,300,300,30);
        add(no);

        JLabel carddetail = new JLabel("Your 16 digit Card Number:");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,330,300,20);
        add(carddetail);




          JLabel pinno = new JLabel("Pin Number:");
        pinno.setFont(new Font("Raleway",Font.BOLD,22));
        pinno.setBounds(100,370,200,30);
        add(pinno);

        JLabel no1 = new JLabel("XXXX ");
        no1.setFont(new Font("Raleway",Font.BOLD,22));
        no1.setBounds(330,370,300,30);
        add(no1);

        JLabel pindetail = new JLabel("Your 4 digit Card Number:");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,400,300,20);
        add(pindetail);

        JLabel service = new JLabel("Service Required:");
        service.setFont(new Font("Raleway",Font.BOLD,22));
        service.setBounds(100,450,400,30);
        add(service);

        c1 = new JCheckBox("Atm card");
        c1.setBackground(Color.WHITE);
        c1.setBounds(100, 500, 200, 30);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        add(c1);


        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setBounds(350, 500, 200, 30);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        add(c2);


        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setBounds(100, 550, 200, 30);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        add(c3);



        c4 = new JCheckBox("Email and sms alerts");
        c4.setBackground(Color.WHITE);
        c4.setBounds(350, 550, 200, 30);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        add(c4);



        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setBounds(100, 600, 200, 30);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        add(c5);



        c6 = new JCheckBox("E Statement");
        c6.setBackground(Color.WHITE);
        c6.setBounds(350, 600, 200, 30);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        add(c6);



        c7 = new JCheckBox("I Hereby Declare above details are  correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setBounds(100, 680, 600, 20);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        add(c7);


        submit = new JButton("SUBMIT");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);


        cancel = new JButton("cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(450,720,100,30);
        cancel.addActionListener(this);
        add(cancel);




        setSize(850,820);
        setLocation(350,0);
        setVisible(true);



    }
    public void actionPerformed(ActionEvent ae){

        if (!c7.isSelected()) {
            JOptionPane.showMessageDialog(null,
                    "Please accept the declaration before submitting.");
            return;
        }

        if(ae.getSource()== submit){
            String accountType=null;
            if(r1.isSelected()){
                accountType = "Savings account";
            }else if(r2.isSelected()){
                accountType = "Fixed deposit account";
            }else if(r3.isSelected()){
                accountType = "Current account";
            }else if(r4.isSelected()){
                accountType ="reoccuring account";
            }

            Random random = new Random();
            long first = 5040936000000000L;
            long cardNumber = first + Math.abs(random.nextLong() % 100000000L);
            String card = String.valueOf(cardNumber);

            String pin = ""+ Math.abs((random.nextLong()%9000L)+1000L);

            String facility = "";
            if(c1.isSelected()){
                facility = facility + "ATM Card";
            }else if(c2.isSelected()){
                facility = facility + "Internet Banking";
            }else if(c3.isSelected()){
                facility = facility + "Mobile Banking";
            }else if(c4.isSelected()){
                facility = facility + "Email and sms alerts";
            }else if(c5.isSelected()){
                facility = facility + "Cheque Book";
            }else if(c6.isSelected()){
                facility = facility + "E Statement";
            }

            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account type is required");
                } else{
                    Conn Conn = new Conn();
                    String query1 = "INSERT INTO signup3 VALUES ('"
                + formno + "','"
                + accountType + "','"
                + card + "','"
                + pin + "','"
                + facility + "')";

                String query2 = "INSERT INTO login VALUES ('"
                + formno + "','"
                + card + "','"
                + pin +"')";
                Conn.s.executeUpdate(query1);
                Conn.s.executeUpdate(query2);


                JOptionPane.showMessageDialog(null, "Card number" + card + "\n Pin:"+pin);
                }
            } catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args) {
        new signup3("");
    }
}
