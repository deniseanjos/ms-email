package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tb_email")
public class EmailModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;

    private String ownerRef;

    private String emailFrom;

    private String emailTo;

    private String subject;
    @Column(columnDefinition = "TEXT") //Não limitar a coluna ao padrão de 255 caracteres

    private String text;

    private LocalDateTime sendDateEmail;

    private StatusEmail statusEmail;

}
