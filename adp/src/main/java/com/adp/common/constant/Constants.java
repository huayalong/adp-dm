package com.adp.common.constant;

/**
 * 通用常量信息
 * 
 * @author adp
 */
public class Constants
{
    /**
     * UTF-8 字符集
     */
    public static final String UTF8 = "UTF-8";

    /**
     * GBK 字符集
     */
    public static final String GBK = "GBK";

    /**
     * 通用成功标识
     */
    public static final String SUCCESS = "0";

    /**
     * 通用失败标识
     */
    public static final String FAIL = "1";

    /**
     * 登录成功
     */
    public static final String LOGIN_SUCCESS = "Success";

    /**
     * 注销
     */
    public static final String LOGOUT = "Logout";

    /**
     * 注册
     */
    public static final String REGISTER = "Register";

    /**
     * 登录失败
     */
    public static final String LOGIN_FAIL = "Error";

    /**
     * 当前记录起始索引
     */
    public static final String PAGE_NUM = "pageNum";

    /**
     * 每页显示记录数
     */
    public static final String PAGE_SIZE = "pageSize";

    /**
     * 排序列
     */
    public static final String ORDER_BY_COLUMN = "orderByColumn";

    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    public static final String IS_ASC = "isAsc";

    /**
     * 参数管理 cache name
     */
    public static final String SYS_CONFIG_CACHE = "sys-config";

    /**
     * 参数管理 cache key
     */
    public static final String SYS_CONFIG_KEY = "sys_config:";

    /**
     * 字典管理 cache name
     */
    public static final String SYS_DICT_CACHE = "sys-dict";

    /**
     * 字典管理 cache key
     */
    public static final String SYS_DICT_KEY = "sys_dict:";

    /**
     * 资源映射路径 前缀
     */
    public static final String RESOURCE_PREFIX = "/profile";

    /**
     * 是,否
     */
	public static final String YES = "Y";
	public static final String NO = "N";
	
	
	/**
	 * 状态标识
	 */
	public static final String OPERATE_SUCCESS = "0"; // 成功	:0
	public static final String OPERATE_FAILED = "1"; // 失败	:1

	/**
	 * 是否展示
	 */
	public static final String SHOW = "0"; // 展示 : 0
	public static final String HIDE = "1"; // 隐藏 : 1

	/**
	 * 数据库类型
	 */
	public static final String OSCAR = "Oscar";		// 神通数据库
	public static final String DMDB = "Dm"; 		// 达梦数据库
	public static final String MYSQL = "MySql"; 	// MySQL数据库
	public static final String KINGBASE = "KingBase"; // 金仓数据库
	public static final String SQLSERVER = "SqlServer"; // SqlServer

	/**
	 * 算子类型
	 */
	public static final String EXTRACT = "extract"; // 抽取 
	public static final String TRANSFORM = "transform"; // 转换
	public static final String REMOVE_EMPTY = "remove_empty"; // 去空
	public static final String REMOVE_REPEAT = "remove_repeat"; // 去重
}
