package dao;

import java.util.List;
import java.util.Optional;

import data.UserEntity;

public interface UserDao<UserKey> {
		public UserEntity create (UserEntity userEntity);
		public Optional<UserEntity> readById(String string);
		public List<UserEntity> readAll();
		public void update (UserEntity userEntity);
		public void deleteAll();
		public static void main(String[] args) {
			
		}
		

}
