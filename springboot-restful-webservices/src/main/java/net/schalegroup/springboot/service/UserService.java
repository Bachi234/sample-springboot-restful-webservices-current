package net.schalegroup.springboot.service;
import net.schalegroup.springboot.DTO.UserDTO;
import net.schalegroup.springboot.entity.User;
import java.util.List;
public interface UserService {
    UserDTO createUser(UserDTO user);
    UserDTO getUserById(Long userId);
    List<UserDTO> getAllUsers();
    UserDTO updateUser(UserDTO user);
    void deleteUser(Long userId);
}
