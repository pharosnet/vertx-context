package org.pharosnet.vertx.context;

import io.vertx.core.json.JsonObject;
import org.junit.jupiter.api.Test;

public class ContextTest {

    @Test
    public void mapping() {
        Context context = new Context("id");
        JsonObject jsonObject = context.toJson();
        System.out.println(jsonObject);
        context.getData().put("key", "value");
        context = new Context(jsonObject);
        System.out.println(context);
    }

}
