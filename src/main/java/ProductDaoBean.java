import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ProductDaoBean implements ProductDaoBeanLocal {

    @PersistenceContext(name = "cwiczenie4")
    EntityManager em;

    public void addProduct(Product product) {
        em.persist(product);
    }

    public void updateProduct(Product product) {
        em.merge(product);
    }

    public void deleteProduct(Integer id) {
        Product product = em.find(Product.class, id);
        if (product != null) {
            em.remove(product);
        }
    }

}
