package com.example.Util;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class PageBeanUtil {
    private long total;
    private List<Object> rows;
}
