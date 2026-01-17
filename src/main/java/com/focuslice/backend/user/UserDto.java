package com.focuslice.backend.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
    private UUID id;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt;

    /**
     * return only generic info -> id and username
     * @return
     */
    public static UserDto fromEntity(UserEntity entity){
        UserDto dto = new UserDto();
        dto.setId(entity.getId());
        dto.setUsername(entity.getUsername());
        return dto;
    }
}
