import javax.ejb.Local;
import java.util.List;

@Local
public interface ProductDaoBeanLocal {

    void addProduct(Product product);

    void deleteProduct(Integer id);

    void updateProduct(Product product);

    List<Product> getAll();
}