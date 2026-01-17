package com.focuslice.backend.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void getUserByUuid(UUID userId) {
        userRepository.findById(userId);
    }

    public UserDto createUser(UserDto userDto) {
        UserEntity newUser = UserEntity.fromUserDto(userDto);
        UserEntity user = userRepository.save(newUser);

        return userDto;
    }
}
