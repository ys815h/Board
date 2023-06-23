package main.notice;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class NoticeVO {
	
	private int no;
	private String title;
	private String content;
	private Timestamp regdate;
	private String filename_org;	// 원본
	private String filename_real;	// 실제 파일명
	private int viewcount;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(regdate);
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	public String getFilename_org() {
		return filename_org;
	}
	public void setFilename_org(String filename_org) {
		this.filename_org = filename_org;
	}
	public String getFilename_real() {
		return filename_real;
	}
	public void setFilename_real(String filename_real) {
		this.filename_real = filename_real;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	
	
	
	
}
