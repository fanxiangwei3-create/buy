package org.buy.api;

import io.swagger.annotations.ApiOperation;
import org.buy.enums.ApiConstants;
import org.jeecg.common.api.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = ApiConstants.NAME, contextId="order",fallbackFactory = OrderApiFallbackFactory.class)
public interface OrderApi {

    String PREFIX = "/rpc/order/";

    @GetMapping(PREFIX+"send")
    @ApiOperation("订单信息")
    Result<?> orderInfo();
}
