package DesignPattern.Builder;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Phone {

    private String phoneName;
    private String phoneModel;
    private double screenSize;
    private double price;
    private String phoneWarranty;

}
