package DTO;

import Entity.User;
import Entity.Users;
import lombok.*;

public class RegisDTO {

    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public class RegistDTO {
        private String username;
        private String password;
        public User saveToEntity(){
            return User.builder()
                    .username(this.username)
                    .password(this.password)
                    .build();
        }
    }

}
