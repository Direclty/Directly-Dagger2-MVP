package com.directly.luckyboard.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/16
 */

@Scope
@Retention(RUNTIME)
public @interface FragmentScope {
}
