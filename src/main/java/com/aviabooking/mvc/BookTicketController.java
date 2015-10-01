package com.aviabooking.mvc;

/**
 * Created by vataga on 24.09.2015.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping(value = "/booking")
@SessionAttributes(types = TicketForm.class)
public class BookTicketController {

    @RequestMapping(method = RequestMethod.GET)
    public String start(Model model) {
        // ����� ������ �� start() ����� ����� ����������� � http session �������� ��������� @SessionAttributes(types = TicketForm.class)
        model.addAttribute(new TicketForm());
        return "/booking";
    }

    @RequestMapping(value = "/movie", method = RequestMethod.POST)
    public String selectMovie(TicketForm ticketForm) {

        Assert.notNull(ticketForm);
        Assert.notNull(ticketForm.getMovieId());

        return "/customer";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public String enterCustomerData(TicketForm ticketForm) {

        Assert.notNull(ticketForm);
        // movieId �� ����������� � customer.jsp, �� �� ��� �������� � ������ �� ����� selectMovie()
        Assert.notNull(ticketForm.getMovieId());
        Assert.notNull(ticketForm.getLastName());

        return "/payment";
    }

    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    public String enterPaymentDetails(TicketForm ticketForm) {

        // movieId �� ����������� � customer.jsp, �� �� ��� �������� � ������ �� ����� selectMovie()
        Assert.notNull(ticketForm.getMovieId());
        // lastName �� ����������� � payment.jsp, �� �� ��� �������� � ������ �� ����� enterCustomerData()
        Assert.notNull(ticketForm.getLastName());
        Assert.notNull(ticketForm.getCreditCardNumber());

        return "redirect:/booking/confirmation";
    }

    @RequestMapping(value = "/confirmation", method = RequestMethod.GET)
    public String confirmation(SessionStatus status) {
        status.setComplete(); // ������� Spring Session � ����� ������������ ������ ������
        return "/confirmation";
    }

}
