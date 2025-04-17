package rocks.zipcode.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class AuthorDTO {
    
    private Long id;

    public Long getId() {
        return id;
    }

    @NotBlank(message = "Name is required")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String biography;
    
    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Email(message = "Email should be valid")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AuthorDTO(Long id, @NotBlank(message = "Name is required") String name, String biography,
            @Email(message = "Email should be valid") String email) {
        this.id = id;
        this.name = name;
        this.biography = biography;
        this.email = email;
    }

    public AuthorDTO() {
    }
    
    public void setId(Long id) {
        this.id = id;
    }


}
