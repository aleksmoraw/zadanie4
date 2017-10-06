import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/productServlet")
public class ProductServlet extends HttpServlet {

    @Inject
    ProductDaoBeanLocal productDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");

        if (action.equals("add")) {
            addProduct(req);
        } else if (action.equals("update")) {
//            updateProduct(req, resp);
        } else if (action.equals("delate")) {
            productDao.deleteProduct(Integer.parseInt(req.getParameter("id")));
        }
    }

    void addProduct(HttpServletRequest req) {
        Product product = new Product();
        product.setProductName(req.getParameter("productName"));
        product.setProductCount(Integer.valueOf(req.getParameter("productCount")));
    }

//    void updateProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//
//        String productName = req.getParameter("productName");
//        String productCount = req.getParameter("productCount");
//
//        if (productName != null && !productName.isEmpty()) {
//            meeting.setMeetingName(meetingName);
//        }
//        if (meetingShortName != null && !meetingShortName.isEmpty()) {
//            meeting.setMeetingShortName(meetingShortName);
//        }
//        if (streetName != null && !streetName.isEmpty()) {
//            meeting.setStreetName(streetName);
//        }
//        if (cityName != null && !cityName.isEmpty()) {
//            meeting.setCityName(cityName);
//        }
//        if (meetingTime != null && !meetingTime.isEmpty()) {
//            meeting.setMeetingTime(Date.valueOf(meetingTime));
//        }
//        meetingDAO.updateMeeting(meeting);
//    }
}


//        if (action == null || action.isEmpty()) {
//            resp.getWriter().write("Action is empty!\n");
//            return;
//        }
//
//        if (action.equals("add")) {
//            addMeeting(req);
//        } else if (action.equals("update")) {
//            updateMeeting(req, resp);
//        } else if (action.equals("delete")) {
//            meetingDAO.deleteMeeting(Integer.parseInt(req.getParameter("id")));
//        } else if (action.equals("findAll")) {
//            List<Meeting> meetings = meetingDAO.findAllMeetings();
//            for (Meeting meeting : meetings) {
//                resp.getWriter().write(meeting.getMeetingName() + "\n");
//            }
//        } else if (action.equals("findAllAfterDate")) {
//            List<Meeting> meetings = meetingDAO.findAllMeetingsAfterDate(Date.valueOf(req.getParameter("meetingTime")));
//            for (Meeting meeting : meetings) {
//                resp.getWriter().write(meeting.getMeetingName() + "\n");
//            }
//        }
//
//        resp.getWriter().write(getClass().getName() + " OK!");
//    }
//
//    void addMeeting(HttpServletRequest req) {
//        Meeting meeting = new Meeting();
//        meeting.setMeetingName(req.getParameter("meetingName"));
//        meeting.setMeetingShortName(req.getParameter("meetingShortName"));
//        meeting.setStreetName(req.getParameter("streetName"));
//        meeting.setCityName(req.getParameter("cityName"));
//        meeting.setMeetingTime(Date.valueOf(req.getParameter("meetingTime")));
//
//        meetingDAO.addMeeting(meeting);
//    }
//
//    void updateMeeting(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        Meeting meeting = meetingDAO.findMeetingById(Integer.parseInt(req.getParameter("id")));
//
//        if (meeting == null) {
//            resp.getWriter().write("Meeting for this ID does not exist!\n");
//            return;
//        }
//
//        String meetingName = req.getParameter("meetingName");
//        String meetingShortName = req.getParameter("meetingShortName");
//        String streetName = req.getParameter("streetName");
//        String cityName = req.getParameter("cityName");
//        String meetingTime = req.getParameter("meetingTime");
//
//        if (meetingName != null && !meetingName.isEmpty()) {
//            meeting.setMeetingName(meetingName);
//        }
//        if (meetingShortName != null && !meetingShortName.isEmpty()) {
//            meeting.setMeetingShortName(meetingShortName);
//        }
//        if (streetName != null && !streetName.isEmpty()) {
//            meeting.setStreetName(streetName);
//        }
//        if (cityName != null && !cityName.isEmpty()) {
//            meeting.setCityName(cityName);
//        }
//        if (meetingTime != null && !meetingTime.isEmpty()) {
//            meeting.setMeetingTime(Date.valueOf(meetingTime));
//        }
//        meetingDAO.updateMeeting(meeting);
//    }
//
//}
