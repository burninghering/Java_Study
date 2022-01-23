package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo; //import 해오기

public interface UserInfoDao {

	//유저 정보 DB 조작을 할 때, 구현해야 하는 기능은 아래와 같다고 선언하는 것이다.
	
	void insertUserInfo(UserInfo userUnfo);
	void deleteUserInfo(UserInfo userUnfo);
	void updateUserInfo(UserInfo userUnfo);
}
