import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp implements ActionListener {
    //variable declaration
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel panel;// panel to put all the buttons

    Font myFont = new Font("Arial", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    char operator;


    CalculatorApp() {//contructor
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//allows close the program
        frame.setSize(420, 550);
        frame.setLayout(null);// content between setLayout and setVisible

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false); //false because the data will be iserted by buttons

        //Fuctions buttons
        addButton = new JButton("+");// Function
        subButton = new JButton("-");// Function
        mulButton = new JButton("*");// Function
        divButton = new JButton("/");// Function
        decButton = new JButton(".");// Function
        equButton = new JButton("=");// Function
        delButton = new JButton("del");// Function
        clrButton = new JButton("clr");// Function
        negButton = new JButton("(-)");// Function

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for (int i = 0; i<9;i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        //number buttons functionality

        for (int i = 0; i<10;i++){
            numberButtons[i]  = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        //place the buttons in the frame
        negButton.setBounds(50,430,100,50);
        delButton.setBounds(150,430,100,50);
        clrButton.setBounds(250,430,100,50);

        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.LIGHT_GRAY);


        //first row
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);

        // Second Row
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);

        //last row
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);

        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        panel.add(negButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        CalculatorApp cal = new CalculatorApp();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for(int i = 0; i < 10 ;i++){
            if (e.getSource() == numberButtons[i]){
                textfield.setText(textfield.getText().concat(String.valueOf(i)));

            }
        }

        if (e.getSource() == decButton){
            textfield.setText(textfield.getText().concat("."));
        }
        if (e.getSource() == addButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
            //textfield.setText(textfield.getText().concat("+"));
        }
        if (e.getSource() == subButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
            //textfield.setText(textfield.getText().concat("+"));
        }
        if (e.getSource() == mulButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
            //textfield.setText(textfield.getText().concat("+"));
        }
        if (e.getSource() == divButton){
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
            //textfield.setText(textfield.getText().concat("+"));
        }
        if (e.getSource() == equButton){
            num2 = Double.parseDouble(textfield.getText());
            switch (operator){
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;

            }
            textfield.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == negButton){
            double temp = Double.parseDouble(textfield.getText());
            temp*=-1;
            textfield.setText(String.valueOf(temp));
        }
        if (e.getSource() == clrButton){
            textfield.setText("");
            //textfield.setText(textfield.getText().concat("+"));
        }
        if (e.getSource() == delButton){
            String string = textfield.getText();
            textfield.setText("");
            for(int i=0;i<string.length()-1;i++){
                textfield.setText(textfield.getText()+string.charAt(i));
                //char string2 = string.charAt(i);
                //System.out.println(string2);
            }
            //textfield.setText(textfield.getText().concat("+"));
        }
    }
}
