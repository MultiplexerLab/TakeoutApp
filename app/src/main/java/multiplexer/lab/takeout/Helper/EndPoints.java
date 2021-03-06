package multiplexer.lab.takeout.Helper;


public class EndPoints {

    public static final String BASE_URL = "http://api.bdtakeout.com/";
    public static final String SIGNUP_URL = BASE_URL+"api/account/register";
    public static final String SIGNIN_URL = BASE_URL+"token";
    public static final String GET_POINT_URL = BASE_URL+"api/invoice/getPoints";
    public static final String GET_PROFILE_DATA = BASE_URL+"api/account/GetCustomerInfo";
    public static final String GET_ADS_DATA = BASE_URL+"api/add";
    public static final String GET_STORE_DATA = BASE_URL+"api/storelocator/getall/";
    public static final String GET_COUNTRY_DATA = BASE_URL+"api/country/getAll";
    public static final String GET_CATEGORY_DATA = BASE_URL+"api/menu/Catagory";
    public static final String GET_PRODUCT_DATA = BASE_URL+"api/menu/Finished/";
    public static final String POST_PRODUCT_RATING = BASE_URL+ "api/menu/rate";
    public static final String GET_USE_COUPON= BASE_URL+ "api/invoice/useinvoice/";
    public static final String GET_CHECK_REFERENCE= BASE_URL+ "api/referral/checkRef";
    public static final String GET_USE_REFERRAL= BASE_URL+ "api/referral/userReferral/";
    public static final String FORGOT_PASSWORD= BASE_URL+ "api/account/ForgetPassword";
}
