package com.nnstn.assistant.controller;


import com.nnstn.assistant.utils.FileUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping("/nnstn/mark")
public class MarkdownController {

    @Value("custom.base.rootpath")
	private String basepath;

	@RequestMapping("/{pathdata}")
	public Object date(@PathVariable("pathdata") String pathdata ){

		String path = MarkdownController.class.getResource("/data/"+pathdata+".json").getPath();
		String lunbo = FileUtil.fileToString(path);

		return JSONObject.parse(lunbo);
	}
}
