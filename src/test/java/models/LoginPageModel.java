package models;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginPageModel {
    private String username;
    private String password;
}
