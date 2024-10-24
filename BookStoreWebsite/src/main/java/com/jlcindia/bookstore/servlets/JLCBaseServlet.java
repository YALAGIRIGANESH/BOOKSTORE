package com.jlcindia.bookstore.servlets; 

import javax.servlet.http.HttpServlet;

import com.jlcindia.bookstore.controllers.ChangePWController;
import com.jlcindia.bookstore.controllers.ForgotPWController;
import com.jlcindia.bookstore.controllers.LoginController;
import com.jlcindia.bookstore.controllers.LogoutController;
import com.jlcindia.bookstore.controllers.RegisterController;
import com.jlcindia.bookstore.controllers.UpdateProfileController;
import com.jlcindia.bookstore.service.UserServiceImpl;

public abstract class JLCBaseServlet extends HttpServlet {
static LoginController loginController;
static RegisterController registerController;
static ChangePWController changePWController;
static ForgotPWController forgotPWController;
static UpdateProfileController updateProfileController;
static LogoutController logoutController;
static UserServiceImpl userService=new UserServiceImpl();
static {
loginController = new LoginController();
registerController = new RegisterController();
changePWController = new ChangePWController();
forgotPWController = new ForgotPWController();
updateProfileController = new UpdateProfileController();
logoutController = new LogoutController();
}
}
