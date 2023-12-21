import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonalInfoGUI extends JFrame {
    private JTextField firstNameField, lastNameField, addressField, mobileNumberField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JCheckBox computerCheckBox, sportsCheckBox, musicCheckBox;
    
    public PersonalInfoGUI() {
        setTitle("Personal Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2, 10, 10));

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField();
        
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField();
        
        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField();
        
        JLabel mobileNumberLabel = new JLabel("Mobile Number:");
        mobileNumberField = new JTextField();
        
        JLabel genderLabel = new JLabel("Gender:");
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        
        JLabel interestsLabel = new JLabel("Your Interests:");
        computerCheckBox = new JCheckBox("Computer");
        sportsCheckBox = new JCheckBox("Sports");
        musicCheckBox = new JCheckBox("Music");
        
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the submit button action here
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String address = addressField.getText();
                String mobileNumber = mobileNumberField.getText();
                String gender = maleRadioButton.isSelected() ? "Male" : "Female";
                StringBuilder interests = new StringBuilder();
                if (computerCheckBox.isSelected()) interests.append("Computer ");
                if (sportsCheckBox.isSelected()) interests.append("Sports ");
                if (musicCheckBox.isSelected()) interests.append("Music");
                
                // Display the collected information (you can replace this with your logic)
                String result = "First Name: " + firstName + "\n" +
                                "Last Name: " + lastName + "\n" +
                                "Address: " + address + "\n" +
                                "Mobile Number: " + mobileNumber + "\n" +
                                "Gender: " + gender + "\n" +
                                "Interests: " + interests.toString();
                JOptionPane.showMessageDialog(null, result, "Personal Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear all the input fields and checkboxes
                firstNameField.setText("");
                lastNameField.setText("");
                addressField.setText("");
                mobileNumberField.setText("");
                maleRadioButton.setSelected(false);
                femaleRadioButton.setSelected(false);
                computerCheckBox.setSelected(false);
                sportsCheckBox.setSelected(false);
                musicCheckBox.setSelected(false);
            }
        });

        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(mobileNumberLabel);
        panel.add(mobileNumberField);
        panel.add(genderLabel);
        panel.add(maleRadioButton);
        panel.add(new JLabel("")); // Empty label for spacing
        panel.add(femaleRadioButton);
        panel.add(interestsLabel);
        panel.add(computerCheckBox);
        panel.add(new JLabel("")); // Empty label for spacing
        panel.add(sportsCheckBox);
        panel.add(new JLabel("")); // Empty label for spacing
        panel.add(musicCheckBox);
        panel.add(new JLabel("")); // Empty label for spacing
        panel.add(submitButton);
        panel.add(resetButton);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PersonalInfoGUI();
            }
        });
    }
}
