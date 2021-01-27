package com.study.user.service;

import com.study.user.entity.User;
import com.study.user.repository.UserRepository;
import com.study.user.valueobject.ResponseTemplateVO;
import com.study.user.valueobject.Ticket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Method saveUser - UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithTicket(Long userId) {
        log.info("Method getUserWithTicket - UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        Ticket ticket = restTemplate.getForObject("http://localhost:9001/tickets/" + user.getTicketId(), Ticket.class);

        vo.setUser(user);
        vo.setTicket(ticket);
        return vo;
    }
}
