package com.example.examworkcrud.mapper;

import com.example.examworkcrud.dto.RegisterDto;
import com.example.examworkcrud.entity.UserRegisterEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public class RegisterMapper {

    public UserRegisterEntity  dtoToEntity(RegisterDto dto){
        UserRegisterEntity entity = new UserRegisterEntity();
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setUserName(dto.getUserName());
        return entity;
    }

    public RegisterDto  dtoToEntity(UserRegisterEntity entity){
        RegisterDto dto = new RegisterDto();
        dto.setEmail(entity.getEmail());
        dto.setPassword(entity.getPassword());
        dto.setUserName(entity.getUserName());
        return dto;
    }
}
