package system.collegemanagement.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import system.collegemanagement.model.UserRole;

@Data
@Builder
@AllArgsConstructor
public class UserDto {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private UserRole userRole;
}
