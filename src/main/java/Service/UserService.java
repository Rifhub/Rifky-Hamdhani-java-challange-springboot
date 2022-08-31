package Service;

import DTO.RegisDTO;
import org.springframework.http.ResponseEntity;

public class UserService {

    ResponseEntity<Object> findAllUsers()throws Exception;
    ResponseEntity<Object> findById(long id) throws Exception;
    ResponseEntity<Object> loginUsers(RegisDTO registrationDTO) throws Exception;
    ResponseEntity<Object> registrationUsers(RegisDTO registrationDTO) throws Exception;
    ResponseEntity<Object> editUser(RegisDTO registrationDTO,long id)throws Exception;


}
