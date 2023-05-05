package jdbc.example.simple.examples.mysql;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * CRUD - on a simple table
 */
public class CRUDExample {
    private static String nume = "Ion";
    private static String prenume = "Ion";
    private static String data_nasterii = "2003-05-04 00:00:00.000";

    public static void main(String[] args) {
        // Connect to a datase
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/barbie_db", "root", "password");
            // We want to control transactions manually. Autocommit is on by
            // default in JDBC.
            conn.setAutoCommit(false);


            // Pentru CREATE, folosim INSERT
            // INSERT INTO STUDENTI (ID, NUME, PRENUME, DATA_NASTERII values (1, Popescu, Mihai, 4.05.2003)
            // String insert = "INSERT INTO STUDENTI (NUME, PRENUME, DATA_NASTERII) values ('Popescu', 'Mihai', '2003-05-04 00:00:00.000')";
            Statement stmt = conn.createStatement();
            stmt.execute(getInsertStatement(nume, prenume, data_nasterii));

//            stmt.executeUpdate("UPDATE STUDENTI set nume = 'Gheorghe' where nume='Ion'");

            String idToDelete = "3";
            stmt.executeUpdate("DELETE from STUDENTI where ID = "+idToDelete);

            PreparedStatement preparedStatement = conn.prepareStatement("DELETE from Studenti where id = ?");
            preparedStatement.setInt(1, 5);
            preparedStatement.executeUpdate();

            // Citim datele
            ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTI");
            List<Student> studenti = new ArrayList<>();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "|" + rs.getString(2) + "|" + rs.getString(2) + "|" + rs.getString(4));
                System.out.println(rs.getInt("ID") + "|" + rs.getString("NUME") + "|" + rs.getString("PRENUME") + "|" + rs.getString("DATA_NASTERII"));
                Student student = new Student(rs.getInt("ID"), rs.getString("NUME"), rs.getString("PRENUME"), rs.getDouble("MEDIA"), rs.getDate("DATA_NASTERII"));
                studenti.add(student);
            }

            // Calling a stored procedure - currently not available in SQLite
            CallableStatement callableStatement = conn.prepareCall("call GelAllStudents()");

            callableStatement.execute();

            conn.commit();

            for (Student student : studenti) {
                System.out.println(student);
            }
            System.out.println("Committed the transaction");

        } catch (SQLException e) {

            System.out.println("SQL error");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Error registering the JDBC driver for MySQL");
            throw new RuntimeException(e);
        }


    }

    private static String getInsertStatement(String nume, String prenume, String dataNasterii) {
        String insert = "INSERT INTO STUDENTI (NUME, PRENUME, DATA_NASTERII) values ('"+nume+"', '"+prenume+"', '"+dataNasterii+"')";
        return insert;
    }
}

class Student {
    private int id;
    private String nume;
    private String prenume;
    private double media;
    private Date dataNasterii;

    public Student(int id, String nume, String prenume, double media, Date dataNasterii) {
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.media = media;
        this.dataNasterii = dataNasterii;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", media=" + media +
                ", dataNasterii=" + dataNasterii +
                '}';
    }
}
