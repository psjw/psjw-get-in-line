package com.psjw.getinline.domain;

import com.psjw.getinline.constant.EventStatus;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * packageName : com.psjw.getinline.domain
 * fileName : Event
 * author : psjw
 */
@Data
public class Event {
    private Long id;

    private Long placeId;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventEndDatetime;
    private Integer currentNumberOfPeople;
    private Integer capacity;
    private String memo;

    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;
}
