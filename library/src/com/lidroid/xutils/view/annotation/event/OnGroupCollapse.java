/*
 * Copyright (c) 2013. wyouflf (wyouflf@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lidroid.xutils.view.annotation.event;

import android.widget.ExpandableListView;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 二级列表的子节点折叠监听事件注解
 * 
 * <pre>
 * Author: wyouflf
 * Date: 13-8-16
 * Time: 下午2:27
 * </pre>
 * 
 * @author wyouflf
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@EventBase(
        listenerType = ExpandableListView.OnGroupCollapseListener.class,
        listenerSetter = "setOnGroupCollapseListener",
        methodName = "onGroupCollapse")
public @interface OnGroupCollapse {
    
    /**
     * 要绑定事件的控件ID
     * @return 控件ID
     */
    int[] value();

    /**
     * 所属父控件的ID
     * @return 控件ID
     */
    int[] parentId() default 0;
    
}
