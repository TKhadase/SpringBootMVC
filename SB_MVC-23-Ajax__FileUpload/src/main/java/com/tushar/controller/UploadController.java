package com.tushar.controller;

import java.io.File;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	@Autowired
	private Environment env;
	
	  @GetMapping("/home")
	  public String uploader() {
		  System.out.println("UploadController.uploader()");
	    return "upload";
	  }
	  
	  @PostMapping("/uploadConfirm")
	  public String uploadConfirm(@RequestParam("file") MultipartFile file) {
		  System.out.println("UploadController.uploadConfirm()");
	    return "upload";
	  }
	  
	  @PostMapping("/upload") 
	  public ResponseEntity<?>  FileUpload( @RequestParam("file") MultipartFile file ) {
		  System.out.println("UploadController.FileUpload()");
		  String fileName = file.getOriginalFilename();
		  String uploadPath = env.getProperty("file.upload.path");
		  try {
			file.transferTo( new File(uploadPath + fileName));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		} 
		  return new ResponseEntity("Successfully uploaded - " +  fileName ,HttpStatus.OK);
	  }

}