package assinment;

import javax.swing.*;
import java.awt.*;
public class Calculator {
        JFrame frameObj;
       public Calculator(){
        frameObj = new JFrame();

        JButton btn20 = new JButton("AC");
        JButton btn19 = new JButton("reset");
        JButton btn17 = new JButton("%");
        JButton btn18 = new JButton("-");
        JButton btn1 = new JButton("7");
        JButton btn2 = new JButton("8");
        JButton btn3 = new JButton("9");
        JButton btn4 = new JButton("*");
        JButton btn5 = new JButton("4");
        JButton btn6 = new JButton("5");
        JButton btn7 = new JButton("6");
        JButton btn8 = new JButton("-");
        JButton btn9 = new JButton("1");
        JButton btn10 = new JButton("2");
        JButton btn11 = new JButton("3");
        JButton btn12 = new JButton("+");
        JButton btn13 = new JButton("0");
        JButton btn14 = new JButton("00");
        JButton btn15 = new JButton(".");
        JButton btn16 = new JButton("=");

          btn12.addActionListener(e ->{

          });
           frameObj.add(btn1); frameObj.add(btn2); frameObj.add(btn3);
           frameObj.add(btn4); frameObj.add(btn5); frameObj.add(btn6);
           frameObj.add(btn7); frameObj.add(btn8); frameObj.add(btn9);
           frameObj.add(btn10); frameObj.add(btn11); frameObj.add(btn12);
           frameObj.add(btn13); frameObj.add(btn14); frameObj.add(btn15);
           frameObj.add(btn16); frameObj.add(btn17); frameObj.add(btn18);
           frameObj.add(btn19); frameObj.add(btn20);
           frameObj.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
           frameObj.setLayout(new GridLayout(5,4,5,5));
           frameObj.setSize(300, 300);
            frameObj.setVisible(true);
        }
        public static void main(String arg[])
        {
            new Calculator();
        }
    }

