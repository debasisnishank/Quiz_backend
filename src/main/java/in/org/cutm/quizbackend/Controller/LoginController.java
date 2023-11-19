package in.org.cutm.quizbackend.Controller;

import in.org.cutm.quizbackend.Entity.Users;
import in.org.cutm.quizbackend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class LoginController {


	private UserRepository userRepo;
	@Autowired
	public void loginController(UserRepository userRepository){
		userRepo = userRepository;
	}

	@PostMapping("/login")
	public Users Login(@RequestBody Map<String, String> credential ) {
		System.out.println("In Login");
		String username = credential.get("username");
		String password = credential.get("password");
		List<Users> userByUname = userRepo.findByUsername(username);
		for(Users user: userByUname) {
			if(password.equals(user.getPassword())) {
				if(user.isAdmin() == true) return user;
				else {
					return user;
				}
			}
		}

		return null;
	}

}
