package com.study.ticket.service;

import com.study.ticket.entity.Ticket;
import com.study.ticket.repository.TicketRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket saveTicket(Ticket ticket) {
        log.info("Method saveTicket - TicketService");
        return ticketRepository.save(ticket);
    }

    public Ticket findTicketById(Long ticketId) {
        log.info("Method findTicketById - TicketService");
        return ticketRepository.findByTicketId(ticketId);
    }
}
