package per.cleanarchitecture

import org.springframework.beans.factory.config.BeanFactoryPostProcessor
import org.springframework.beans.factory.support.BeanDefinitionRegistry
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner
import org.springframework.core.type.classreading.MetadataReader
import org.springframework.core.type.filter.TypeFilter


@SpringBootApplication
class CleanArchitectureApplication {
    @Bean
    fun beanFactoryPostProcessor(beanRegistry: ApplicationContext) =
            BeanFactoryPostProcessor {
                val context = beanRegistry as AnnotationConfigServletWebServerApplicationContext
                val registry = context.beanFactory as BeanDefinitionRegistry
                genericApplicationContext(registry)
            }

    fun genericApplicationContext(beanRegistry: BeanDefinitionRegistry) {
        ClassPathBeanDefinitionScanner(beanRegistry).run {
            addIncludeFilter(removeModelAndEntitiesFilter())
            scan(
                    "per.cleanarchitecture.entities",
                    "per.cleanarchitecture.usecases",
                    "per.cleanarchitecture.adapters"
            )
        }
    }

    fun removeModelAndEntitiesFilter() = TypeFilter { mr, _ ->
        !classNameEndsWith(mr, "Model") && !classNameEndsWith(mr, "Movie")
    }

    private fun classNameEndsWith(mr: MetadataReader, s: String) =
            mr.classMetadata.className.endsWith(s)
}

fun main(args: Array<String>) {
    runApplication<CleanArchitectureApplication>(*args)
}
