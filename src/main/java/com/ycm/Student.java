package com.ycm;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
    Try to test all of these
    @NotNull
    @Cleanup
    @Getter @Setter
    @ToString
    @EqualsAndHashCode
    @Data (=@Getter+@Setter+@ToString+@EqualsAndHashCode+@RequiredArgsConstructor) damn useful
    @NoArgsConstructor @RequiredArgsConstructor @AllArgsConstructor
    @Value (Immutable class)
    @Builder
    @SneakyThrows
 */
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Student {

    private String name;
    private int age;
    private String gender;
    private String matricNum;
}