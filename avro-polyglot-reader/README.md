# Avro topics polyglot reader

Can read and deserialize any Kafka topic
which contains messages in [Confluent wire format](https://docs.confluent.io/platform/current/schema-registry/fundamentals/serdes-develop/index.html#wire-format).  

Because of the `resetOffsets` setting (see `application.yaml` file)
on every app start consuming starts from the beginning of the topic regardless of the consuming group offset.

### Configuration

The app is configured through the `avro-polyglot-reader.yaml` file which should define following properties:
* `app.kafka.bootstrapServersList` (comma-separated)
* `app.kafka.schema.registry.url` - address of the Confluent Schema Registry
* `app.kafka.consumer.topic`
* `app.kafka.consumer.group`
