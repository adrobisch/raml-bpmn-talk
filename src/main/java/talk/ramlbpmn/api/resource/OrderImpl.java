package talk.ramlbpmn.api.resource;

import brainslug.flow.context.BrainslugContext;
import brainslug.flow.context.ExecutionProperties;
import brainslug.flow.execution.DefaultExecutionProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import talk.ramlbpmn.process.MusicOrderFlow;

@Component
public class OrderImpl extends BaseResource implements Order {

  @Autowired
  BrainslugContext brainslugContext;

  @Override
  public PostOrderResponse postOrder(talk.ramlbpmn.api.model.Order order) throws Exception {
    ExecutionProperties properties = DefaultExecutionProperties
      .with(MusicOrderFlow.customerId.stringValue(), order.getCustomerId())
      .put(MusicOrderFlow.mediaFormat.stringValue(), order.getMediaFormat());

    brainslugContext.startFlow(MusicOrderFlow.musicOrderFlow, MusicOrderFlow.orderReceived, properties);
    return PostOrderResponse.withCreated();
  }
}
