package be.yellowduck.springboot.rqueueexec.worker

import be.yellowduck.springboot.rqueueexec.model.Invoice
import com.github.sonus21.rqueue.annotation.RqueueListener
import org.springframework.stereotype.Component

@Component
class InvoiceWorker {

    @RqueueListener(value = ["\${invoice.queue.name}"])
    fun generateInvoice(invoice: Invoice) {
        println("Generating Invoice: ${invoice}")
    }

}
