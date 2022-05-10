package com.psjw.getinline.domain;

import com.psjw.getinline.constant.PlaceType;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * packageName : com.psjw.getinline.domain
 * fileName : Place
 * author : psjw
 */
@Data
public class Place {
    private Long id;

    private PlaceType placeType;
    private String placeName;
    private String address;
    private String phoneNumber;
    private Integer capacity;
    private String memo;

    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;
}
