package be.yellowduck.springboot.rqueueexec

import com.github.sonus21.rqueue.annotation.RqueueListener
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Component

@Component
@Slf4j
class MessageListener {

    @RqueueListener(value = ["\${email.queue.name}"])
    fun sendEmail(email: Email) {
        println("Processing Email: ${email}")
    }

    @RqueueListener(value = ["\${invoice.queue.name}"])
    fun generateInvoice(invoice: Invoice) {
        println("Generating Invoice: ${invoice}")
    }

}
