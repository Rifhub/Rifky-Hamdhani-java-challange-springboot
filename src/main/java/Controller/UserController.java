package Controller;

import DTO.RegisDTO;
import Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
public class UserController {


    private final UserService userService;


    @GetMapping("/")
    public String Homepage() {
        return "Java Challange";
    }

    @PostMapping("/Registration")
    public ResponseEntity<Object> registrationUser(@RequestBody RegisDTO registrationDTO) throws Exception {
        return userService.regis(registrationDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<Object> authenticateUser(@RequestBody RegisDTO registrationDTO) throws Exception {
        return userService.loginUsers(registrationDTO);
    }

    @GetMapping("/users")
    public ResponseEntity<Object> getUsers() throws Exception {
        return userService.findAllUsers();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable long id) throws Exception {
        return userService.findById(id);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<Object> editUsers(@PathVariable long id, @RequestBody RegisDTO registrationDTO) throws Exception {
        return userService.editUser(registrationDTO, id);
    }
}
