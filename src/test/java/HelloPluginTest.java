//import static org.junit.Assert.assertTrue;
import org.gradle.api.Project;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.Test;

public class HelloPluginTest {
    @Test
    public void HelloPluginCheckTask() {
        Project project = ProjectBuilder.builder().build();
        project.getPluginManager().apply("hello-plugin");      
        System.out.println(project.getTasks().getByName("hello-plugin"));
        //assertTrue(project.getTasks().getByName("asciidoctor") instanceof GreetingTask);
    }
}