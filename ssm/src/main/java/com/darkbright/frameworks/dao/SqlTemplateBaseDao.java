package com.darkbright.frameworks.dao;

public interface SqlTemplateBaseDao {

/**
 * 保存对象
 *
 * @param str sqltemplate类型
 * @param obj
 * @return Object
 * @throws Exception
 */
Object save(String str, Object obj) throws Exception;

/**
 * 修改对象
 *
 * @param str sqltemplate类型
 * @param obj
 * @return Object
 * @throws Exception
 */
Object update(String str, Object obj) throws Exception;

/**
 * 删除对象
 *
 * @param str sqltemplate类型
 * @param obj
 * @return
 * @throws Exception
 */
Object delete(String str, Object obj) throws Exception;

/**
 * 查找对象
 *
 * @param str sqltemplate类型
 * @param obj
 * @return
 * @throws Exception
 */
Object findForObject(String str, Object obj) throws Exception;

/**
 * 查找对象
 *
 * @param str sqltemplate类型
 * @param obj
 * @return
 * @throws Exception
 */
Object findForList(String str, Object obj) throws Exception;

/**
 * 查找对象封装成Map
 *
 * @param sql sqltemplate类型
 * @param obj
 * @return
 * @throws Exception
 */
Object findForMap(String sql, Object obj, String key, String value) throws Exception;

}
