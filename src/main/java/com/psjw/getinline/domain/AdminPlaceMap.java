package com.psjw.getinline.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * packageName : com.psjw.getinline.domain
 * fileName : AdminPlaceMap
 * author : psjw
 */
@Data
public class AdminPlaceMap {
    private Long id;

    private Long adminId;
    private Long placeId;

    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;
}
