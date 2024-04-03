import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Survey extends JApplet implements ActionListener {

    private JLabel questionLabel;
    private JRadioButton option1, option2, option3, option4;
    private JButton submitButton;
    private ButtonGroup buttonGroup;
    private int questionNumber = 0;
    private String[] questions = {"Question 1?", "Question 2?", "Question 3?", "Question 4?"};
    private String[][] options = {
            
        {"Option 1", "Option 2", "Option 3", "Option 4"},
            {"Option A", "Option B", "Option C", "Option D"},
            {"Yes", "No"},
            {"Agree", "Disagree"}
    };

    @Override
    public void init() {
        setLayout(new FlowLayout());
        questionLabel = new JLabel(questions[questionNumber]);
        add(questionLabel);

        buttonGroup = new ButtonGroup();
        option1 = new JRadioButton(options[questionNumber][0]);
        option2 = new JRadioButton(options[questionNumber][1]);
        option3 = new JRadioButton(options[questionNumber][2]);
        option4 = new JRadioButton(options[questionNumber][3]);

        buttonGroup.add(option1);
        buttonGroup.add(option2);
        buttonGroup.add(option3);
        buttonGroup.add(option4);

        add(option1);
        add(option2);
        add(option3);
        add(option4);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            // Process the selected option
            String selectedOption = "";
            if (option1.isSelected()) {
                selectedOption = option1.getText();
            } else if (option2.isSelected()) {
                selectedOption = option2.getText();
            } else if (option3.isSelected()) {
                selectedOption = option3.getText();
            } else if (option4.isSelected()) {
                selectedOption = option4.getText();
            }

            // Assuming here you would save the selected option to a database or file
            System.out.println("Question: " + questions[questionNumber]);
            System.out.println("Selected Option: " + selectedOption);
            
            // Move to the next question or end the survey
            questionNumber++;
            if (questionNumber < questions.length) {
                questionLabel.setText(questions[questionNumber]);
                option1.setText(options[questionNumber][0]);
                option2.setText(options[questionNumber][1]);
                option3.setText(options[questionNumber][2]);
                option4.setText(options[questionNumber][3]);
            } else {
                JOptionPane.showMessageDialog(this, "Survey completed!");
                // Here you can reset the survey or close the applet
            }
        }
    }
}