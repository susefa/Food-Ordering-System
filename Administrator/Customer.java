package administrator;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Customer extends User {
    private double walletBalance;
    private static final String WALLET_FILE = "wallets.txt";

    public Customer(String name, String userId, String email, String username, String password, double walletBalance) {
        super(name, userId, email, username, password, "Customer");
        this.walletBalance = walletBalance;
    }

    // Get balance
    public double getWalletBalance() { return walletBalance; }

    // Top up balance
    public void topUp(double amount) {
        if (amount > 0) {
            this.walletBalance += amount;
            updateWalletFile();
        }
    }

    // Save customer wallet to wallets.txt (called during registration)
    public void saveWalletToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(WALLET_FILE, true))) {
            writer.write(getUsername() + "," + getUserId() + "," + walletBalance);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to wallet file: " + e.getMessage());
        }
    }

    // Read balance from file
    public static double getBalanceFromFile(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(WALLET_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3 && data[0].equals(username)) {
                    return Double.parseDouble(data[2]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading wallet file: " + e.getMessage());
        }
        return -1; // Return -1 if user not found
    }

    // Update wallet balance in wallets.txt
    private void updateWalletFile() {
        List<String> lines = new ArrayList<>();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(WALLET_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3 && data[0].equals(getUsername())) {
                    lines.add(getUsername() + "," + getUserId() + "," + walletBalance);
                    found = true;
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading wallet file: " + e.getMessage());
            return;
        }

        if (!found) return; // User not found, no update needed

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(WALLET_FILE))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to wallet file: " + e.getMessage());
        }
    }
    
    public static boolean topUpWallet(String userId, double amount) {
        List<String> lines = new ArrayList<>();
        boolean found = false;
        String updatedUsername = "";
        double updatedBalance = 0.0;

        try (BufferedReader reader = new BufferedReader(new FileReader(WALLET_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3 && data[1].equals(userId)) {
                    double currentBalance = Double.parseDouble(data[2]);
                    updatedBalance = currentBalance + amount;
                    updatedUsername = data[0];
                    lines.add(data[0] + "," + userId + "," + updatedBalance);
                    found = true;
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading wallet file: " + e.getMessage());
            return false;
        }

        if (!found) {
            return false; // User not found
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(WALLET_FILE))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to wallet file: " + e.getMessage());
            return false;
        }

        // Show a confirmation pop-up
        JOptionPane.showMessageDialog(null, "Top-up successful!\nUsername: " + updatedUsername + 
                                      "\nUser ID: " + userId + "\nNew Balance: $" + updatedBalance,
                                      "Wallet Updated", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }
}
