package ma.observatoire.model;

public class UserDTO {
	private String nomPresident;
	private String userName;
	private int telephonePresident;
	private String password;
	public UserDTO(String nomPresident, String userName, int telephonePresident, String password) {
		super();
		this.nomPresident = nomPresident;
		this.userName = userName;
		this.telephonePresident = telephonePresident;
		this.password = password;
	}
	public UserDTO() {
		
	}
	public String getNomPresident() {
		return nomPresident;
	}
	public void setNomPresident(String nomPresident) {
		this.nomPresident = nomPresident;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getTelephonePresident() {
		return telephonePresident;
	}
	public void setTelephonePresident(int telephonePresident) {
		this.telephonePresident = telephonePresident;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
