# Duplicator

Copies messages from one topic to another (possibly in another Kafka cluster).

Because of the `resetOffsets` setting (see `application.yaml` file)
on every app start consuming starts from the beginning of the topic regardless of the consuming group offset.

### Configuration

The app is configured through the `application-local.yaml` file which should define following properties:
* `app.kafka.bootstrapServersList` (comma-separated)
* `app.kafka.consumer.topic`
* `app.kafka.consumer.group`
* `app.kafka.producer.topic`
