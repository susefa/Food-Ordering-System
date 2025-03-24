package administrator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AdminBackend {
    private static final String USER_FILE = "users.txt";

    // Register a new user
    public static boolean registerUser(User user) {
        if (isUserExists(user.getUserId(), user.getUsername())) {
            return false; // User ID or username already exists
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE, true))) {
            writer.write(user.toFileString());
            writer.newLine();
            return true;
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return false;
        }
    }

    // Check if a username and ID already exist in users.txt
    public static boolean isUserExists(String userId, String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length > 3 && (data[1].equals(userId) || data[3].equals(username))) {
                    return true; // User ID or username already exists
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return false;
    }

    // Read all users from the file
    public static List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                User user = User.fromFileString(line);
                if (user != null) {
                    users.add(user);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return users;
    }
    
    public static boolean editUser(String userId, String newName, String newEmail, String newUsername, String newPassword, String newRole) {
        List<String> lines = new ArrayList<>();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6 && data[1].equals(userId)) { // Check userId
                    // Update user details
                    lines.add(newName + "," + userId + "," + newEmail + "," + newUsername + "," + newPassword + "," + newRole);
                    found = true;
                } else {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return false;
        }

        if (!found) return false; // User not found

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
            return false;
        }
    }
    
    public static boolean deleteUser(String userId) {
        List<String> lines = new ArrayList<>();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6 && data[1].equals(userId)) { // Check userId
                    found = true;
                    continue; // Skip writing this line to remove user
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return false;
        }

        if (!found) return false; // User not found

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE))) {
            for (String l : lines) {
                writer.write(l);
                writer.newLine();
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
            return false;
        }
    }
}
