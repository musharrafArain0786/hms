package com.hms.mapper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.modelmapper.ModelMapper;

public class EntityToModelMapper {

    private static final Gson GSON = new GsonBuilder().create();
    private static final GsonBuilder GSON_BUILDER = new GsonBuilder();
    private static final ModelMapper modelMapper = new ModelMapper();

//    public static <T> T UserTypeEntityToUserTypeModelMapper(Optional<UserType> userType, Class<T> className){
////        GSON_BUILDER.registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY);
//       // return GSON.toJson(userType,className);
//         UserType postDto = modelMapper.map(userType, UserType.class);
//        return postDto;
//    }
}
