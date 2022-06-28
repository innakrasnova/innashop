package com.example.innashop.enums;

public enum Role {

    USER(1L),

    ADMIN(2L);

    private final Long id;

    Role(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
