package be.yellowduck.springboot.rqueueexec

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
data class Email(
    val email: String? = null,
    val subject: String? = null,
    val content: String? = null
)