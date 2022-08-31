package Repository;


import Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String role);
}
