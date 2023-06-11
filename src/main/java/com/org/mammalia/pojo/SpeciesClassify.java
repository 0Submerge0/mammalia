package com.org.mammalia.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpeciesClassify {
    private Integer id;
    private String name;
    private Integer parentId;
}
