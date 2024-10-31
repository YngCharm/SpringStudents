package charm.springStudents.models;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastname;
    private LocalDate dateOfBirth;
    @NonNull
    private String email;
    private int age;
}
