package com.sw.starcraft;

import com.sw.starcraft.domain.user.UserDTO;
import com.sw.starcraft.domain.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdminInitializer implements CommandLineRunner {

    private final UserService userService;

    @Value("${admin.password}")
    private String adminPassword;

    @Override
    public void run(String... args) {
        UserDTO userDTO = UserDTO.builder()
                .email("admin")
                .password(adminPassword)
                .userStatesId(1)
                .build();

        userService.createAdmin(userDTO);
    }
}
