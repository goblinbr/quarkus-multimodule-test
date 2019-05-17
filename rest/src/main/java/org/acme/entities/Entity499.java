package org.acme.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "ENTITY_499")
public class Entity499 {

    @Id
    @Max(99999999999L)
    @Min(1)
    @Column(name = "ID")
    private Long id;

    @Size(max = 15)
    @Column(name = "COLUMN_1")
    private String column1;

    @Column(name = "COLUMN_2")
    private Boolean column2;

    public Entity499() {
        this.id = 0L;
        this.column1 = "";
        this.column2 = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public Boolean getColumn2() {
        return column2;
    }

    public void setColumn2(Boolean column2) {
        this.column2 = column2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity499)) return false;
        Entity499 other = (Entity499) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Entity499{" +
                "id=" + id +
                ", column1='" + column1 + '\'' +
                ", column2=" + column2 +
                '}';
    }
}

