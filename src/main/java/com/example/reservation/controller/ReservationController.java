package com.example.reservation.controller;

import com.example.reservation.model.Reservation;
import com.example.reservation.service.ReservationService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ReservationController {

    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/")
    public String index(Model model) {
        if (!model.containsAttribute("reservation")) {
            model.addAttribute("reservation", new Reservation());
        }
        model.addAttribute("reservations", reservationService.findAll());
        return "index";
    }

    @PostMapping("/reservations")
    public String createReservation(
            @Valid @ModelAttribute("reservation") Reservation reservation,
            BindingResult bindingResult,
            Model model,
            RedirectAttributes redirectAttributes
    ) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("reservations", reservationService.findAll());
            return "index";
        }

        reservationService.save(reservation);
        redirectAttributes.addFlashAttribute("successMessage", "La réservation a bien été enregistrée.");
        return "redirect:/";
    }

    @PostMapping("/reservations/{id}/delete")
    public String deleteReservation(@PathVariable String id, RedirectAttributes redirectAttributes) {
        reservationService.deleteById(id);
        redirectAttributes.addFlashAttribute("successMessage", "La réservation a bien été supprimée.");
        return "redirect:/";
    }
}
