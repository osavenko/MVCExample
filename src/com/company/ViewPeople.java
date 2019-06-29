package com.company;

import javax.swing.*;
import java.awt.*;

public class ViewPeople {
    private JTextField name;
    public void setName(String name){
        this.name.setText(name);
    }
    public String getName(){
        return name.getText();
    }
    private JTextField surname;
    public void setSurname(String surname){
        this.surname.setText(surname);
    }
    public String getSurname(){
        return surname.getText();
    }
    private JTextField fullName;
    public void setFullName(String fullName){
        this.fullName.setText(fullName);
    }

    private JCheckBox sex;
    public void setSex(boolean sex){
        this.sex.setSelected(sex);
    }
    public boolean getSex(){
        return sex.isSelected();
    }
    private JButton btnOk;

    public JButton getBtnOk() {
        return btnOk;
    }


    private JLabel label1;
    private JLabel label2;

    private JFrame frame;
    private JPanel pnlMain;
    private JPanel pnlName;
    private JPanel pnlSurname;
    private JPanel pnlButton;
    private JPanel pnlRezult;



    public ViewPeople() {
        sex = new JCheckBox();
        surname = new JTextField();
        name = new JTextField();
        fullName = new JTextField();

        btnOk = new JButton();
    }
    public void start(){
        frame = new JFrame();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int width = 400;
        int height = 200;

        int startPosX = dimension.width>width?width:dimension.width;
        int startPosY = dimension.height>height?height:dimension.height;

        buildMainPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Маленикая демочка");
        frame.setBounds(startPosX,startPosY,width,height);

        frame.setVisible(true);


    }
    private void buildMainPanel(){
        pnlMain = new JPanel();

        pnlName = new JPanel();
        label1 = new JLabel();
        label1.setText("Имя:");
        name.setColumns(20);
        pnlName.add(label1);
        pnlName.add(name);

        pnlSurname = new JPanel();
        label2 = new JLabel();
        label2.setText("Фамилия:");
        surname.setColumns(20);
        sex.setText("Пол");
        pnlSurname.add(label2);
        pnlSurname.add(surname);
        pnlSurname.add(sex);

        pnlButton = new JPanel();
        btnOk.setText("Ok");
        pnlButton.add(btnOk);

        pnlRezult = new JPanel();
        fullName.setColumns(30);
        fullName.setEnabled(false);
        pnlRezult.add(fullName);

        pnlMain.add(pnlName);
        pnlMain.add(pnlSurname);
        pnlMain.add(pnlButton);
        pnlMain.add(pnlRezult);

        frame.add(pnlMain);
    }
}
