import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.configuration.RunConfiguration

import java.lang.reflect.Method
import java.net.URLClassLoader

class ForceJacksonJar {
    @BeforeTestSuite
    def forceJacksonJar() {
        try {
            File jarFile = new File(RunConfiguration.getProjectDir() + "/Drivers/jackson-core-2.15.3.jar")
            if (jarFile.exists()) {
                URL jarUrl = jarFile.toURI().toURL()
                URLClassLoader classLoader = (URLClassLoader) this.getClass().getClassLoader()
                Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class)
                method.setAccessible(true)
                method.invoke(classLoader, jarUrl)
                println("[INFO] jackson-core-2.15.3.jar carregado com sucesso no classpath.")
            } else {
                println("[WARNING] jackson-core-2.15.3.jar não encontrado na pasta Drivers.")
            }
        } catch (Exception e) {
            println("[ERROR] Falha ao carregar jackson-core-2.15.3.jar: " + e.message)
        }
    }
}
