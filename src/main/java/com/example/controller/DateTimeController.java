package com.example.controller;

import com.example.model.DateTimeDto;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

/**
 * @author Deepak
 */
@RestController
@RequestMapping("/datetime")
public class DateTimeController {

    /**
     * @return LocalDateTime in ISO format
     * @see LocalDate
     * @see java.time.format.DateTimeFormatter
     */
    @GetMapping
    public ResponseEntity<DateTimeDto> getDateDto() {
        return ResponseEntity.ok(new DateTimeDto(LocalDateTime.now(), ZonedDateTime.now(), OffsetDateTime.now()));
    }

    /**
     * @param dateTimeDto in ISO format
     * @return LocalDateTime in ISO format
     */
    @GetMapping("/withParam")
    public ResponseEntity<DateTimeDto> getDateDtoParam(DateTimeDto dateTimeDto) {
        return ResponseEntity.ok(dateTimeDto);
    }

}
