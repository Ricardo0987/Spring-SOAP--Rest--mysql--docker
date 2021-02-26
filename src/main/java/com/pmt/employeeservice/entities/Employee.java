package com.pmt.employeeservice.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.io.Serializable;

@Entity
@Table(name = "employee")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)

public class Employee implements Serializable {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @NotEmpty
    private String names;

    @NotEmpty
    @Column(name = "sur_names")
    private String surNames;

    @Id
    @NotEmpty
    @Column(name = "document_number")
    private String documentNumber; // Número de Documento (String)

    @NotEmpty
    @Column(name = "document_type")
    private String documentType; // Tipo de Documento (String)

    @NotNull
    @Column(name = "birth_date")
    @Pattern(regexp = "^\\d{4}\\/\\d{2}\\/\\d{2}$", message = "format must be yyyy/MM/dd")
    private String birthDate; //Fecha de Nacimiento (Date)

    @NotNull
    @Column(name = "date_link_company")
    @Pattern(regexp = "^\\d{4}\\/\\d{2}\\/\\d{2}$", message = "format must be yyyy/MM/dd")
    private String dateLinkCompany; //Fecha de Vinculación a la Compañía (Date)

    @NotEmpty
    private String position; // Cargo (String)

    @NotNull
    private Double salary; // Salario (Double)

    @Transient
//    @XmlTransient
    @JsonInclude
    private String currentAge;

    @Transient
//    @XmlTransient
    @JsonInclude
    private String companyLinkTime;


}

