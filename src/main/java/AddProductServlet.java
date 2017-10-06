import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addProductServlet")

public class AddProductServlet extends HttpServlet {

    @Inject
    ProductDaoBeanLocal productDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            RequestDispatcher dispatcher = getServletContext()
                    .getRequestDispatcher("/WEB-INF/AddProduct.jsp");
            dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Product product = new Product();
        String productName = getServletContext().getAttribute("productName").toString();
        getServletContext().setAttribute("productName", productName);
        String productCount = getServletContext().getAttribute("productCount").toString();
        getServletContext().setAttribute("productCount", productCount);
        product.setProductName(productName);
        product.setProductCount(Integer.valueOf(productCount));

        productDao.addProduct(product);
    }
}
