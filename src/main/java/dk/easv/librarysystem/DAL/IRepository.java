package dk.easv.librarysystem.DAL;
// Java Import
import java.util.List;

public interface IRepository<T> {

    List<T> getAll() throws Exception;
    T add(T t) throws Exception;
    T update(T t) throws Exception;
    void delete(T t) throws Exception;

}
