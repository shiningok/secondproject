package com.diet.second_project_diet.weight.vo;

import com.diet.second_project_diet.entity.WeightInfoEntity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReGetWeightResponseVO {
  @Schema(description = "몸무게 정보 데이터")
  private WeightInfoEntity data;
  @Schema(description = "몸무게 차이")
  private Double diff;
  @Schema(description = "상태값", example = "true")
  private Boolean status;
  @Schema(description = "메시지", example = "메시지입니다")
  private String message;
}
