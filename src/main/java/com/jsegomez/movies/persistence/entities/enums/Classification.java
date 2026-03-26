package com.jsegomez.movies.persistence.entities.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Classification {

    G(0, "General Audiences", "Suitable for all ages"),
    PG(7, "Parental Guidance", "Some material may not be suitable for young children"),
    PG_13(13, "Parents Strongly Cautioned", "Some material may be inappropriate for children under 13"),
    R(17, "Restricted", "Under 17 requires accompanying parent or adult guardian"),
    NC_17(18, "Adults Only", "No one 17 and under admitted"),
    A_21(21, "Adults 21+", "Restricted to adults aged 21 and over");

    private final int minAge;
    private final String label;
    private final String description;

    Classification(int minAge, String label, String description) {
        this.minAge = minAge;
        this.label = label;
        this.description = description;
    }

    public String getName() {
        return this.name();
    }

    @JsonCreator
    public static Classification fromJson(Map<String, Object> map) {
        String name = (String) map.get("name");
        return Arrays.stream(values())
                .filter(c -> c.name().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown classification: " + name));
    }
}

