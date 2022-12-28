package org.zerock.w2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
// @Data는 getter/setter/toString/equals/hashCode등을 모두 컴파일할때 사용
public class TodoDTO {
    private long tno;

    private String title;

    private LocalDate dueDate;

    private boolean finished;
}
