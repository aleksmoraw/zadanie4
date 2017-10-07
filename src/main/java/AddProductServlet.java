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
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//            RequestDispatcher dispatcher = getServletContext()
//                    .getRequestDispatcher("/WEB-INF/AddProduct.jsp");
//            dispatcher.forward(req, resp);
//    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("productName");
        String count = request.getParameter("productCount").toString();
        Product product = new Product();
        product.setProductName(name);
        product.setProductCount(Integer.valueOf(count));
        productDao.addProduct(product);
        response.sendRedirect(request.getContextPath());

    }
}
