package com.fengwenyi.learn_validator_util.vo;

import lombok.Data;

import javax.validation.constraints.*;
import java.util.List;

/**
 * @author Erwin Feng
 * @since 2019-06-11 01:14
 */
@Data
public class User {

    @NotNull
    private Integer id;

    @NotBlank
    private String username;

    @NotNull
    @Max(30)
    @Min(0)
    private Integer age;

    @NotEmpty
    private List<String> schools;

}
