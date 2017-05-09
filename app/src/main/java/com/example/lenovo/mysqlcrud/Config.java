package com.example.lenovo.mysqlcrud;

/**
 * Created by Lenovo on 5/9/2017.
 */

public class Config {
    public static final String URL_ADD="http://www.evez.club/client/kalyana/addEmp.php";
    public static final String URL_GET_ALL = "http://www.evez.club/client/kalyana/getAllEmp.php";
    public static final String URL_GET_EMP = "http://www.evez.club/client/kalyana/getEmp.php";
    public static final String URL_UPDATE_EMP = "http://www.evez.club/client/kalyana/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://www.evez.club/client/kalyana/deleteEmp.php";

    //Keys that will be used to send the request to php scripts
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAME = "name";
    public static final String KEY_EMP_DESG = "desg";
    public static final String KEY_EMP_SAL = "salary";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_DESG = "desg";
    public static final String TAG_SAL = "salary";

    //employee id to pass with intent
    public static final String EMP_ID = "emp_id";
}
