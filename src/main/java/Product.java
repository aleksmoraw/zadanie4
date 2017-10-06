import javax.enterprise.inject.Model;
import javax.inject.Named;
import javax.persistence.*;

//@NamedQueries({
//        @NamedQuery(query = "SELECT m FROM Meeting m", name = "com.infoshareacademy.entities.Meeting.findAll"),
//        @NamedQuery(query = "SELECT m FROM Meeting m WHERE m.meetingTime >= :afterDate", name = "com.infoshareacademy.entities.Meeting.findAllAfterDate")
//})

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_count")
    private Integer productCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }
}
