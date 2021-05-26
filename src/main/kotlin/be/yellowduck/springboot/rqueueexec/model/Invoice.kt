package be.yellowduck.springboot.rqueueexec.model

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
data class Invoice (
    val id: String? = null,
    val type: String? = null
)
