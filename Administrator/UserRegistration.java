package administrator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserRegistration extends javax.swing.JFrame {
    public UserRegistration() {
        initComponents();
        loadUsersIntoTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        userID = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        userPassword = new javax.swing.JPasswordField();
        userRole = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        searchUser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addUser = new javax.swing.JButton();
        editUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        clearAll = new javax.swing.JButton();
        goBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("User Registration");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("User ID");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("User Role");

        userRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendor", "Customer", "Runner" }));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "User ID", "Email", "Username", "Password", "User Role"
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        searchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("User Search by Name");

        addUser.setBackground(new java.awt.Color(91, 109, 149));
        addUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addUser.setForeground(new java.awt.Color(255, 255, 255));
        addUser.setText("Add");
        addUser.setBorder(null);
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        editUser.setBackground(new java.awt.Color(91, 109, 149));
        editUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        editUser.setForeground(new java.awt.Color(255, 255, 255));
        editUser.setText("Edit");
        editUser.setBorder(null);
        editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserActionPerformed(evt);
            }
        });

        deleteUser.setBackground(new java.awt.Color(91, 109, 149));
        deleteUser.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        deleteUser.setForeground(new java.awt.Color(255, 255, 255));
        deleteUser.setText("Delete");
        deleteUser.setBorder(null);
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        clearAll.setBackground(new java.awt.Color(255, 153, 153));
        clearAll.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        clearAll.setForeground(new java.awt.Color(255, 255, 255));
        clearAll.setText("Clear");
        clearAll.setBorder(null);
        clearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllActionPerformed(evt);
            }
        });

        goBack.setBackground(new java.awt.Color(255, 153, 153));
        goBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        goBack.setForeground(new java.awt.Color(255, 255, 255));
        goBack.setText("Back");
        goBack.setBorder(null);
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(151, 151, 151)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(56, 56, 56)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(44, 44, 44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(email)
                                        .addComponent(userID)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(clearAll, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                        .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(17, 17, 17)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(editUser, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(deleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                .addComponent(goBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(userPassword)
                                        .addComponent(userRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(userID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clearAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(goBack, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {
        String userNameText = name.getText();
        String userIdText = userID.getText();
        String emailText = email.getText();
        String usernameText = userName.getText();
        String passwordText = new String(userPassword.getPassword());
        String roleText = (String) userRole.getSelectedItem();

        // Validation: Check for empty fields
        if (userNameText.isEmpty() || userIdText.isEmpty() || emailText.isEmpty() || 
            usernameText.isEmpty() || passwordText.isEmpty() || roleText == null) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validation: Ensure User ID is an integer
        int userId;
        try {
            userId = Integer.parseInt(userIdText);
            if (userId <= 0) {
                JOptionPane.showMessageDialog(this, "User ID must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid User ID! Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convert userId back to string for storage
        String userIdString = String.valueOf(userId);

        // Validation: Ensure email has @gmail.com suffix
        if (!emailText.endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(this, "Email must end with @gmail.com!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validation: Ensure password is at least 8 characters long
        if (passwordText.length() < 8) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if userID or username already exists
        if (AdminBackend.isUserExists(userIdString, usernameText)) {
            JOptionPane.showMessageDialog(this, "User with the same ID or Username already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create user object based on role
        User newUser;
        if (roleText.equals("Customer")) {
            newUser = new Customer(userNameText, userIdString, emailText, usernameText, passwordText, 0.0); 
            ((Customer) newUser).saveWalletToFile(); // Save initial wallet balance for customers
        } else if (roleText.equals("Vendor")) {
            newUser = new Vendor(userNameText, userIdString, emailText, usernameText, passwordText);
        } else {
            newUser = new DeliveryRunner(userNameText, userIdString, emailText, usernameText, passwordText);
        }

        // Save user to file
        boolean success = AdminBackend.registerUser(newUser);

        if (success) {
            JOptionPane.showMessageDialog(this, "User registered successfully!");
            clearFormFields();
            loadUsersIntoTable(); // Refresh the table
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed! Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editUserActionPerformed(java.awt.event.ActionEvent evt) {
        // Get values from form fields
        String userIdText = userID.getText();
        String newName = name.getText();
        String newEmail = email.getText();
        String newUsername = userName.getText();
        String newPassword = new String(userPassword.getPassword());
        String newRole = (String) userRole.getSelectedItem();

        // Validate User ID (Ensure it's an integer)
        int userId;
        try {
            userId = Integer.parseInt(userIdText);
            if (userId <= 0) {
                JOptionPane.showMessageDialog(this, "User ID must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid User ID! Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convert User ID to String for storage
        String userIdString = String.valueOf(userId);

        // Validation: Check for empty fields
        if (newName.isEmpty() || newEmail.isEmpty() || newUsername.isEmpty() || newPassword.isEmpty() || newRole == null) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validation: Ensure email has @gmail.com suffix
        if (!newEmail.endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(this, "Email must end with @gmail.com!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validation: Ensure password is at least 8 characters long
        if (newPassword.length() < 8) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Attempt to update the user details
        boolean success = AdminBackend.editUser(userIdString, newName, newEmail, newUsername, newPassword, newRole);

        if (success) {
            // If the edited user is a Customer, update the username in wallets.txt
            if (newRole.equals("Customer")) {
                updateWalletUsername(userIdString, newUsername);
            }

            JOptionPane.showMessageDialog(this, "User details updated successfully!");
            clearFormFields();
            loadUsersIntoTable(); // Refresh the table
        } else {
            JOptionPane.showMessageDialog(this, "User not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {
        String userIdText = userID.getText();

        // Validate User ID (Ensure it's an integer)
        int userId;
        try {
            userId = Integer.parseInt(userIdText);
            if (userId <= 0) {
                JOptionPane.showMessageDialog(this, "User ID must be a positive number!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid User ID! Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convert User ID to String for storage
        String userIdString = String.valueOf(userId);

        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            boolean success = AdminBackend.deleteUser(userIdString);

            if (success) {
                // Remove wallet details if the deleted user is a Customer
                removeWalletEntry(userIdString);

                JOptionPane.showMessageDialog(this, "User deleted successfully!");
                clearFormFields();
                loadUsersIntoTable(); // Refresh the table
            } else {
                JOptionPane.showMessageDialog(this, "User not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void clearAllActionPerformed(java.awt.event.ActionEvent evt) {
        name.setText("");
        userID.setText("");
        email.setText("");
        userName.setText("");
        userPassword.setText("");
        userRole.setSelectedIndex(0);
        searchUser.setText("");
        userTable.clearSelection();
    }

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {
        AdminMenu menu = new AdminMenu();
        menu.setVisible(true);
        this.dispose();
    }

    private void searchUserActionPerformed(java.awt.event.ActionEvent evt) {

        String searchText = searchUser.getText().toLowerCase();
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            String name = model.getValueAt(i, 0).toString().toLowerCase();
            if (name.contains(searchText)) {
                userTable.setRowSelectionInterval(i, i); // Highlight matching row
                break; // Stop after the first match
            }
        }
    }

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = userTable.getSelectedRow();
        if (selectedRow != -1) {
            name.setText(userTable.getValueAt(selectedRow, 0).toString());
            userID.setText(userTable.getValueAt(selectedRow, 1).toString());
            email.setText(userTable.getValueAt(selectedRow, 2).toString());
            userName.setText(userTable.getValueAt(selectedRow, 3).toString());
            userPassword.setText(userTable.getValueAt(selectedRow, 4).toString());
            userRole.setSelectedItem(userTable.getValueAt(selectedRow, 5).toString());
        }
    }
  
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }
    
    private void clearFormFields() {
        name.setText("");
        userID.setText("");
        email.setText("");
        userName.setText("");
        userPassword.setText("");
        userRole.setSelectedIndex(0);
    }
    
    private void loadUsersIntoTable() {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0); // Clear existing table data

        List<User> users = AdminBackend.getAllUsers();
        for (User user : users) {
            model.addRow(new Object[]{
                user.getName(), user.getUserId(), user.getEmail(), user.getUsername(), user.getPassword(), user.getRole()
            });
        }
    }
    
    private void removeWalletEntry(String userId) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("wallets.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3 && data[1].equals(userId)) {
                    continue; // Skip the deleted user
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading wallet file: " + e.getMessage());
            return;
        }

        // Rewrite the wallet file without the deleted user
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("wallets.txt"))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing wallet file: " + e.getMessage());
        }
    }
    
    private void updateWalletUsername(String userId, String newUsername) {
        List<String> lines = new ArrayList<>();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader("wallets.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3 && data[1].equals(userId)) {
                    // Update username for this user
                    lines.add(newUsername + "," + data[1] + "," + data[2]);
                    found = true;
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading wallet file: " + e.getMessage());
            return;
        }

        if (!found) return; // No update needed if user ID not found

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("wallets.txt"))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing wallet file: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUser;
    private javax.swing.JButton clearAll;
    private javax.swing.JButton deleteUser;
    private javax.swing.JButton editUser;
    private javax.swing.JTextField email;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField searchUser;
    private javax.swing.JTextField userID;
    private javax.swing.JTextField userName;
    private javax.swing.JPasswordField userPassword;
    private javax.swing.JComboBox<String> userRole;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
