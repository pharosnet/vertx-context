package org.pharosnet.vertx.context;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject
public class Context {

    public Context(String id) {
        this.id = id;
        this.data = new JsonObject();
    }

    public Context(JsonObject jsonObject) {
        this.id = jsonObject.getString("id");
        this.data = jsonObject.getJsonObject("data", new JsonObject());
    }

    private final String id;
    private JsonObject data;

    public JsonObject toJson() {
        return new JsonObject()
                .put("id", this.id)
                .put("data", this.data);
    }

    public String getId() {
        return id;
    }

    public JsonObject getData() {
        return data;
    }

    public void setData(JsonObject data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return this.toJson().encode();
    }

}
