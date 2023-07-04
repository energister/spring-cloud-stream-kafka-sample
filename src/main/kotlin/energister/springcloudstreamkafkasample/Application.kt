package energister.springcloudstreamkafkasample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.messaging.Message
import java.util.function.Consumer

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}

@SpringBootApplication
class Application {

    @Bean(name = ["inConsumer"])
    fun consumer(): Consumer<Message<ByteArray>> {
        return Consumer { process(it) }
    }

    private fun process(cloudMessage: Message<ByteArray>) {
        println(cloudMessage)
    }
}
