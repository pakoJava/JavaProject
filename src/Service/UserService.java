package Service;

import java.sql.SQLException;
import repository.UserRepository;

public class UserService {
	
	UserRepository ur = new UserRepository();
	
	 public boolean registra(String usr, String pwd) {
	     try {
	           int result = ur.registraUtente(usr, pwd);

	           if (result == 0) {
	               throw new Exception("Operazione non riuscita");
	           }
	           
	           return true;
	           
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }
//
//	 public void rimuovi(int id){
//		 
//	        try{
//	        	
//	            ur.rimuoviUtente(id);
//	        }catch(SQLException e){
//	        	
//	            throw new RuntimeException(e);
//	        }
//	    }
	 
	 public boolean login(int id, String pwd) {
		 
		 try {
			
			return ur.accedi(id, pwd);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}
	 
	 public int getId(String usr, String pwd) {
		 
		 try {
			 
			return ur.getId(usr, pwd);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 return 0;
	 }
}
