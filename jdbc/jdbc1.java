import java.sql.*;

class jdbc1 {

	public static void main(String... args) {

		try {

			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			String url = "jdbc:mysql://localhost:3306/j1";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);

			if (con.isClosed()) {

				System.out.println("connection is still closed");
			} else {
				System.out.println("connection created ");

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
