//package com.hunter.dt.business.user;
//
//import com.alibaba.fastjson.JSONObject;
//import com.hunter.dt.base.common.enumerate.SexEnum;
//import com.hunter.dt.base.common.response.PageResult;
//import com.hunter.dt.business.user.user.service.IUserService;
//import com.hunter.dt.business.user.user.service.domain.vo.UserSearchParamVo;
//import com.hunter.dt.business.user.user.service.domain.vo.UserVo;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class UserTest {
//
//    @Autowired
//    private IUserService userService;
//
//    @Test
//    public void addUser() {
//        UserVo userVo = new UserVo();
//        userVo.setAccount("HunterTest");
//        userVo.setNickName("韩涛测试");
//        userVo.setPassword("1234.abcd");
//        userVo.setSex(SexEnum.MAN);
//        userVo.setPhone("12344556677");
//        userVo.setEmail("1234@abcd.com");
//
//        UserVo result = userService.addUser(userVo);
//        System.out.println("addUser 测试结果：" + JSONObject.toJSONString(result));
//    }
//
//    @Test
//    public void findUserById() {
//        String id = "1372031089022369793";
//        UserVo result = userService.findUserById(id);
//        System.out.println("findUserById 测试结果：" + JSONObject.toJSONString(result));
//    }
//
//    @Test
//    public void findUserPageByParam() {
//        UserSearchParamVo paramVo = new UserSearchParamVo();
//        paramVo.setPageNo(1);
//        paramVo.setPageSize(5);
//        PageResult<UserVo> result = userService.findUserPageByParam(paramVo);
//        System.out.println("findUserPageByParam 测试结果：" + JSONObject.toJSONString(result));
//    }
//
//    @Test
//    public void delUserById() {
//        String id = "1372031089022369793";
//        UserVo result = userService.delUserById(id);
//        System.out.println("delUserById 测试结果" + JSONObject.toJSONString(result));
//    }
//
//
//}