package Service;


import Entity.User;
import Repository.RoleRepository;
import Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import responseHandler.ResponserHandler;

import java.util.List;


@Service
@AllArgsConstructor
public interface UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public ResponseEntity<Object> findAllUsers() throws Exception {
        try {
            List<User> users = userRepository.findAll();
            if (((List<?>) users).isEmpty()) {
                throw new Exception("Users not found");
            }
            return ResponserHandler.generateResponse("Success Retrieved User", HttpStatus.OK, users);
        } catch (Exception e) {
            return ResponserHandler.generateResponse(e.getMessage(), HttpStatus.NOT_FOUND, "Users Not Found");
        }
    }

    @Override
    public ResponseEntity<Object> findById(long id) throws Exception {

        User user = userRepository.findById(id).orElseThrow(() -> new Exception("User not found"));
        return ResponserHandler.generateResponse("Success Retrieved User", HttpStatus.OK, user);
    }

}
