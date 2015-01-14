package talk.ramlbpmn.process;

import brainslug.flow.FlowBuilder;
import brainslug.flow.Identifier;
import brainslug.flow.node.TaskDefinition;
import brainslug.util.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import talk.ramlbpmn.api.model.Order;
import talk.ramlbpmn.process.task.SendConfirmation;
import talk.ramlbpmn.process.task.SendMp3;
import talk.ramlbpmn.process.task.SendVinyl;

@Component
public class MusicOrderFlow extends FlowBuilder {

  @Autowired
  SendConfirmation sendConfirmation;

  @Autowired
  SendMp3 sendMp3;

  @Autowired
  SendVinyl sendVinyl;

  public static Identifier orderReceived = IdUtil.id("orderReceived");
  public static Identifier musicOrderFlow = IdUtil.id("musicOrderFlow");

  public static Identifier mediaFormat = IdUtil.id("mediaFormat");
  public static Identifier customerId = IdUtil.id("customerId");

  @Override
  public void define() {
    flowId(musicOrderFlow);

    TaskDefinition sendConfirmationTask = task(id("sendConfirmation"), sendConfirmation).display("Send Confirmation");
    TaskDefinition sendVinylTask = task(id("sendVinyl"), sendVinyl).display("Send Vinyl");
    TaskDefinition sendMp3Task = task(id("sendMp3"), sendMp3).display("Send Mp3");

    start(event(orderReceived).display("Order Received"))
      .execute(sendConfirmationTask)

      .choice(id("whichMediaType"))
        .when( eq(property(mediaFormat), Order.MediaFormat.MP_3) ).then().execute(sendMp3Task)
          .or()
        .when( eq(property(mediaFormat), Order.MediaFormat.VINYL) ).then().execute(sendVinylTask);

    merge(id("sendTasks"), sendVinylTask.getId(), sendMp3Task.getId())
        .end(event(id("orderCompleted")).display("Order Completed"));
  }
}
