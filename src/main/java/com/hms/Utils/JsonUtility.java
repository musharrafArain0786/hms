package com.hms.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hms.mapper.UserTypeModel;
import com.hms.model.request.UserTypeRequest;
import org.json.JSONObject;

import static com.hms.enums.ResponseMessage.SUCCESS;
import static com.hms.enums.ResponseMessage.UNKNOWN_ERROR;

public class JsonUtility {

    private static final Gson GSON = new GsonBuilder().create();
    private static final GsonBuilder GSON_BUILDER = new GsonBuilder();

    public static <T> T convertJsonToEntity(UserTypeRequest request ,Class<T> className){
        return GSON.fromJson( GSON.toJson(request),className);
    }

    public static String success(String code, String description){
        JSONObject obj = new JSONObject();
        obj.put("code",code);
        obj.put("description",description);
        return obj.toString();
    }
    public static String success(Object classObj,String code, String description){
        JSONObject obj = new JSONObject();
        obj.put("code",code);
        obj.put("description",description);
        obj.put("data",classObj);
        return obj.toString();
    }
    public static String success(UserTypeModel classObj){
        JSONObject obj = new JSONObject();
        obj.put("userType",classObj);
        return obj.toString();
    }


    public static String failure(){
        JSONObject obj = new JSONObject();
        obj.put("code",UNKNOWN_ERROR.getCode());
        obj.put("description",UNKNOWN_ERROR.getMessage());
        return obj.toString();
    }
}
