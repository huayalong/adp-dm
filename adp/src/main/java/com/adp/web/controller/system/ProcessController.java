package com.adp.web.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adp.common.core.controller.BaseController;

/**
 * 图片验证码（支持算术形式）
 * 
 * @author adp
 */
@Controller
@RequestMapping("/process")
public class ProcessController extends BaseController {

	/**
	 * 展示静态的流程图
	 */
	@GetMapping("/show")
	public String show() {
		return "process/index";
	}
}