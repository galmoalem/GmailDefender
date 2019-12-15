package infra;

import java.util.List;

import data.UserEntity;

public interface UserService {
	public List <UserEntity> getUsingPagination(String adminSmartspace, String adminEmail, int size, int page);
	public void update(String userSmartspace, String userEmail, UserEntity userEntity);
	public UserEntity newUser(UserEntity user);
	public UserEntity login(String string);
}
