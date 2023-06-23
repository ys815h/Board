package main.notice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {
	List<NoticeVO> list(NoticeVO vo);
	int insert(NoticeVO vo);
	
}
