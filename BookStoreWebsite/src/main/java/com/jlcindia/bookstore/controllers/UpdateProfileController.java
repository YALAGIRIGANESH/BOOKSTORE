package com.jlcindia.bookstore.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jlcindia.bookstore.service.UserServiceImpl;
import com.jlcindia.bookstore.to.UserTO;

public class UpdateProfileController extends JLCBaseController {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("UpdateProfileController-process()");
		String page = "";
		String userId = req.getParameter("userId");
		String fullName = req.getParameter("fullName");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String username = req.getParameter("username");
		UserTO userTO = new UserTO();
		userTO.setUserId(Integer.parseInt(userId));
		userTO.setFullName(fullName);
		userTO.setEmail(email);
		userTO.setPhone(Long.parseLong(phone));
		userTO.setUsername(username);
		UserServiceImpl userService=new UserServiceImpl();
		int updateStatus =userService.updateProfile(userTO);
		if (updateStatus==1) {
			page = "updateProfileStatus.jsp";
			String upMsg = "Your Profile is updated Successfully";
			req.setAttribute("UpdateMsg", upMsg);
		} else {
			page = "updateProfile.jsp";
			String upMsg = "Something Wrong, Try again";
			req.setAttribute("UpdateMsg", upMsg);
		}
		return page;
	}
}