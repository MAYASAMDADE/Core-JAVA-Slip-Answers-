import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Slip28B {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JTable with a DefaultTableModel
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Eno");
        tableModel.addColumn("Ename");
        tableModel.addColumn("Salary");

        JTable table = new JTable(tableModel);

        // Create and add JScrollPane to the frame
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        // Input employee details
        for (int i = 0; i < 5; i++) {
            String eno = JOptionPane.showInputDialog("Enter Employee Number:");
            String ename = JOptionPane.showInputDialog("Enter Employee Name:");
            String salary = JOptionPane.showInputDialog("Enter Salary:");

            // Add the details to the table model
            tableModel.addRow(new String[]{eno, ename, salary});
        }

        frame.setVisible(true);
    }
}
