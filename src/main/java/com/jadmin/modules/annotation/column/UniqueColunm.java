package com.jadmin.modules.annotation.column;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 
 * @Title:web框架
 * @Description:声明该注解之后，该列的值在数据库中唯一 
 * @Copyright:JAdmin (c) 2018年08月21日
 * 
 * @author:-jiujiya
 * @version:1.0 
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueColunm{
	
}
