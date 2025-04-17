package rocks.zipcode.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
public class Book {
    public Book(Long id, @NotBlank(message = "Title is required") String title, String description,
            @NotNull(message = "Publication date is required") LocalDate publicationDate, String isbn, Author author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.publicationDate = publicationDate;
        this.isbn = isbn;
        this.author = author;
    }

    public Book() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank(message = "Title is required")
    private String title;
    
    @Column(length = 1000)
    private String description;
    
    @NotNull(message = "Publication date is required")
    private LocalDate publicationDate;
    
    private String isbn;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
