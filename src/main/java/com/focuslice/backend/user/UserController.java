package com.focuslice.backend.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> getUser(@PathVariable UUID userId) {
        userService.getUserByUuid(userId);
        return ResponseEntity.ok(null);
    }

    @PostMapping("/new")
    public ResponseEntity<UserEntity> registerUser(@RequestBody UserDto userDto){
        // TODO > do validation

        // save
        userService.createUser(userDto);
    }
}
