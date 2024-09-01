package example.service;

import example.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void save(User user) {
        System.out.println(user);
    }
}
