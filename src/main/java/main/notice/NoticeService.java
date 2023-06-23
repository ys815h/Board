package main.notice;

import java.util.List;

public interface NoticeService {
	
	List<NoticeVO> alllist(NoticeVO vo);
	int insert(NoticeVO vo);
}
