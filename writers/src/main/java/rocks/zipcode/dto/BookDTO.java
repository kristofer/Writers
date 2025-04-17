package rocks.zipcode.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public class BookDTO {
    private Long id;
    
    @NotBlank(message = "Title is required")
    private String title;
    
    private String description;
    
    @NotNull(message = "Publication date is required")
    private LocalDate publicationDate;
    
    private String isbn;
    
    @NotNull(message = "Author ID is required")
    private Long authorId;
    
    private String authorName;

    public BookDTO(Long id, @NotBlank(message = "Title is required") String title, String description,
            @NotNull(message = "Publication date is required") LocalDate publicationDate, String isbn,
            @NotNull(message = "Author ID is required") Long authorId, String authorName) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.publicationDate = publicationDate;
        this.isbn = isbn;
        this.authorId = authorId;
        this.authorName = authorName;
    }

    public BookDTO() {
    }

    public String getTitle() {
        return this.title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
