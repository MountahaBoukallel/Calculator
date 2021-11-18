import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator<textDisplay> {

    private JPanel JavaCalculator;
    // the variables we need to store our values
    private JTextField textDisplay;
    // to store the value from the text field
    private double firstTotal = 0.0;
    private double secondTotal = 0.0;
    //to store the math operation variable
    private char mathOperator;

    //Numbers
    private JButton btnZero;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnDot;
    //Operations
    private JButton btnAdd;
    private JButton btnSubstract;
    private JButton btnMultiply;
    private JButton btnDevide;
    private JButton btnModuleButton;
    //Functionality
    private JButton cButton;
    private JButton btnEquale;

    //Math operations
    //Subtraction
    private void getOperator(String btnText){
        mathOperator = btnText.charAt(0);
        firstTotal = firstTotal + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

    public JavaCalculator() {
// Read the numbers entered by the user
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);
            }
        });
        // first btn
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });
        // second btn
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoText);

            }
        });
        // third btn
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnThreeText);

            }
        });
        // fourth btn
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);
            }
        });
        // fifth btn
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);
            }
        });
        //sixth btn
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);
            }
        });
        // Seventh btn
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);
            }
        });
        // eighth btn
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);
            }
        });
        //ninth btn
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);
            }
        });
        // the Dot btn
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // this will make it cleaner
                if (textDisplay.getText().equals("")){
                    textDisplay.setText("0.");
                }else if (textDisplay.getText().contains(".")){
                    btnDot.setEnabled(false);
                }else {
                    // this is enough
                    String btnDotText = textDisplay.getText() + btnDot.getText();
                    textDisplay.setText(btnDotText);
                }
                btnDot.setEnabled(true);
            }
        });

        // coding the signs
        // set a field to store the value entered by the user

        // coding the equals button
        btnEquale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (mathOperator){
                    case '+':
                        secondTotal = firstTotal + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-':
                        secondTotal = firstTotal - Double.parseDouble(textDisplay.getText());
                        break;
                    case '*':
                        secondTotal = firstTotal * Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        secondTotal = firstTotal / Double.parseDouble(textDisplay.getText());
                        break;
                    case '%':
                        secondTotal = firstTotal % Double.parseDouble(textDisplay.getText());
                        break;
                }
                textDisplay.setText(Double.toString(secondTotal));
                firstTotal = 0;
            }
        });
        // coding the clear btn
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondTotal = 0;
                textDisplay.setText("");
            }
        });
        // the plus button
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnAdd.getText();
                getOperator(buttonText);
            }
        });
        // the - button
        btnSubstract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnSubstract.getText();
                getOperator(buttonText);
            }
        });
        // the * btn
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnMultiply.getText();
                getOperator(buttonText);

            }
        });
        btnDevide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnDevide.getText();
                getOperator(buttonText);

            }
        });
        // the %
        btnModuleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnModuleButton.getText();
                getOperator(buttonText);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
