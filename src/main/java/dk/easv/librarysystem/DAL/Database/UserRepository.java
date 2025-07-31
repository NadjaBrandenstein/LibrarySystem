package dk.easv.librarysystem.DAL.Database;
// Project Imports
import dk.easv.librarysystem.BE.User;
import dk.easv.librarysystem.DAL.IRepository;
// Java Imports
import java.util.List;

public class UserRepository implements IRepository<User> {
    @Override
    public List<User> getAll() throws Exception {
        return List.of();
    }

    @Override
    public User add(User user) throws Exception {
        return null;
    }

    @Override
    public User update(User user) throws Exception {
        return null;
    }

    @Override
    public void delete(User user) throws Exception {

    }
}
