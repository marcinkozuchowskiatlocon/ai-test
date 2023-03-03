package pl.locon.somecool.book;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
class Book {

    @Id
    private Long id;

    private String title;

}
