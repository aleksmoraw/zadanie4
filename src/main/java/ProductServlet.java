import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

@WebServlet("/productServlet")
public class ProductServlet extends HttpServlet {

    @Inject
    ProductDaoBeanLocal productDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    productDao.getAll();

//        RequestDispatcher dispatcher = getServletContext()
//                .getRequestDispatcher("/WEB-INF/ProductDoGet.jsp");
//        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");

        if (action.equals("add")) {
            // TODO: METODA KTORA DODA PRODUKT
        } else if (action.equals("update")) {
            // TODO: METODA KTORA ZMODYFIKUJE PRODUKT
        } else if (action.equals("delete")) {
            // TODO: METODA KTORA USUNIE PRODUKT
        }
    }
}
