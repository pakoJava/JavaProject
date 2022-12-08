package dto;

public class UserDto {

	private int user_id;
	private String user_name;
	private String pwd;
	
	public UserDto(int id, String name, String pwd) {
		this.user_id=id;
		this.user_name=name;
		this.pwd = pwd;
	}
	
	public UserDto() {}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	};
	
	
	
}
