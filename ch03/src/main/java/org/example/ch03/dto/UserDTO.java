package org.example.ch03.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor // Args : 속성을 뜻함
@NoArgsConstructor
//@RequiredArgsConstructor
@Builder

public class UserDTO {

    private String userid;
    private String name;
    private String birth;
    private int age;





}
