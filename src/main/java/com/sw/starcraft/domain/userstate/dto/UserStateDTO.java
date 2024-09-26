package com.sw.starcraft.domain.userstate.dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserStateDTO {
    private int id;
    private String state;
}