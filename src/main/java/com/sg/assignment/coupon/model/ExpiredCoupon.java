package com.sg.assignment.coupon.model;

import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "만료 쿠폰 정보")
@Data
public class ExpiredCoupon {

	@ApiModelProperty(value = "쿠폰")
	private String coupon;

	@ApiModelProperty(value = "사용자 아이디")
	private String userId;

	@ApiModelProperty(value = "쿠폰 저장 Collection(MongoDB)")
	private String collection;

	@ApiModelProperty(value = "발급 날짜")
	private LocalDateTime issueDate;

	@ApiModelProperty(value = "만료 날짜")
	private LocalDateTime expireDate;
}
