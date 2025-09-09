package ispit.ispit.repositories;

import ispit.ispit.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
    Object findAll();

    Object save(User entity);
}
