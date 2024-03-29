package infra;

import org.springframework.stereotype.Service;

import conditionals.FirebaseCondition;
import config.firebase.FirebaseTokenHolder;


@Service
@FirebaseCondition
public class FirebaseServicelmpl implements FirebaseService {

	@Override
	public FirebaseTokenHolder parseToken(String firebaseToken) {
		return new FirebaseParser().parseToken(firebaseToken);
	}

}
