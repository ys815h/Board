package main.notice;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class NoticeController {


	@Autowired
	NoticeServiceImpl nService;
	
	@RequestMapping("/portfolio/notice/index.do")
	public String index(NoticeVO param, Model model) {
		model.addAttribute("list", nService.alllist(param));
		return "/portfolio/notice/index";
	}
	
	@RequestMapping("/portfolio/notice/process.do")
	public String insert(Model model, NoticeVO param, 
						@RequestParam("file") MultipartFile filename) {
		if (!filename.isEmpty()) { // 사용자가 파일을 첨부했다
			// 파일명
			String org = filename.getOriginalFilename(); //원본
			String ext = org.substring(org.lastIndexOf("."));
			String real = System.currentTimeMillis()+ext; // 현재시간+ .까지의 파일명
			
			
//			File saveFile = new File(path)
			// 경로
			String path = "/upload/";
			// 파일저장
			try {
				filename.transferTo(new File(path+real));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			param.setFilename_org(org);
			param.setFilename_real(real);
		}
		int r = nService.insert(param);
		return "";
	}
	
}
