package com.swisscom.taaweni0.demoapp.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class World {
    String hello;
    LocalDateTime timestamp;
    String uuid;
}
