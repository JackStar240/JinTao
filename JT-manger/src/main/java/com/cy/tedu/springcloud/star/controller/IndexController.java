package com.cy.tedu.springcloud.star.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {
    /*实现通用的页面跳转功能:restful风格实现1:
	1.参数与参数之间使用/分隔
	2.参数使用{}形式包裹
	3.@PathVariable 实现数据的转化
	restful风格实现2:
	可以利用请求的类型,指定业务功能
	TYPE="GET" 查询业务
	TYPE="POST" 新增业务
	TYPE="PUT" 更新业务
	TYPE="DELETE" 删除业务
	总结1:如果需要获取url地址中的参数时,则可以使用restful风格
	总结2:可以按照类型执行特定的功能
	*/
    /*@RequestMapping("/page/{moduleName}")*/
    @GetMapping("/page/{moduleName}")/*指定该方法只能用于查询业务*/
    public String module(@PathVariable String moduleName) {

        return moduleName;
    }
}
