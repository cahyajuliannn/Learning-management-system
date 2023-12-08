package ca.utoronto.lms.subject.model;

import ca.utoronto.lms.shared.model.BaseEntity;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SubjectMaterial extends BaseEntity<Long> {
  @Column(nullable = false)
  private String name;

  @Lob
  @Column(nullable = false)
  private String description;

  @Column(nullable = false)
  private String resourceUrl;

  @Column(nullable = false)
  private LocalDateTime publicationDate;

  @Column(nullable = false)
  private Long teacherId;

  @ManyToOne(optional = false)
  private Subject subject;
}
