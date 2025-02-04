package io.github.linpeilie.model;

import io.github.linpeilie.annotations.AutoMapper;
import io.github.linpeilie.annotations.AutoMapping;
import java.util.Date;
import lombok.Data;

@Data
@AutoMapper(target = Goods.class)
public class GoodsDto {

    @AutoMapping(target = "takeDownTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date takeDownTime;

    @AutoMapping(target = "price", numberFormat = "$#.00")
    private int price;

    private Integer state;

    private int type;

}
