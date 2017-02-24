package com.example.bloom.remindme.dto;

/**
 * Created by Bloom on 24.02.2017.
 * DTO - Data Transfer Object
 * частина програми яка бере участь у обміні даними із сервером в даному випадку
 */

public class RemindDTO {

    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
