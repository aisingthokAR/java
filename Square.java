package form;

import javax.swing.*;

public class Square extends JFrame{
    JLabel labelnumber,labelsquare;
    JTextField fieldnumber,fieldsquare;
    JButton btncalculate;
    public Square(){
        labelnumber=new JLabel("enter a number:");
        labelnumber.setBounds(50 ,50,100, 30);
        fieldnumber=new JTextField();
        fieldnumber.setBounds(170,50,150,30);

        btncalculate=new JButton("calculate square");
        btncalculate.setBounds(170,100,150,30);

        labelsquare=new JLabel("Square of entered number:");
        labelsquare.setBounds(50,150,500, 30);
        fieldsquare=new JTextField();
        fieldsquare.setBounds(220,150,150,30);

    btncalculate.addActionListener(e ->{
        int x = Integer.parseInt(fieldnumber.getText());
        int s= x*x;
        fieldsquare.setText(String.valueOf(s));
        System.out.println("square"+s);
    });
    add(labelnumber);
    add(fieldnumber);
    add(btncalculate);
    add(labelsquare);
    add(fieldsquare);
        setSize(1000,1000);
        setLayout(null);
        setVisible(true);
}
    public static void main(String[] args)
    {
        new Square();
    }
}
