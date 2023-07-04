Sample project to demonstrate Spring Cloud Stream Kafka binder facilities.

It copies messages from one topic to another (possibly in another Kafka cluster).

### Configuration

The project is configured through the `application-local.yaml` file which should define following properties:
* `app.kafka.bootstrapServersList` (comma-separated)
* `app.kafka.consumer.topic`
* `app.kafka.consumer.group`
* `app.kafka.producer.topic`
