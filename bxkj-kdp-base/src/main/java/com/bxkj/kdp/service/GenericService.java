package com.bxkj.kdp.service;

import java.util.List;

import com.bxkj.kdp.persistence.Domain;
import com.bxkj.kdp.persistence.GenericMapper;

public interface GenericService<E, T extends Domain, M extends GenericMapper<E, T>> {

	public long countByExample(E e);

	public int deleteByExample(E e);

	public int deleteByPrimaryKey(Long id);

	public int save(T t);

	public void saveList(List<T> list);

	public int saveSelective(T t);

	public List<T> selectByExampleWithBLOBs(E e);

	public List<T> selectByExample(E e);

	public T selectByPrimaryKey(Long id);

	public int updateByExampleSelective(T t, E e);

	public int updateByExampleWithBLOBs(T t, E e);

	public int updateByExample(T t, E e);

	public int updateByPrimaryKeySelective(T t);

	public int updateByPrimaryKeyWithBLOBs(T t);

	public int updateByPrimaryKey(T t);

	public List<T> getPageList(List<T> list, int currentPage, int maxNum, int pageNum);
}
