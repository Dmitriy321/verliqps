package ru.verlioka.cmf.core.controllers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;

@Controller
@EnableTransactionManagement 
public class CodeGenerator
{	
	@RequestMapping(value = "/codegenerate", method = RequestMethod.GET)
	public String codegenerate()
	{			
		 Path path = Paths.get("C:", "tutorial/Java/JavaFX", "Topic.txt");

	        //convert path to File object
	        File path_to_file = path.toFile();
	        System.out.println("Path to file name: " + path_to_file.getName());
	        S
		MustacheFactory mf = new DefaultMustacheFactory();
		Mustache m = mf.compile("model.mustache");
		System.out.print(m);
		return "rad/codegenerate";
	}	
}

