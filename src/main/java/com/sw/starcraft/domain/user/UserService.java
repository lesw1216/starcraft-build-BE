package com.sw.starcraft.domain.user;

import com.sw.starcraft.domain.user.repository.UserRepository;
import com.sw.starcraft.domain.userstate.UserStateServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final UserStateServiceImpl userStateService;

    public Long createUser(UserDTO createUser) {
        int findUserStateId = userStateService.findUserStateId("ACTIVE");

        createUser.setUserStatesId(findUserStateId);
        createUser.setPassword(passwordEncoder.encode(createUser.getPassword()));

        return userRepository.save(createUser);
    }

    public Long createAdmin(UserDTO createAdmin) {
        int findUserStateId = userStateService.findUserStateId("ADMIN");

        createAdmin.setUserStatesId(findUserStateId);
        createAdmin.setPassword(passwordEncoder.encode(createAdmin.getPassword()));
        return userRepository.save(createAdmin);
    }
}
