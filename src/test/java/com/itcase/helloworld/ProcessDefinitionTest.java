package java.com.itcase.helloworld;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;
import org.activiti.engine.ProcessEngines;
public class ProcessDefinitionTest {

    ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

    /**
     * 部署流程定义
     */
    @Test
    public void deploymentProcessDefinition() {
        processEngine.getRepositoryService()//与流程定义和部署对象相关的service
                        .createDeploymentQuery();//创建一个部署查询对象

    }
}
