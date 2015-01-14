package talk.ramlbpmn.process.task;

import brainslug.flow.context.ExecutionContext;
import brainslug.flow.node.task.Task;
import org.springframework.stereotype.Component;

@Component
public class SendMp3 implements Task {
  @Override
  public void execute(ExecutionContext executionContext) {
    System.out.println("sending mp3");
  }
}
