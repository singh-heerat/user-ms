package com.heeratsingh.userservice.mapper;

import com.heeratsingh.userservice.dto.UserDTO;
import com.heeratsingh.userservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapUserDTOToUser(UserDTO userDTO);
    UserDTO mapUserToUserDTO(User user);

}
