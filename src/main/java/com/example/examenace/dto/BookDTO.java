package com.example.examenace.dto;


import lombok.Data;

import java.util.Date;

@Data
public class BookDTO {
    private String titre;
    private String publisher ;
    private Date datePublication;
    private Double price;
    private String resume ;
}