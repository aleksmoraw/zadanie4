import javax.ejb.Local;

@Local
public interface ProductDaoBeanLocal {

    void addProduct(Product product);

    void deleteProduct(Integer id);

    void updateProduct(Product product);

}