import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class CalcGraphics extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel;
    JLabel label;
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonSum, buttonEq, buttonDot;
    String s, string;int result;

    CalcGraphics() {
        frame.setLocation(300, 300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setTitle("MyCalculator");
        panel = new JPanel();
        panel.setLayout(null);
        //       panel.setVisible(true);
        label = new JLabel("");
        label.setBounds(100, 20, 400, 25);
        panel.add(label);
        panel.setBackground(Color.white);


        button7 = new JButton("7");
        //button1.setID(1);
        button7.setBounds(100, 100, 50, 50);
        button7.addActionListener(this);
        panel.add(button7);

        button8 = new JButton("8");
        button8.setBounds(160, 100, 50, 50);
        button8.addActionListener(this);
        panel.add(button8);

        button9 = new JButton("9");
        button9.setBounds(220, 100, 50, 50);
        button9.addActionListener(this);
        panel.add(button9);

        button4 = new JButton("4");
        button4.setBounds(100, 160, 50, 50);
        button4.addActionListener(this);
        panel.add(button4);

        button5 = new JButton("5");
        button5.setBounds(160, 160, 50, 50);
        button5.addActionListener(this);
        panel.add(button5);


        button6 = new JButton("6");
        button6.setBounds(220, 160, 50, 50);
        button6.addActionListener(this);
        panel.add(button6);


        button1 = new JButton("1");
        button1.setBounds(100, 220, 50, 50);
        button1.addActionListener(this);
        panel.add(button1);


        button2 = new JButton("2");
        button2.setBounds(160, 220, 50, 50);
        button2.addActionListener(this);
        panel.add(button2);

        button3 = new JButton("3");
        button3.setBounds(220, 220, 50, 50);
        button3.addActionListener(this);
        panel.add(button3);

        button0 = new JButton("0");
        button0.setBounds(100, 280, 50, 50);
        button0.addActionListener(this);
        panel.add(button0);

        buttonDot = new JButton(".");
        buttonDot.addActionListener(this);
        panel.add(buttonDot);

        buttonEq = new JButton("=");
        buttonEq.setBounds(220,280,50,50);
        buttonEq.addActionListener(this);
        panel.add(buttonEq);

        buttonSum = new JButton("+");
        buttonSum.setBounds(160,280,50,50);
        buttonSum.addActionListener(this);
        panel.add(buttonSum);

        this.add(panel);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String string = e.getActionCommand();
        if (string.equals("1")) {
            label.setText(label.getText() + string);
        } else if (string.equals("2")) {
            label.setText(label.getText() + button2.getText());
        } else if (string.equals("3")) {
            label.setText(label.getText() + button3.getText());
        } else if (string.equals("4")) {
            label.setText(label.getText() + button4.getText());
        } else if (string.equals("5")) {
            label.setText(label.getText() + button5.getText());
        } else if (string.equals("6")) {
            label.setText(label.getText() + button6.getText());
        } else if (string.equals("7")) {
            label.setText(label.getText() + button7.getText());
        } else if (string.equals("8")) {
            label.setText(label.getText() + button8.getText());
        } else if (string.equals("9")) {
            label.setText(label.getText() + button9.getText());
        } else if (string.equals("0")) {
            label.setText(label.getText() + button0.getText());
        } else if (string.equals("+")) {
            label.setText(label.getText() + buttonSum.getText());
        } else if (string.equals(".")) {
            label.setText(label.getText() + buttonDot.getText());
        }else if (string.equals("=")) {
            LabelAnalysis s = new LabelAnalysis(label.getText());
            result = s.result();
            String ans = Integer.toString(result);
            label.setText(ans);
        }
    }
}
