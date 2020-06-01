package com.example.demo.AdminController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Bean.BabyBean;

@Controller
public class AdminController {

	@Autowired
	AdminServiceInter as;
	@Autowired
	HttpSession session;

	/* ADMIN LOGIN START HERE */

	@RequestMapping("/admin")
	public void AdminPage(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		HttpSession session = request.getSession(false);

		if (session == null || session.getAttribute("adminlogin") == null) {

			request.getRequestDispatcher("adminvalid").include(request, response);
		} else {
			request.getRequestDispatcher("adddetails").forward(request, response);
		}

	}

	@RequestMapping("/adminlogin")
	public ModelAndView AdminLogin(@RequestParam("username") String username, @RequestParam("password") String password,
			Model m, HttpServletRequest request, HttpServletResponse response) throws IOException {

		if (username.equals("srinivas") && password.equals("admin123")) {

			HttpSession session = request.getSession();
			session.setAttribute("adminlogin", "true");
			session.setAttribute("username", username);
			m.addAttribute("sucess", username);
			return new ModelAndView("AddDetails");
		} else {
			System.out.println("error");
			m.addAttribute("error", "login unsucessfull");

		}
		return new ModelAndView("AdminLoginForm");
	}

	@RequestMapping("/adminvalid")
	public ModelAndView adminvalid(Model m) {

		return new ModelAndView("AdminLoginForm");

	}

	@RequestMapping("/logout")
	public ModelAndView Logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return new ModelAndView("logout");

	}

	/* ADMIN LOGIN ENDS HERE */

	/* ADD BABY NAMES METHODS START HERE */

	@RequestMapping(value = "/addbabyname")
	public ModelAndView Addbabyname(@RequestParam("name") String name, @RequestParam("meaning") String meaning,
			@RequestParam("sex") String sex, @RequestParam("religion") String religion, Model m,
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int i = as.Addbabyname(name, meaning, sex, religion);

		if (i > 0) {
			m.addAttribute("sucess", "insert baby name");

		}
		else
			
		{
			m.addAttribute("error", "not inserted baby name");
		}
		return new ModelAndView("AddBabyName");

	}

	@RequestMapping("/babynames")
	public void babynames(Model m, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("adminlogin") == null) {
			request.getRequestDispatcher("adminvalid").include(request, response);
		} else {
			request.getRequestDispatcher("addbaby").include(request, response);
		}
	}

	@RequestMapping("/addbaby")
	public ModelAndView addbaby(Model m) {

		return new ModelAndView("AddBabyName");

	}

	/* ADD BABY NAMES ENDS HERE */

	@RequestMapping("/adddetails")
	public ModelAndView AddDetails() {

		return new ModelAndView("AddDetails");

	}

	/* babydetails of babynames and datagrid part here */

	@RequestMapping("/viewnames")
	public ModelAndView viewbabynames(Model m, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		return new ModelAndView("ViewBabyNames");

	}

	@RequestMapping(value = "/babydetails", produces = "application/json")
	@ResponseBody
	public org.springframework.http.ResponseEntity<List<BabyBean>> babydetails(HttpServletRequest request,
			HttpServletResponse response, Model m, BabyBean bb) {

		List<BabyBean> list = as.babydetails(bb);
		
		
		

		return new org.springframework.http.ResponseEntity<List<BabyBean>>(list, HttpStatus.OK);
	}

	/* babydetails end here */

	@RequestMapping(value = "/deletebaby",produces = "application/json")
	@ResponseBody
	public ModelAndView deletebaby(@RequestParam("id") int id,Model m, HttpServletRequest request, HttpServletResponse response, BabyBean bb) throws ServletException, IOException {

		
		int i = as.deletebaby(bb, id);

		System.out.println(id);
		
		if (i > 0) {

			m.addAttribute("delete", "delete sucessfull");
		} 
		else {
			m.addAttribute("fail", "failed to delete");
		}
		
		return new ModelAndView("ViewBabyNames");
	}
}
