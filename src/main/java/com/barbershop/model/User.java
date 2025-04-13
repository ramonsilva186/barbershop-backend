package com.barbershop.model;

import com.barbershop.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String name;

    @Email(message = "Email inválido")
    @Column(unique = true)
    private String email;

    @NotBlank(message = "Senha é obrigatória")
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Nome é obrigatório") String name) {
        this.name = name;
    }

    public @Email(message = "Email inválido") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "Email inválido") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Senha é obrigatória") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Senha é obrigatória") String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
