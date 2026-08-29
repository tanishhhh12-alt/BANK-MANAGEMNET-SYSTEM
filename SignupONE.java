package org.yourcompany.yourproject;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class SignupONE extends  JFrame{

        public SignupONE() {

            setLayout(null);
            Random ran = new Random();
            long random = Math.abs((ran.nextLong()%9000l)+1000l);
            
            JLabel formno = new JLabel("Application form no." + random);
            formno.setFont(new Font("Raleway",Font.BOLD,38));
            formno.setBounds(140, 20, 600, 40);
            add(formno);

            JLabel persondetails = new JLabel("Page 1: Personal details" );
            persondetails.setFont(new Font("Raleway",Font.BOLD,22));
            persondetails.setBounds(290, 80, 400, 30);
            add(persondetails);

            JLabel name = new JLabel("Name:" );
            name.setFont(new Font("Raleway",Font.BOLD,20));
            name.setBounds(100, 140, 100, 30);
            add(name);

            JTextField nameTextField = new JTextField();
            nameTextField.setFont(new Font("raleway", Font.BOLD, 20));
            nameTextField.setBounds(300, 140, 400, 30);
            add(nameTextField);

            JLabel fname = new JLabel("Father's Name:" );
            fname.setFont(new Font("Raleway",Font.BOLD,20));
            fname.setBounds(100, 190, 200, 30);
            add(fname);


             JTextField fnameTextField = new JTextField();
            fnameTextField.setFont(new Font("raleway", Font.BOLD, 20));
            fnameTextField.setBounds(300, 190, 400, 30);
            add(fnameTextField);

            
            JLabel dob = new JLabel("Date of Birth:" );
            dob.setFont(new Font("Raleway",Font.BOLD,20));
            dob.setBounds(100, 240, 240, 30);
            add(dob);

            JDateChooser dateChooser = new JDateChooser();
            dateChooser.setBounds(300,240,400,30);
            add(dateChooser);

             JLabel gender = new JLabel("Gender:" );
            gender.setFont(new Font("Raleway",Font.BOLD,20));
            gender.setBounds(100, 290, 200, 30);
            add(gender);

            JRadioButton male = new JRadioButton("male");
            male.setBounds(300, 290, 60, 30);
            male.setBackground(Color.WHITE);
            add(male);

            JRadioButton female = new JRadioButton("Female");
            female.setBounds(450, 290, 120, 30);
            female.setBackground(Color.WHITE);
            add(female);

            JRadioButton other = new JRadioButton("other");
            other.setBounds(600, 290, 120, 30);
            other.setBackground(Color.WHITE);
            add(other);

            ButtonGroup gendeGroup = new ButtonGroup();
            gendeGroup.add(male);
            gendeGroup.add(female);
            gendeGroup.add(other);

             JLabel email = new JLabel("Email Address:" );
            email.setFont(new Font("Raleway",Font.BOLD,20));
            email.setBounds(100, 340, 200, 30);
            add(email);

             JTextField emailTextField = new JTextField();
            emailTextField.setFont(new Font("raleway", Font.BOLD, 20));
            emailTextField.setBounds(300, 340, 400, 30);
            add(emailTextField);


             JLabel ms = new JLabel("Maritial Status:" );
            ms.setFont(new Font("Raleway",Font.BOLD,20));
            ms.setBounds(100, 390, 240, 30);
            add(ms);

            JRadioButton marrieRadioButton= new JRadioButton("Married");
            marrieRadioButton.setBounds(300, 390, 120, 30);
            marrieRadioButton.setBackground(Color.WHITE);
            add(marrieRadioButton);

            JRadioButton unmarrButton = new JRadioButton("Unmarried");
            unmarrButton.setBounds(450, 390, 120, 30);
            unmarrButton.setBackground(Color.WHITE);
            add(unmarrButton);

            ButtonGroup mGroup = new ButtonGroup();
            mGroup.add(unmarrButton);
            mGroup.add(marrieRadioButton);


             JLabel address = new JLabel("Address:" );
            address.setFont(new Font("Raleway",Font.BOLD,20));
            address.setBounds(100, 440, 240, 30);
            add(address);

            JTextField addressTextField = new JTextField();
            addressTextField.setFont(new Font("raleway", Font.BOLD, 20));
            addressTextField.setBounds(300, 440, 400, 30);
            add(addressTextField);

             JLabel city = new JLabel("City:" );
            city.setFont(new Font("Raleway",Font.BOLD,20));
            city.setBounds(100, 490, 240, 30);
            add(city);

            JTextField cityTextField = new JTextField();
            cityTextField.setFont(new Font("raleway", Font.BOLD, 20));
            cityTextField.setBounds(300, 490, 400, 30);
            add(cityTextField);

             JLabel state= new JLabel("State:" );
            state.setFont(new Font("Raleway",Font.BOLD,20));
            state.setBounds(100, 540, 240, 30);
            add(state);

            JTextField stateTextField = new JTextField();
            stateTextField.setFont(new Font("raleway", Font.BOLD, 20));
            stateTextField.setBounds(300, 540, 400, 30);
            add(stateTextField);

             JLabel pc = new JLabel("Pin code:" );
            pc.setFont(new Font("Raleway",Font.BOLD,20));
            pc.setBounds(100, 590, 240, 30);
            add(pc);

            JTextField pcTextField = new JTextField();
            pcTextField.setFont(new Font("raleway", Font.BOLD, 20));
            pcTextField.setBounds(300, 590, 400, 30);
            add(pcTextField);

            JButton next = new JButton("Next Page");
            next.setBackground(Color.white);
            next.setForeground(Color.BLACK);
            next.setFont(new Font("raleway",Font.BOLD,14));
            next.setBounds(620, 660, 80, 30);
            add(next);

            getContentPane().setBackground(Color.WHITE);
            setSize(850,800);
            setLocation(350, 10);
            setVisible(true);
        }
    
    

public static void main(String[] args) {
    new SignupONE();
}
}
