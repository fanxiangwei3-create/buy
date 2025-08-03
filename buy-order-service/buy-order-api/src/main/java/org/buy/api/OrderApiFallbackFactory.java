package org.buy.api;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.handler.FeignErrorHandler;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;


/**
 * 博主动态接口的降级处理工厂类
 */
@Slf4j
@Component
public class OrderApiFallbackFactory implements FallbackFactory<OrderApi> {

    /**
     * 创建接口的降级实现
     *
     * @param cause 触发降级的异常原因
     * @return BloggerPostApi 的降级实现
     */
    @Override
    public OrderApi create(Throwable cause) {
        return new OrderApi() {

            @Override
            public Result<?> orderInfo() {
                return FeignErrorHandler.handle(cause);
            }
        };
    }
}
