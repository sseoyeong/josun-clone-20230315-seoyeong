package com.hotel.josunclone20230315seoyeong.dto;

import com.hotel.josunclone20230315seoyeong.dto.validation.ValidationGroups;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class ReserveReqDto {
    @NotBlank(message = "예약자명 비워둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 1, max = 5, message = "이름은 5글자까지만 입력 가능합니다", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp = "^[가-힇]*$", message = "한글만 입력 가능합니다", groups = ValidationGroups.PatternCheckGroup.class)
    private String reservationName;

    @NotBlank(message = "이름은 비워둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 1, max = 15, message = "이름은 15글자까지만 입력 가능합니다", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp = "^[a-zA-Z]*$", message = "영어만 입력 가능합니다", groups = ValidationGroups.PatternCheckGroup.class)
    private String familyName;

    @NotBlank(message = "성은 비워둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 1, max = 10, message = "이름은 10글자까지만 입력 가능합니다", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp = "^[a-zA-Z]*$", message = "영어만 입력 가능합니다", groups = ValidationGroups.PatternCheckGroup.class)
    private String firstName;

    @NotBlank(message = "전화번호는 비워둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 4, max = 4, message = "전화번호는 4자까지 입력 가능합니다", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp = "^[0-9]*$", message = "전화번호는 하이픈(-)을 빼고 입력해야 합니다.", groups = ValidationGroups.PatternCheckGroup.class)
    private String phone;

    @NotBlank(message = "전화번호는 비워둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 4, max = 4, message = "전화번호는 4자까지 입력 가능합니다", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp = "^[0-9]*$", message = "전화번호는 하이픈(-)을 빼고 입력해야 합니다.", groups = ValidationGroups.PatternCheckGroup.class)
    private String phone2;
}
