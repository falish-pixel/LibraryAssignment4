package kz.aitu.librarysecond.services.interfaces;

import kz.aitu.librarysecond.models.User;

import java.util.ArrayList;
import java.util.List;

public interface UserServiceInterface {
    List<User> getAll();
    User getById(int id);
    User create(User user);
    List<User> getBySurname(String surname);
}
