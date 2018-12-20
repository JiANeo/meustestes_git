import java.sql.*;


public class principal {

	public static void main(String[] args) throws ClassNotFoundException {
         String drivercon="com.mysql.jdbc.Driver";
         String url="jdbc:mysql://localhost:3306/veiculos";
         Class.forName(drivercon);
		
		try {
			Connection con=DriverManager.getConnection(url,"root","JiA4ever");
			
			System.out.println("Conexão efetuada: --"+con+"--");
			con.close();
		} catch (SQLException e) {
			 System.out.println("Erro na conexão: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
