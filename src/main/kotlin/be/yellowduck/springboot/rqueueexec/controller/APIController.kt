package be.yellowduck.springboot.rqueueexec.controller

import be.yellowduck.springboot.rqueueexec.model.Email
import be.yellowduck.springboot.rqueueexec.model.Invoice
import com.github.sonus21.rqueue.core.RqueueMessageEnqueuer
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired

@RestController
class APIController(
    @Autowired val rqueueMessageEnqueuer: RqueueMessageEnqueuer,
    @Value("\${email.queue.name}") val emailQueueName: String,
    @Value("\${invoice.queue.name}") val invoiceQueueName: String,
    @Value("\${invoice.queue.delay}") val invoiceDelay: Long
) {

    @GetMapping("email")
    fun sendEmail(
        @RequestParam email: String?,
        @RequestParam subject: String?,
        @RequestParam content: String?
    ): String {
        println("Sending email")
        rqueueMessageEnqueuer.enqueue(emailQueueName, Email(email, subject, content))
        return "Please check your inbox!"
    }

    @GetMapping("invoice")
    fun generateInvoice(
        @RequestParam id: String?,
        @RequestParam type: String?
    ): String {
        println("Generate invoice")
        rqueueMessageEnqueuer.enqueueIn(invoiceQueueName, Invoice(id, type), invoiceDelay)
        return "Invoice would be generated in ${invoiceDelay} milliseconds"
    }

}
