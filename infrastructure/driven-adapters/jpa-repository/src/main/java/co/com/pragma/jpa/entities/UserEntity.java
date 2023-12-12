package co.com.pragma.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "pl_user")
public class UserEntity {
    @Id
    private int id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String document;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private int locationX;
    @Column
    private int locationY;
    @Column
    private String password;
}
