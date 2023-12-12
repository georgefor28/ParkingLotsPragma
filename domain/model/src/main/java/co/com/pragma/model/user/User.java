package co.com.pragma.model.user;
import lombok.*;
//import lombok.NoArgsConstructor;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class User {
    private int id;
    private String firstname;
    private String lastname;
    private String document;
    private String email;
    private String phone;
    private int locationX;
    private int locationY;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", document='" + document + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", locationX=" + locationX +
                ", locationY=" + locationY +
                '}';
    }
}
