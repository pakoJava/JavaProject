package dao;

import java.sql.*;

public class Database {
	
	Connection conn;
	ResultSet rs;
	
	 public Connection openConnection()  {
		 
	        try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aereodb", "root", "password");
	        }catch(SQLException | ClassNotFoundException e)
	        {
	            throw new RuntimeException(e);
	        }

	        return this.conn;
	    }
	
	 public void closeConnection() throws SQLException
	 {
		 if(!this.conn.isClosed())
			 this.conn.close();
	 }

	 
	 public ResultSet exQueryRes(String query, Object[]param) throws SQLException {

            PreparedStatement prepStat = conn.prepareStatement(query);

            for(int i=0; i< param.length; i++)
            {
                prepStat.setObject(i+1, param[i]); //indice: i+1 perch� si parte da 1 e indica la risposta al ? nella query.  valore: param[i]
            }

           rs = prepStat.executeQuery();

           return rs;
    }
	 
	  public int exQueryUpd (String query, Object[]param) throws SQLException {

          PreparedStatement prepStat = conn.prepareStatement(query);

          for(int i=0; i< param.length; i++)
          {
              prepStat.setObject(i+1, param[i]);
          }

          
          return prepStat.executeUpdate();
  }
	  
}
