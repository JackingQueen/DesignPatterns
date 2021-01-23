package org.jtznenic.creational.builder;

import lombok.Data;

/**
 * 所要建造的产品
 */
@Data
public class Product {
    private String part1;
    private String part2;
    private String part3;

    public void show() {
        System.out.println(part1 + "---" + part2 + "---" + part3);
    }
}
