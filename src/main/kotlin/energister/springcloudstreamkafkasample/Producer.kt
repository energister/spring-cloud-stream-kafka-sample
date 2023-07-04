package energister.springcloudstreamkafkasample

import org.springframework.cloud.stream.function.StreamBridge
import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.support.MessageBuilder
import org.springframework.stereotype.Service

private const val BINDING_NAME = "producer-out-0"

@Service
class Producer(private val streamBridge: StreamBridge) {
    fun send(key: ByteArray, value: ByteArray) {
        val cloudMessage = MessageBuilder
            .withPayload(value)
            .setHeader(KafkaHeaders.KEY, key)
            .build()
        streamBridge.send(BINDING_NAME, cloudMessage)
    }
}
