package org.acme.domain.vo;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Id {
    private final UUID id;

    public static Id withId(String id) {
        return new Id(UUID.fromString(id));
    }

    public static Id withoutId() {
        return new Id(UUID.randomUUID());
    }
}
