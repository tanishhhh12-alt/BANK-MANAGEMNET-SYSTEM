package org.yourcompany.yourproject;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class signup2 extends  JFrame implements  ActionListener{

    
    JTextField addressTextField,cityTextField,stateTextField,pcTextField;
    JRadioButton marrieRadioButton,unmarrButton,unmarrButton2,marrieRadioButton2;
    JDateChooser dateChooser;
    JButton next;
    JComboBox religion, category,income,education,occupation;
    String formno;

        public signup2(String formno) {

            setLayout(null);
            setTitle("new account applications page 2");
            this.formno = formno;

            JLabel additonaldetails = new JLabel("Page 2: additional details" );
            additonaldetails.setFont(new Font("Raleway",Font.BOLD,22));
            additonaldetails.setBounds(290, 80, 400, 30);
            add(additonaldetails);

            JLabel name = new JLabel("Religion" );
            name.setFont(new Font("Raleway",Font.BOLD,20));
            name.setBounds(100, 140, 100, 30);
            add(name);

            String valReligion[] ={"hindu","muslim","christian","punjabi","other"};
            religion = new JComboBox(valReligion);
            religion.setBounds(300, 140, 400, 30);
            add(religion);

            
            JLabel fname = new JLabel("Category" );
            fname.setFont(new Font("Raleway",Font.BOLD,20));
            fname.setBounds(100, 190, 200, 30);
            add(fname);

            String valcategory[] ={"general","obc","sc","st","other"};
            category = new JComboBox(valcategory);
            category.setBounds(300, 190, 400, 30);
            add(category);

            
            JLabel dob = new JLabel("Income:" );
            dob.setFont(new Font("Raleway",Font.BOLD,20));
            dob.setBounds(100, 240, 240, 30);
            add(dob);

            String valincome[] ={"null","< 1,50,000","<2,50,000","< 5,00,000","upto 10,00,000","more than 10,00,000"};
            income = new JComboBox(valincome);
            income.setBounds(300,240,400,30);
            add(income);

             JLabel gender = new JLabel("Educational:" );
            gender.setFont(new Font("Raleway",Font.BOLD,20));
            gender.setBounds(100, 290, 200, 30);
            add(gender);

        

             JLabel email = new JLabel("Qualification:" );
            email.setFont(new Font("Raleway",Font.BOLD,20));
            email.setBounds(100, 315, 200, 30);
            add(email);

            String valeducational[] ={"non-graduate","post-graduate","graduate","doctrate","others"};
            education = new JComboBox(valeducational);
            education.setBounds(300,315,400,30);
            add(education);


             JLabel ms = new JLabel("Occupation:" );
            ms.setFont(new Font("Raleway",Font.BOLD,20));
            ms.setBounds(100, 390, 240, 30);
            add(ms);

            String occupation2[] ={"salaried","self-employed","buissnesman","student","retired","others"};
            occupation = new JComboBox(occupation2);
            occupation.setBounds(300,390,400,30);
            add(occupation);

             JLabel address = new JLabel("Pan number:" );
            address.setFont(new Font("Raleway",Font.BOLD,20));
            address.setBounds(100, 440, 240, 30);
            add(address);

            addressTextField = new JTextField();
            addressTextField.setFont(new Font("raleway", Font.BOLD, 20));
            addressTextField.setBounds(300, 440, 400, 30);
            add(addressTextField);

             JLabel city = new JLabel("Aadhar no.:" );
            city.setFont(new Font("Raleway",Font.BOLD,20));
            city.setBounds(100, 490, 240, 30);
            add(city);

            cityTextField = new JTextField();
            cityTextField.setFont(new Font("raleway", Font.BOLD, 20));
            cityTextField.setBounds(300, 490, 400, 30);
            add(cityTextField);

             JLabel state= new JLabel("Senior citizen:" );
            state.setFont(new Font("Raleway",Font.BOLD,20));
            state.setBounds(100, 540, 240, 30);
            add(state);

            marrieRadioButton= new JRadioButton("yes");
            marrieRadioButton.setBounds(300, 540, 120, 30);
            marrieRadioButton.setBackground(Color.WHITE);
            add(marrieRadioButton);

            unmarrButton = new JRadioButton("no");
            unmarrButton.setBounds(450, 540, 120, 30);
            unmarrButton.setBackground(Color.WHITE);
            add(unmarrButton);

            ButtonGroup mGroup = new ButtonGroup();
            mGroup.add(unmarrButton);
            mGroup.add(marrieRadioButton);

             JLabel pc = new JLabel("Existing account" );
            pc.setFont(new Font("Raleway",Font.BOLD,20));
            pc.setBounds(100, 590, 240, 30);
            add(pc);

            marrieRadioButton2= new JRadioButton("yes");
            marrieRadioButton2.setBounds(300, 590, 120, 30);
            marrieRadioButton2.setBackground(Color.WHITE);
            add(marrieRadioButton2);

            unmarrButton2 = new JRadioButton("no");
            unmarrButton2.setBounds(450, 590, 120, 30);
            unmarrButton2.setBackground(Color.WHITE);
            add(unmarrButton2);

            ButtonGroup mGroup1 = new ButtonGroup();
            mGroup1.add(unmarrButton2);
            mGroup1.add(marrieRadioButton2);

            next = new JButton("Next Page");
            next.setBackground(Color.white);
            next.setForeground(Color.BLACK);
            next.setFont(new Font("raleway",Font.BOLD,14));
            next.setBounds(620, 660, 80, 30);
            next.addActionListener(this);
            add(next); 

            getContentPane().setBackground(Color.WHITE);
            setSize(850,800);
            setLocation(350, 10);
            setVisible(true);
        }
    public void actionPerformed(ActionEvent ae){
        
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        
        String seniorcitizen = null;
        if ( marrieRadioButton.isSelected()){
            seniorcitizen = "yes";
        }else if(unmarrButton.isSelected()){
            seniorcitizen = "no";
        }
    
        String existingacc = null;
        if(marrieRadioButton2.isSelected()){
            existingacc ="yes";
        }else if(unmarrButton2.isSelected()){
            existingacc = "no";
        }
        String pan = addressTextField.getText();
        String aadhar = cityTextField.getText();
        

        try{

            if(pan.equals("")){
                JOptionPane.showMessageDialog(null, "name is required" );
            } else {
                Conn c = new Conn();
                String query = "INSERT INTO signup2 VALUES ('"
                + formno + "','"
                + sreligion + "','"
                + scategory + "','"
                + sincome + "','"
                + seducation + "','"
                + soccupation + "','"
                + existingacc + "','"
                + pan + "','"
                + aadhar + "','"
                 + seniorcitizen + "')";
                c.s.executeUpdate(query);
            }
        } catch (Exception e ){
            System.out.println(e);
        }
       }
    

public static void main(String[] args) {
    new signup2("");
}
}
