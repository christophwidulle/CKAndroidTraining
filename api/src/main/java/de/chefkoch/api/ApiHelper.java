package de.chefkoch.api;


public class ApiHelper {
    public static final String URL_RECIPE_IMAGES = "/recipes/RECIPEID/images";
    public static final String URL_RECIPE_IMAGE = "/recipes/RECIPEID/images/IMAGEID/FORMAT";
    public static final int FILTER_ORDER_BY_NONE = 0;
    public static final int FILTER_ORDER_BY_TITLE = 1;
    public static final int FILTER_ORDER_BY_RELEVANCE = 2;
    public static final int FILTER_ORDER_BY_RATING = 3;
    public static final int FILTER_ORDER_BY_DIFFICULTY = 4;
    public static final int FILTER_ORDER_BY_PREPARATION_TIME = 5;
    public static final int FILTER_ORDER_BY_PUBLISH_DATE = 6;
    public static final int FILTER_ORDER_BY_RANDOM = 7;
    public static final int FILTER_ORDER_BY_RANDOM_DAILY = 8;
    public static final int FILTER_RECIPE_IMAGES_ORDER_BY_MODIFIED = 1;
    public static final int FILTER_RECIPE_IMAGES_ORDER_BY_RATING = 2;
    public static final int FILTER_RECIPE_COMMENTS_ORDER_BY_DEFAULT = 1;
    public static final int FILTER_RECIPE_COMMENTS_ORDER_BY_CREATED_AT = 2;
    public static final int FILTER_ORDER_DESC = 0;
    public static final int FILTER_ORDER_ASC = 1;
    public static final String IMAGE_FORMAT_ORG = "org";
    public static final String IMAGE_FORMAT_100 = "100";
    public static final String IMAGE_FORMAT_170 = "170";
    public static final String IMAGE_FORMAT_500 = "500";
    public static final String IMAGE_FORMAT_CROP_70X50 = "crop-70x50";
    public static final String IMAGE_FORMAT_CROP_100X75 = "crop-100x75";
    public static final String IMAGE_FORMAT_CROP_112X74 = "crop-112x74";
    public static final String IMAGE_FORMAT_CROP_115X82 = "crop-115x82";
    public static final String IMAGE_FORMAT_CROP_168X111 = "crop-168x111";
    public static final String IMAGE_FORMAT_CROP_170X150 = "crop-170x150";
    public static final String IMAGE_FORMAT_CROP_224X148 = "crop-224x148";
    public static final String IMAGE_FORMAT_CROP_360X240 = "crop-360x240-lq";
    public static final String IMAGE_FORMAT_CROP_420x280 = "crop-420x280-lq";
    public static final String IMAGE_FORMAT_FIT_960X720 = "fit-960x720-lq";
    public static final String VIDEO_IMAGE_FORMAT_SMALL = "small";
    public static final String VIDEO_IMAGE_FORMAT_BIG = "big";
    public static final String VIDEO_IMAGE_FORMAT_THUMB = "thumb";
    public static final String VIDEO_IMAGE_FORMAT_ORG = "org";
    public static final String AVATAR_FORMAT_ORG = "org";
    public static final String AVATAR_FORMAT_65 = "65";
    public static final String AVATAR_FORMAT_200 = "200";
    public static final String AVATAR_FORMAT_CROP_60X60 = "crop-60x60";
    public static final String AVATAR_FORMAT_CROP_80X80 = "crop-80x80";
    public static final String AVATAR_FORMAT_CROP_120X120 = "crop-120x120";
    public static final String API_TOKEN_HEADER_NAME = "X-Chefkoch-Api-Token";

    public static final String RECIPE_IMAGE_MIME_TYPE = "image/jpeg";
    public static String URL_BASE = "https://api.chefkoch.de/v2";
    public static String URL_BASE_VIDEO_CDN = "http://video.chefkoch-cdn.de/ck.de/videos/";
    //public static String URL_VIDEO_PREROLL = "https://pubads.g.doubleclick.net/gampad/ads?sz=480x360&iu=/6032/ck_ip&impl=s&gdfp_req=1&env=vp&output=xml_vast2&unviewed_position_start=1&url=[referrer_url]&description_url=[description_url]&correlator=[timestamp]";

    public static String getRecipeImageUrl(final String recipeId) {
        return (URL_BASE + URL_RECIPE_IMAGES.replace("RECIPEID", recipeId));
    }

    public static String getRecipeImageUrl(final String recipeId, final String recipeImageId, final String format) {
        return (URL_BASE + URL_RECIPE_IMAGE.replace("RECIPEID", recipeId).replace("IMAGEID", recipeImageId).replace("FORMAT", format));
    }


}
