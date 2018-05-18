package com.directly.luckyboard.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/16
 */

@Qualifier
@Documented
@Retention(RUNTIME)
public @interface DirectlyAndroidUrl {
}
