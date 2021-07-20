/**
 * -------------------------------------------------------------*
 *                     COPYRIGHT(C) 2018                        *
 *   National Audit Office of the People’s Republic Of China    *
 *                                                              *
 *                                                              *
 *  This work contains confidential business information        *
 *  and intellectual property of CNAO.                          *
 *  All rights reserved.                                        *
 * -------------------------------------------------------------*
 */
package com.adp.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * Created by huayalong on 2018/11/14.
 */
public class JsonUitl {

	private static Gson mGson = new Gson();

	/**
	 * 将json字符串转化成实体对象
	 * 
	 * @param json
	 * @param classOfT
	 * @return
	 */
	public static Object stringToObject(String json, Class<?> classOfT) {
		return mGson.fromJson(json, classOfT);
	}

	/**
	 * 将对象准换为json字符串 或者 把list 转化成json
	 * 
	 * @param object
	 * @param <T>
	 * @return
	 */
	public static <T> String objectToString(T object) {
		return mGson.toJson(object);
	}

	/**
	 * 把json 字符串转化成list
	 * 
	 * @param json
	 * @param cls
	 * @param <T>
	 * @return
	 */
	public static <T> List<T> stringToList(String json, Class<T> cls) {
		Gson gson = new Gson();
		List<T> list = new ArrayList<T>();
		JsonArray array = new JsonParser().parse(json).getAsJsonArray();
		for (final JsonElement elem : array) {
			list.add(gson.fromJson(elem, cls));
		}
		return list;
	}
	
	/**
	 * 把json 字符串转化成list
	 * 
	 * @param json
	 * @param cls
	 * @param <T>
	 * @return
	 */
	public static <T> List<T> stringToList(String json, java.lang.reflect.Type type) {
		Gson gson = new Gson();
		List<T> list = new ArrayList<T>();
		JsonArray array = new JsonParser().parse(json).getAsJsonArray();
		for (final JsonElement elem : array) {
			list.add(gson.fromJson(elem, type));
		}
		return list;
	}

	/**
	 * 把对象转json
	 * 
	 * @return
	 */
	public static String ObjToJson(Object obj){
		Gson gson = new Gson(); 
		String json = gson.toJson(obj);
		return json;
	}
	
	
	/**
	 * 将json字符串转化成实体对象
	 * 
	 * @param json
	 * @param classOfT
	 * @return
	 */
	@SuppressWarnings("serial")
	public static HashMap<String,Object> stringToHashMap(String json) {
		return mGson.fromJson(StringEscapeUtils.unescapeHtml4(StringEscapeUtils.unescapeHtml4(json)), new TypeToken<HashMap<String,Object>>(){}.getType());
	}
	
	/**
	 * json格式化
	 * @param jsonString
	 * @return
	 */
	public static String jsonFormat(String jsonString) {
	    JSONObject object= JSONObject.parseObject(jsonString);
	    jsonString = JSON.toJSONString(object, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteDateUseDateFormat);
	    return jsonString;
	}
	
}