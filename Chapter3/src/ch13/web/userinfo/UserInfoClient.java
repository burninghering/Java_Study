package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		//인터페이스를 보고 사용한다.
		
		FileInputStream fis = new FileInputStream("db.properties"); //InputStream으로 db.properties파일 열기
		
		Properties prop = new Properties();
		prop.load(fis); //파일 읽어오기
		
		//두 개의 쌍으로 되어있는 값을 리턴해줌
		String dbType = prop.getProperty("DBTYPE"); //DBTYPE의 값 리턴 
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("김혜린");
		
		UserInfoDao userInfoDao = null; //인터페이스 타입으로 변수 선언, 인터페이스니까 값이 null
		
		if( dbType.equals("ORACLE")) { //dbType이 어떤 값이냐에 따라 
			userInfoDao=new UserInfoOracleDao(); //null에 값을 넣어줌
		}
		
		else if (dbType.equals("MYSQL")) {
			userInfoDao=new UserInfoMySqlDao();
		}
		else {
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}
}
