import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

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

    public List<Product> getAll() {
        Query q = em.createNamedQuery("Product.findAll");
        return q.getResultList();



    }



}


