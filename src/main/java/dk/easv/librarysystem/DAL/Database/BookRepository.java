package dk.easv.librarysystem.DAL.Database;
// Project Imports
import dk.easv.librarysystem.BE.Books;
import dk.easv.librarysystem.DAL.IRepository;
// Java Imports
import java.util.List;

public class BookRepository implements IRepository<Books> {


    @Override
    public List<Books> getAll() throws Exception {
        return List.of();
    }

    @Override
    public Books add(Books books) throws Exception {
        return null;
    }

    @Override
    public Books update(Books books) throws Exception {
        return null;
    }

    @Override
    public void delete(Books books) throws Exception {

    }
}
