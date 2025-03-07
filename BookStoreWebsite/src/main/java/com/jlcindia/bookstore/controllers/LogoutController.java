package com.jlcindia.bookstore.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController extends JLCBaseController {
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("LogoutController-process()");
		String page = "login.jsp";
		HttpSession session = req.getSession(false);
		if (session != null) {
			session.invalidate();
		}
		String logoutMsg = "You have logged out Successfully";
		req.setAttribute("LogoutMsg", logoutMsg);
		return page;
	}
}