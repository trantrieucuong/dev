import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import view.Java_View_Login;

public class UpdateUserData extends JFrame {
    private JTextField usernameField, passwordField, emailField;
    private JComboBox<String> userRoleComboBox;
    private JButton updateButton;

    public UpdateUserData() {
        setTitle("Update User Data");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        panel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        panel.add(usernameField);

        panel.add(new JLabel("Password:"));
        passwordField = new JTextField();
        panel.add(passwordField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("User Role:"));
        String[] userRoles = {"Admin", "User"};
        userRoleComboBox = new JComboBox<>(userRoles);
        panel.add(userRoleComboBox);

        updateButton = new JButton("Update");
        
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();
                String email = emailField.getText();
                String strrole=(String) userRoleComboBox.getSelectedItem();
                int Role=strrole.equalsIgnoreCase("admin")?1:0;
                
                updateUserData(username, password, email, Role);
            }
        });
        panel.add(updateButton);
        
        add(panel);
        
        JButton logoutButton = new JButton("Logout"); // Thêm nút đăng xuất
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                dispose(); 
                Java_View_Login l=new Java_View_Login();
                l.setVisible(true);
            }
        });
        panel.add(logoutButton);

        add(panel);
        setVisible(true);
    
    }
        
        
    private void updateUserData(String username, String password, String email, int userRole) {
         
        String url = "jdbc:sqlserver://localhost:1433;databaseName=FPL_DaoTaoooo;encrypt=true;trustServerCertificate=true;user=sa;password=123456";
        

        try {
            Connection connection = DriverManager.getConnection(url);
            String query = "UPDATE users SET password = ?, email = ?, role = ? WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, email);
            preparedStatement.setInt(3, userRole);
            preparedStatement.setString(4, username);

            int rowsAffected = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "User data updated successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update user data.");
            }

            preparedStatement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error while updating user data.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           
            public void run() {
                new UpdateUserData();
            }
        });
    }
}
