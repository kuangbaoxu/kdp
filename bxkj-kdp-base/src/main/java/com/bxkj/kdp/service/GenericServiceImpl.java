package com.bxkj.kdp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bxkj.kdp.persistence.Domain;
import com.bxkj.kdp.persistence.GenericMapper;

public abstract class GenericServiceImpl<E, T extends Domain, M extends GenericMapper<E, T>>
		implements GenericService<E, T, M> {

	@Autowired
	private M m;

	
	@Override
	public long countByExample(E e){
		return m.countByExample(e);
	}
	@Override
	public int deleteByExample(E e){
		return m.deleteByExample(e);
	}
	@Override
	public int deleteByPrimaryKey(Long id){
		return m.deleteByPrimaryKey(id);
	}
	@Override
	public int save(T t){
		return m.insert(t);
	}
	@Override
	public void saveList(List<T> list){
		Date date = new Date();
		for (T t : list) {
			t.setCreatedStamp(date);
			t.setCreatedTxStamp(date);
			t.setLastUpdatedStamp(date);
			t.setLastUpdatedTxStamp(date);
			m.insert(t);
		}
	}
	@Override
	public int saveSelective(T t){
		return m.insertSelective(t);
	}
	@Override
	public List<T> selectByExampleWithBLOBs(E e){
		return m.selectByExampleWithBLOBs(e);
	}
	@Override
	public List<T> selectByExample(E e){
		return m.selectByExample(e);
	}
	@Override
	public T selectByPrimaryKey(Long id){
		return m.selectByPrimaryKey(id);
	}
	@Override
	public int updateByExampleSelective(T t, E e){
		return m.updateByExampleSelective(t, e);
	}
	@Override
	public int updateByExampleWithBLOBs(T t, E e){
		return m.updateByExampleWithBLOBs(t, e);
	}
	@Override
	public int updateByExample(T t, E e){
		return m.updateByExample(t, e);
	}
	
	@Override
	public int updateByPrimaryKeySelective(T t){
		return m.updateByPrimaryKeySelective(t);
	}
	@Override
	public int updateByPrimaryKeyWithBLOBs(T t){
		return m.updateByPrimaryKeyWithBLOBs(t);
	}
	@Override
	public int updateByPrimaryKey(T t){
		return m.updateByPrimaryKey(t);
	}


	/**
	 * 分页方法
	 * 
	 * @param list
	 *            源数据
	 * @param currentPage
	 *            当前页
	 * @param maxNum
	 *            每页显示几条
	 * @param pageNum
	 *            总页数
	 * @return
	 */
	public int getPageNum(int totalSize, int pageSize) {
		return totalSize % pageSize == 0 ? totalSize / pageSize : totalSize / pageSize + 1;
	}
	@Override
	public List<T> getPageList(List<T> list, int currentPage, int maxNum, int pageNum){

		int fromIndex = 0; // 从哪里开始截取
		int toIndex = 0; // 截取几个
		if (list == null || list.size() == 0)
			return new ArrayList<T>();
		// 当前页小于或等于总页数时执行
		if (currentPage <= pageNum && currentPage != 0) {
			fromIndex = (currentPage - 1) * maxNum;

			if (currentPage == pageNum) {
				toIndex = list.size();

			} else {
				toIndex = currentPage * maxNum;
			}

		}
		return list.subList(fromIndex, toIndex);
	}

}
