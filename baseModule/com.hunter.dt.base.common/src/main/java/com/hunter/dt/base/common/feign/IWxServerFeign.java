package com.hunter.dt.base.common.feign;

import com.hunter.dt.base.common.cons.WxConstants;
import com.hunter.dt.base.common.vo.wechat.WeChatUserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Hunter
 * @date 2020/10/6
 */
@FeignClient(value = "WX-SERVER", url = WxConstants.WX_URI_HOST_NAME)
public interface IWxServerFeign {

    @GetMapping(value = "/sns/jscode2session")
    WeChatUserVo jscode2session(@RequestParam("appid") String appId,
                                @RequestParam("secret") String secret,
                                @RequestParam("js_code") String jsCode,
                                @RequestParam("grant_type") String grantType);

}
