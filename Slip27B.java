import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Slip27B extends JFrame {
    private JTextField directoryTextField;
    private JButton listButton;
    private JList<String> fileList;

    public Slip27B() {
        setTitle("Directory Lister");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        directoryTextField = new JTextField();
        listButton = new JButton("List Directory");
        inputPanel.add(directoryTextField, BorderLayout.CENTER);
        inputPanel.add(listButton, BorderLayout.EAST);

        fileList = new JList<>();
        JScrollPane listScrollPane = new JScrollPane(fileList);

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(listScrollPane, BorderLayout.CENTER);

        add(mainPanel);

        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listDirectoryContents();
            }
        });
    }

    private void listDirectoryContents() {
        String directoryPath = directoryTextField.getText();
        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                String[] fileNames = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    fileNames[i] = files[i].getName();
                }
                fileList.setListData(fileNames);
            } else {
                JOptionPane.showMessageDialog(this, "Directory is empty.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid directory path.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Slip27B ob = new Slip27B();
                ob	xz.setVisible(true);
            }
        });
    }
}
