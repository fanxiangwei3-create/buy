package org.buy.api;

import org.buy.api.OrderApi;
import org.jeecg.common.api.vo.Result;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class  OrderApiImpl implements OrderApi {



    @Override
    public Result<?> orderInfo(){
        return Result.ok();
    }
}
