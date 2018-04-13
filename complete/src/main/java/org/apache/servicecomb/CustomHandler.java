package org.apache.servicecomb;

import org.apache.servicecomb.core.Handler;
import org.apache.servicecomb.core.Invocation;
import org.apache.servicecomb.core.definition.MicroserviceMeta;
import org.apache.servicecomb.swagger.invocation.AsyncResponse;
import org.apache.servicecomb.swagger.invocation.InvocationType;

public class CustomHandler implements Handler {

  @Override
  public void init(MicroserviceMeta microserviceMeta, InvocationType invocationType) {
  }

  @Override
  public void handle(Invocation invocation, AsyncResponse asyncResponse) throws Exception {
    invocation.next(response -> {
      response.setResult("Hello Perfect World!");
      asyncResponse.handle(response);
    });
  }
}
