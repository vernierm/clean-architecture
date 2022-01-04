package per.cleanarchitecture.adapters

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "Movie")
data class MovieDataMapperModel(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int = 0,
        var name: String = "",
        var creationDate: LocalDateTime = LocalDateTime.now()
)