package com.board.dao;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.board.model.ArticleVO;

public interface BoardDAO {
	public List selectAllArticlesList() throws DataAccessException;

	public int insertNewArticle(Map articleMap);

	public ArticleVO selectArticle(int articleNO);
	
	public void updateArticle(Map articleMap);

	public void deleteArticle(int articleNO);
}
