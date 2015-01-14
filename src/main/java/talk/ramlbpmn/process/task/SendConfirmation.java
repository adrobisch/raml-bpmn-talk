package talk.ramlbpmn.process.task;

import brainslug.flow.context.ExecutionContext;
import brainslug.flow.node.task.Task;
import org.springframework.stereotype.Component;
import talk.ramlbpmn.process.MusicOrderFlow;

@Component
public class SendConfirmation implements Task {
  @Override
  public void execute(ExecutionContext executionContext) {
    System.out.println("sending confirmation to customer: " + executionContext.property(MusicOrderFlow.customerId, String.class));
  }
}
