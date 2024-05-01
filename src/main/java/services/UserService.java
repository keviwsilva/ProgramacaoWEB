package services;

import entities.User;
import org.springframework.stereotype.Service;
import services.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User insert(User user);

    void delete(Long id);

    User update(Long id, User user);
}
