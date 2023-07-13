package energister.springcloudstreamkafkasamples.messagesduplicator

import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.Message
import org.springframework.stereotype.Service

@Service
class TopicConsumer(private val producer: Producer) {
    fun handle(cloudMessage: Message<ByteArray>) {
        val messageKey = cloudMessage.headers.get(KafkaHeaders.RECEIVED_KEY, ByteArray::class.java)!!
        val message = cloudMessage.payload
        producer.send(messageKey, message)
    }
}
