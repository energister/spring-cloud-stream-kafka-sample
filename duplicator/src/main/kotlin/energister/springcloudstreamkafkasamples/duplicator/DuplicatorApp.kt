package energister.springcloudstreamkafkasamples.duplicator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.messaging.Message
import java.util.function.Consumer

fun main(args: Array<String>) {
    runApplication<DuplicatorApp>(*args)
}

@SpringBootApplication
class DuplicatorApp {
    @Bean(name = ["inConsumer"])
    fun consumer(consumer: TopicConsumer): Consumer<Message<ByteArray>> {
        return Consumer { consumer.handle(it) }
    }
}
