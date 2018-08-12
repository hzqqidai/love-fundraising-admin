package love.fundraising.api;

import love.fundraising.service.SysUserService;
import love.fundraising.service.TokenService;
import love.fundraising.service.UserService;
import love.fundraising.utils.R;
import love.fundraising.utils.annotation.IgnoreAuth;
import love.fundraising.utils.validator.Assert;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * API登录授权
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-23 15:31
 */
@RestController
@RequestMapping("/api")
@Api("登录接口")
public class ApiLoginController {
    @Autowired
    private SysUserService userService;
    @Autowired
    private TokenService tokenService;

    /**
     * 登录
     */
    @IgnoreAuth
    @PostMapping("login")
    @ApiOperation(value = "登录",notes = "登录说明")
    @ApiImplicitParams({
        @ApiImplicitParam(paramType = "query", dataType="string", name = "username", value = "用户名", required = true),
        @ApiImplicitParam(paramType = "query", dataType="string", name = "password", value = "密码", required = true)
    })
    public R login(String username, String password){
        Assert.isBlank(username, "用户名不能为空");
        Assert.isBlank(password, "密码不能为空");

        //用户登录
        long userId = userService.login(username, password);

        //生成token
        Map<String, Object> map = tokenService.createToken(userId);

        return R.ok(map);
    }

}
