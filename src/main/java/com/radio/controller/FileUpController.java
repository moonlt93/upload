package com.radio.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.radio.service.FileUpService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/file")
@Log4j
public class FileUpController {
	
	@Setter(onMethod_=@Autowired)
	private FileUpService service;

	@GetMapping("/ex1")
	public void form() {
		
	}
	
	@PostMapping("/ex1")
	public String fileup(
			@RequestParam("name") String name, 
			//RequestParam 사용시 ("이름")  -> 파라미터로 받는 이름 , stirng name-> 실제 사용할 파라미터 변수
			@RequestParam("file") MultipartFile file) {
		
		log.info(name);
		log.info(file.getOriginalFilename());
		//파일정보 올라오는거 확인
		
		//service.write(file);
		
		return "/file/ex1";
	}
	
	
	
}










