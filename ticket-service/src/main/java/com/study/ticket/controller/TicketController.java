package com.study.ticket.controller;

import com.study.ticket.entity.Ticket;
import com.study.ticket.service.TicketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
@Slf4j
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/")
    public Ticket saveTicket(@RequestBody Ticket ticket){
        log.info("Method Save - TicketController");
        return  ticketService.saveTicket(ticket);
    }

    @GetMapping("/{id}")
    public Ticket findTicketById(@PathVariable("id") Long ticketId){
        log.info("Method findTicketById - TicketController");
        return ticketService.findTicketById(ticketId);
    }
}
