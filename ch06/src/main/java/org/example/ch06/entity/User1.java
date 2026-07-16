package org.example.ch06.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.example.ch06.dto.User1DTO;

@Getter
//@Setter Entity에서는 Setter 금지
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "user1")
public class User1 {
    @Id
    private String userid;

    @Column(name = "name", length = 10, nullable = false)
    private String name;

    @Column(name = "hp", columnDefinition = "CHAR(13)", nullable = false)
    private String hp;

    @Column(nullable = false)
    private int age;

    // DTO 변환 메서드
    public User1DTO toDTO(){
        return User1DTO.builder()
                .userid(userid)
                .name(name)
                .hp(hp)
                .age(age)
                .build();
    }
}