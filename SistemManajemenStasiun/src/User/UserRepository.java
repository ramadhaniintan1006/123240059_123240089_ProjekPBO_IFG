/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import sistemmanajemenstasiun.connector;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class UserRepository {
    private final connector connector;

    public UserRepository() {
        this.connector = new connector();
    }

    public boolean registerUser(User user) {

        String sql =
                "INSERT INTO users "
                + "(nama, email, password, role) "
                + "VALUES (?, ?, ?, ?)";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1, user.getNama());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getRole());

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {

            System.out.println(
                    "Gagal register : "
                    + e.getMessage()
            );

            return false;
        }
    }
    
    public User login(String email, String password) {

        String sql =
                "SELECT * FROM users "
                + "WHERE email = ? "
                + "AND password = ?";

        try {

            Connection conn =
                    connector.getConnection();

            PreparedStatement stmt =
                    conn.prepareStatement(sql);

            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                return new User(
                        rs.getString("nama"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("role")
                );
            }

        } catch (Exception e) {

            System.out.println(
                    "Login gagal : "
                    + e.getMessage()
            );
        }

        return null;
    }
}
