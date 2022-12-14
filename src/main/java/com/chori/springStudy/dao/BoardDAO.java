package com.chori.springStudy.dao;

import java.util.List;

import com.chori.springStudy.model.BoardVO;

public interface BoardDAO {

    public List<BoardVO> getBoardList() throws Exception;

    public BoardVO getBoardContent(int bid) throws Exception;
    public BoardVO detailBoard(int bid) throws Exception;


    public int insertBoard(BoardVO boardVO) throws Exception;

    public int updateBoard(BoardVO boardVO) throws Exception;

    public int deleteBoard(int bid) throws Exception;

    public int updateViewCnt(int bid) throws Exception;
}