package infra;

import config.firebase.FirebaseTokenHolder;

public interface FirebaseService {

	
	FirebaseTokenHolder parseToken(String idToken);
}
