package main.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	NoticeMapper nMapper;
	
	@Override
	public List<NoticeVO> alllist(NoticeVO vo) {
		
		Map map = new HashMap();
		map.put("list", nMapper.list(vo));
		return nMapper.list(vo);
	}
	
	@Override
	public int insert(NoticeVO vo) {
		int r = nMapper.insert(vo);
		
//		if(r/* > 0) {
//			
//		}*/
		return r;
	}
	
}
