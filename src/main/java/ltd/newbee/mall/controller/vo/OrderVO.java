package ltd.newbee.mall.controller.vo;

import lombok.Data;

import java.util.Date;

@Data
public class OrderVO {
    private Long orderId;

    private String orderNo;

    private Long userId;

    private Double totalPrice;

    private Byte payStatus;

    private Byte payType;

    private Date payTime;

    private Byte orderStatus;

    private String extraInfo;

    private String userAddress;

    private Date createTime;

    private String startTime;

    private String endTime;


}
