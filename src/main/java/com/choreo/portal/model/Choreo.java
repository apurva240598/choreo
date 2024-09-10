package com.choreo.portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "choreo")
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Choreo {
    @Id
    private String id;
    private String name;
}
