package com.boot.ci.demo.controller;

/**
 * <B>主类名称：</B><BR>
 * <B>概要说明：</B><BR>
 *
 * @author steven.zhoulin
 * @date 2025年04月01日 13:33
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * <B>主类名称：</B><BR>
 * <B>概要说明：</B>框架专属，勿删！<BR>
 *
 * @author steven.zhoulin
 * @date 2024年12月31日 10:36
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @GetMapping("test")
    public String cache() {
        String uuid = UUID.randomUUID().toString();
        return uuid + "\n";
    }

}