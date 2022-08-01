package com.board.service;

import java.util.List;
import java.util.Map;

import com.board.model.ArticleVO;

public interface BoardService {
	public List<ArticleVO> listArticles() throws Exception;

	public int addNewArticle(Map articleMap) throws Exception;

	public ArticleVO viewArticle(int articleNO) throws Exception;

	public void modArticle(Map<String, Object> articleMap);

	public void removeArticle(int articleNO) throws Exception;
}
