package ca.utoronto.lms.subject.dto;

import ca.utoronto.lms.shared.dto.BaseDTO;
import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SubjectMaterialDTO extends BaseDTO<Long> {
  @NotBlank(message = "Name is mandatory")
  private String name;

  @NotBlank(message = "Description is mandatory")
  private String description;

  @NotBlank(message = "Resource URL is mandatory")
  private String resourceUrl;

  @NotNull(message = "Publication date is mandatory")
  private LocalDateTime publicationDate;

  private TeacherDTO teacher;

  @NotBlank(message = "Description is mandatory")
  private SubjectDTO subject;
}
