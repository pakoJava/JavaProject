package repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.Database;
import dto.UserDto;

public class UserRepository {
	
	Database db = new Database();
	
	public int registraUtente(String usr, String pwd) throws SQLException {
		
		UserDto u = new UserDto();
		
		u.setUser_name(usr);
		u.setPwd(pwd);
		
		int op=0;
		db.openConnection();
		
		op=db.exQueryUpd( "INSERT INTO user (user_name,user_pwd) VALUES(?,?)", new Object[]{u.getUser_name(),u.getPwd() });
		
		db.closeConnection();
		return op;
	}
	
	public void rimuoviUtente(int id) throws SQLException {
		
		db.openConnection();
		db.exQueryUpd("DELETE FROM users WHERE user_id=?", new Object[]{  id });
		db.closeConnection();
	}
	
	public boolean accedi(int id, String pwd) throws SQLException {
		
		db.openConnection();
		
		ResultSet rs = db.exQueryRes("SELECT * FROM user WHERE user_id=? AND user_pwd=?" , new Object[] {id, pwd});
		
		if(rs.next()) {
			
			return true;
		}
		
		//if(rs.next())System.out.println("id: " + rs.getInt(1) + " usr: " + rs.getString(2) + " pwd: " + rs.getString(3));
		
		db.closeConnection();
		
		return false;
	}
	
	public int getId(String usr, String pwd) throws SQLException {
		
		db.openConnection();
		
		ResultSet rs = db.exQueryRes("SELECT * FROM user WHERE user_name=? AND user_pwd=?" , new Object[] {usr, pwd});
		
		if(rs.next()) {
			
			return rs.getInt(1);
		}
		
		return 0;
	}
	
	
}
