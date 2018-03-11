import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    JTextField num1Tf = new JTextField(10);
    JTextField num2Tf = new JTextField(10);
    JLabel resultLabel = new JLabel("Result:");
    JButton addBtn = new JButton("Add");
    JButton subBtn =  new JButton("Subtract");

    public GUI(){
        JPanel panel = new JPanel();
        panel.add(num1Tf);
        panel.add(num2Tf);
        panel.add(addBtn);
        panel.add(subBtn);
        panel.add(resultLabel);
        panel.setLayout(new FlowLayout());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,120);
//        this.setLayout(new FlowLayout());

        this.add(panel);

        this.setVisible(true);
    }

    public static void main(String args[]){
        GUI obj = new GUI();

    }
}
