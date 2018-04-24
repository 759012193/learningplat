package com.dreamfish.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dreamfish.domain.User;
import com.dreamfish.vo.Menu;

/**
 * 用户控制器.
 * 
 * @author <a href="https://waylau.com">Way Lau</a>
 * @date 2017年2月26日
 */
@Controller
@RequestMapping("/admins")
public class AdminController {
	@Autowired
	private UserDetailsService userDetailsService;
	/**
	 * 获取后台管理主页面
	 * @return
	 */
	@GetMapping("/{username}")
	public ModelAndView listUsers(@PathVariable("username") String username ,Model model) {
		User  user = (User)userDetailsService.loadUserByUsername(username);
		model.addAttribute("user", user);
		List<Menu> list = new ArrayList<>();
		list.add(new Menu("用户管理", "/users"));
		list.add(new Menu("模块管理", "/catalogs"));
		model.addAttribute("list", list);
		return new ModelAndView("/admins/index", "model", model);
	}
 
	 
}
