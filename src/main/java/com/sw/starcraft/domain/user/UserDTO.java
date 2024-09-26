package com.sw.starcraft.domain.user;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {
    private Long id;
    private String email;
    private String password;
    private int userStatesId;
}