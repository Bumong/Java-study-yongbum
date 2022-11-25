package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class Product {

    private int productCode;
    private String productName;
    private int price;
    private int stock;

    public static ProductBuilder builder(){
        return new ProductBuilder();
    }

}

