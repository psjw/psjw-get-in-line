package com.psjw.getinline.domain;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * packageName : com.psjw.getinline.domain
 * fileName : Admin
 * author : psjw
 */
@Data
public class Admin {
    private Long id;
    private String email;
    private String nickname;
    private String password;
    private String phoneNumber;
    private String memo;

    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;
}
