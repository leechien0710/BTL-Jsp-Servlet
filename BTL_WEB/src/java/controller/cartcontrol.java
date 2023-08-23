package controller;

import dao.cartdb;
import dao.userdb;
import data.cart;
import data.product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.html.parser.DTDConstants;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "cartcontrol", urlPatterns = {"/cart"})
public class cartcontrol extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = "cart.jsp";
        String quantity = request.getParameter("quantity");
        if(quantity==null){
            HttpSession session = request.getSession();
        //String acc = session.getAttribute("acc").toString();
        List<cart> list = new ArrayList<>();
        if(session.getAttribute("acc")!=null){
            String acc = session.getAttribute("acc").toString();
            cartdb c = new cartdb();
            list = c.getcartbyid(acc);
            session.setAttribute("listcart", list);
        float tt = 0;
        for (cart i: list){
            tt+=i.getTotal();
        }
        session.setAttribute("tt", tt);
            //session.setAttribute(acc, price);
          } 
        else{
            url = "login.jsp";
        }
        }
        else{
            
        int quan = Integer.parseInt(quantity);
        HttpSession session = request.getSession();
        //String acc = session.getAttribute("acc").toString();
        product b = (product)session.getAttribute("p");
        float price = b.getPrice();
        float total = price*quan;
        List<cart> list = new ArrayList<>();
        if(session.getAttribute("acc")!=null){
            String acc = session.getAttribute("acc").toString();
            cartdb c = new cartdb();
            c.insert(acc, b.getName(), quan, b.getImage(), b.getPrice(), total);
            list = c.getcartbyid(acc);
            //session.setAttribute(acc, price);
        }
        else{
            cart x = new cart(0,"acc", b.getName(), quan, b.getImage(), b.getPrice(), total);
            list.add(x);
        }
        session.setAttribute("listcart", list);
        float tt = 0;
        for (cart i: list){
            tt+=i.getTotal();
        }
        session.setAttribute("tt", tt);
        }
        response.sendRedirect(url);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
