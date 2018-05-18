package com.directly.luckyboard.app;

import java.io.File;

/**
 * @author Xiao-Long Zhou
 * @date 2018/5/8 10:02
 */

public class Constants {

    /**
     * Path
     */
    private static final String PATH_DATA = DirectlyApplication.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    /**
     * 缓存目录
     */
    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

    /**
     * 数据库名称
     */
    static final String DB_NAME = "directly_android.db";



    /**
     * Shared Preference key
     */
    public static final String ACCOUNT = "account";

    public static final String PASSWORD = "password";

    public static final String LOGIN_STATUS = "login_status";

    public static final String AUTO_CACHE_STATE = "auto_cache_state";

    public static final String NO_IMAGE_STATE = "no_image_state";

    public static final String NIGHT_MODE_STATE = "night_mode_state";
}
