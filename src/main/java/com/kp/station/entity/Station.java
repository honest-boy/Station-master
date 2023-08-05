package com.kp.station.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "station")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "isEntry",nullable = false)
    private Boolean isEntry;

    @Column(name="created_on",nullable = false, columnDefinition = "DATETIME")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime createdOn;

}
