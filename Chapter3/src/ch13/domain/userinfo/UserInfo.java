package ch13.domain.userinfo;

public class UserInfo {
	
	private String userId;
	private String password;
	private String userName;
	
	//private로 변수들 선언했으므로 getter/setter 만들어주기
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
