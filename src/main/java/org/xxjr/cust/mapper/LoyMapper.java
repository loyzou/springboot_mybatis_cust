package org.xxjr.cust.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.xxjr.common.context.AppParam;
import org.xxjr.common.context.AppResult;

@Mapper
public interface LoyMapper {
	
	/***
	 * 添加用户信息
	 * @param customerId
	 * @return
	 */
	public int addCustInfo(Map<String,Object> params);
	
	/***
	 * 根据用户Id查询用户信息
	 * @param customerId
	 * @return
	 */
	public Map<String,Object> queryCustInfo(int customerId);
	/***
	 * 查询用户列表
	 * @param customerId
	 * @return
	 */
	public List<Map<String,Object>> queryCustList(Map<String,Object> params);
	
	/***
	 * 分页用户列表
	 * @param customerId
	 * @return
	 */
	public AppResult queryCustListByPage(AppParam params);

}
