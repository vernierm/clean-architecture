package per.cleanarchitecture.adapters

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "Movie")
data class MovieDataMapper(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int,
        var name: String,
        var creationDate: LocalDateTime
)