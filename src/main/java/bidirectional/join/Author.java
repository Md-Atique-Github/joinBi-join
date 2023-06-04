package bidirectional.join;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Author {


@Id
 private Integer author_id;


 private String name;
 private int age;

 @JsonIgnore
 @OneToOne(mappedBy = "author")
 private Book book;

}
