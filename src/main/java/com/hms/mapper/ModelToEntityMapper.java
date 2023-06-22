package com.hms.mapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hms.entity.UserType;
import com.hms.model.request.BloodRequest;
import com.hms.model.request.EmployeeTypeRequest;
import com.hms.model.request.SpecializationRequest;
import com.hms.model.request.UserTypeRequest;

public class ModelToEntityMapper {
    private static final Gson GSON = new GsonBuilder().create();
    private static final GsonBuilder GSON_BUILDER = new GsonBuilder();

    public static <T> T convertUserTypeRequestToEntity(UserTypeRequest request , Class<T> className){
        return GSON.fromJson( GSON.toJson(request),className);
    }

    public static <T> T convertBloodRequestToEntity(BloodRequest request, Class<T> className){
        return GSON.fromJson(GSON.toJson(request),className);
    }

    public static <T> T convertEmployeeTypeRequestToEntity(EmployeeTypeRequest request,Class<T> className){
        return GSON.fromJson(GSON.toJson(request),className);
    }

    public static <T> T convertSpecializationRequestToEntity(SpecializationRequest request, Class<T> className){
        return GSON.fromJson(GSON.toJson(request),className);
    }

    //        GSON_BUILDER.registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY)
}
