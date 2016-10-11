package com.bxkj.kdp.common;

public interface CommonConstants {
	
	/**
	 * 密码
	 */
	public static final String DIGEST_ALG = "SHA1";

	/**
	 * 系统默认管理员
	 */
	public static final String ADMIN_TYPE = "0";
	
	/**
	 * 普通用户
	 */
	public static final String USER_TYPE = "1";
	
	/**
	 * 工程师
	 */
	public static final String ENGINEER_TYPE = "2";
	
	/**
	 * 经理
	 */
	public static final String MANAGER_TYPE = "3";
	
	/**
	 * 提出
	 */
    public static final Integer APPLYING = 1;
    
    /**
	 * 待处理
	 */
    public static final Integer WAIT_PROCESSING = 2;
    
    /**
     * 维护中
     */
    public static final Integer MAINTENANCE = 3;
    
    /**
     * 挂起
     */
    public static final Integer HANG_UP = 4;
    
    /**
     * 维护完成
     */
    public static final Integer FINISH = 5;

    /**
     * 100000000 用户角色
     */
    public static final Integer USER_ROLE = 100000000;
    /**
     * 100000001 工单状态
     */
    public static final Integer ORDER_STATUS = 100000001;
    /**
     * 100000002 部门类型
     */
    public static final Integer DEPT_TYPE = 100000002;
    /**
     * 100000003 申请服务类型
     */
    public static final Integer APPLY_SERVICE = 100000003;
    /**
     * 100000004 FAQ日志类型
     */
    public static final Integer FAQ_TYPE = 100000004;
    /**
     * 100000005 退回理由
     */
    public static final Integer RETURN_REASON_TYPE = 100000005;
    
    /**
     * 100000006 常见问题类型
     */
    public static final Integer PROBLEM_TYPE = 100000006;
    
    public static final String KEY_USER_ID = "key_user_id";
    public static final String KEY_USER_NAME = "key_user_name";
    public static final String KEY_USER_DEPT = "key_user_dept";
    public static final String KEY_USER_TYPE = "key_user_type";
    
    /**
     * 返回标志位
     */
    public static final int RETURN_OK = 1;
    public static final int RETURN_FAIL = 0;
    
}
