package be.yellowduck.springboot.rqueueexec.worker

import be.yellowduck.springboot.rqueueexec.model.Email
import com.github.sonus21.rqueue.annotation.RqueueListener
import org.springframework.stereotype.Component

@Component
class EmailWorker {

    @RqueueListener(value = ["\${email.queue.name}"])
    fun sendEmail(email: Email) {
        println("Processing Email: ${email}")
    }

}