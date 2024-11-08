package org.lambda.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<String,String> {

    @Override
    public String handleRequest(String input, Context context) {
        context.getLogger().log("... RH..." + input);
        return input;
    }
}
