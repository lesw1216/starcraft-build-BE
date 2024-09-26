package com.sw.starcraft.domain.user.repository;

import com.sw.starcraft.domain.user.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRepositoryMyBatis implements UserRepository  {
    
    private final UserMapper userMapper;
    
    @Override
    public Long save(UserDTO user) {
        return userMapper.save(user);
    }
}
