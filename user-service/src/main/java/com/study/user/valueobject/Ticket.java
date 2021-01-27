package com.study.user.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    private Long ticketId;
    private String ticketSerial;
    private String ticketFloor;
    private String ticketRoomNumber;
}
