package dk.easv.librarysystem.DAL.Database;
// Project Imports
import dk.easv.librarysystem.BE.Image;
import dk.easv.librarysystem.DAL.IRepository;
// Java Imports
import java.util.List;

public class ImageRepository implements IRepository<Image> {

    @Override
    public List<Image> getAll() throws Exception {
        return List.of();
    }

    @Override
    public Image add(Image image) throws Exception {
        return null;
    }

    @Override
    public Image update(Image image) throws Exception {
        return null;
    }

    @Override
    public void delete(Image image) throws Exception {

    }
}
