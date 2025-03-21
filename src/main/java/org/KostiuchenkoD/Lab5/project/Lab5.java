package org.KostiuchenkoD.Lab5.project;

import java.sql.*;
import java.util.Scanner;

public class Lab5 {
    private static final String URL = "jdbc:mysql://localhost:3306/university?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "Foozyschmoozy2405_";

    public static void main() {
        try (Scanner scanner = new Scanner(System.in)) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {

                System.out.print("Введіть номер місяця (1-12): ");
                int month = scanner.nextInt();

                String sql = "SELECT * FROM students WHERE MONTH(birth_date) = ?";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setInt(1, month);

                    try (ResultSet resultSet = statement.executeQuery()) {
                        System.out.println("Студенти, які народилися у місяці " + month + ":");
                        while (resultSet.next()) {
                            int id = resultSet.getInt("id");
                            String lastName = resultSet.getString("last_name");
                            String firstName = resultSet.getString("first_name");
                            String middleName = resultSet.getString("middle_name");
                            Date birthDate = resultSet.getDate("birth_date");
                            String recordBookNumber = resultSet.getString("record_book_number");

                            System.out.println("ID: " + id);
                            System.out.println("Прізвище: " + lastName);
                            System.out.println("Ім'я: " + firstName);
                            System.out.println("По батькові: " + middleName);
                            System.out.println("Дата народження: " + birthDate);
                            System.out.println("Номер залікової книжки: " + recordBookNumber);
                            System.out.println("-----------------------------");
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Драйвер MySQL не знайдено: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Помилка підключення до бази даних: " + e.getMessage());
        }
    }
}