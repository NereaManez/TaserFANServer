package es.ieslavereda.Server.Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ieslavereda.Server.Model.entity.Result;
import spark.ResponseTransformer;

import java.lang.reflect.Type;

public class JsonTransformer<T> implements ResponseTransformer {
    private Gson gson = new GsonBuilder().setDateFormat("dd-MM-yyyy").create();

    @Override
    public String render(Object model) {
        return gson.toJson(model);
    }
    public T getObject(String json, Class<T> tClass) {
        return gson.fromJson(json, tClass);
    }
    public Result.Success<T> fromJSonToSuccess(String json, Class<T> myType) {
        Type dinamicType = TypeToken.getParameterized(Result.Success.class, myType).getType();
        return gson.fromJson(json, dinamicType);
    }
    public Result.Error getError(String json){
        return gson.fromJson(json, Result.Error.class);
    }
}
