package com.hms.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hms.enums.HibernateProxyTypeAdapter;
import com.hms.model.request.UserTypeRequest;
import org.json.JSONObject;

import static com.hms.enums.ResponseMessge.ADD_SUCCESS;
import static com.hms.enums.ResponseMessge.UNKNOWN_ERROR;

public class JsonUtility {

    private static final Gson GSON = new GsonBuilder().create();
    private static final GsonBuilder GSON_BUILDER = new GsonBuilder();

    public static <T> T convertJsonToEntity(UserTypeRequest request ,Class<T> className){
//        GSON_BUILDER.registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY)
        return GSON.fromJson( GSON.toJson(request),className);
    }

    public static String success(){
        JSONObject obj = new JSONObject();
        obj.put("code",ADD_SUCCESS.getCode());
        obj.put("description",ADD_SUCCESS.getMessage());
        return obj.toString();
    }

    public static String failure(){
        JSONObject obj = new JSONObject();
        obj.put("code",UNKNOWN_ERROR.getCode());
        obj.put("description",UNKNOWN_ERROR.getMessage());
        return obj.toString();
    }
}
