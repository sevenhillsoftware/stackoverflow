package misc.stack.json;

import java.io.InputStream;
import java.util.List;

import junit.framework.Assert;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class Containerdata {
    public List<Containerdata.Node> d;

    public class Node {
        int intId;
        String strName;
        String strTitle;
        String strSummary;
        String strBody;
        String strUpdateDate;
        String strCreatedate;
    }
}

public class GsonTest {

    @Test
    public void testLoadContainerJSONusingGson() throws Exception {
        final InputStream stream = Thread.currentThread()
                .getContextClassLoader().getResourceAsStream("container.json");
        Assert.assertNotNull(stream);

        final String json = IOUtils.toString(stream);
        Assert.assertNotNull(json);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        Containerdata results = gson.fromJson(json, Containerdata.class);
        Assert.assertNotNull(results);
        System.out.println(results);
    }
}
