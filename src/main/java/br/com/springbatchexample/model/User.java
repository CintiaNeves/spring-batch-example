package br.com.springbatchexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private Long idUser;

    private String name;

    private String dept;

    private Double salary;


}
