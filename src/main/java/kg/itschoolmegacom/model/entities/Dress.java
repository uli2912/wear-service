package kg.itschoolmegacom.model.entities;

import jakarta.persistence.*;

import kg.itschoolmegacom.model.entities.enums.Gender;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@Table (name = "dresses")
@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Dress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     String size;
     @Enumerated(value = EnumType.STRING)
     Gender gender;
     double price;
     boolean available;
     String color;
     String category;


     @Transient
    double amount;
}
