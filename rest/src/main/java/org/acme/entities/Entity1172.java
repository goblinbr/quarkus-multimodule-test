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
@Table(name = "ENTITY_1172")
public class Entity1172 {

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

    public Entity1172() {
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
        if (!(o instanceof Entity1172)) return false;
        Entity1172 other = (Entity1172) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Entity1172{" +
                "id=" + id +
                ", column1='" + column1 + '\'' +
                ", column2=" + column2 +
                '}';
    }
}

