package com.edu.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController
{
	@GetMapping("/notview")
	@ResponseBody
	public String main()
	{
		return "View 없이 컨트롤러에서 즉시 출력";
	}
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/boardList.do")
	public String BoardList()
	{
		return "boardList";
	}
	
	@GetMapping("/boardView.do")
	public String boardView()
	{
		return "boardView";
	}
	
	@GetMapping("/boardWrite.do")
	public String boardWrite()
	{
		return "boardWrite";
	}
	
	@GetMapping("/ajaxBoardList.do")
	public String ajaxBoardList()
	{
		return "ajaxBoardList";
	}
	
	@GetMapping("/ajaxBoardView.do")
	public String AjaxBoardView()
	{
		return "ajaxBoardView";
	}
}
