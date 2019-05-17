"# quarkus-multimodule-test" 

Running quarkus:dev with a lot of entities throws org.objectweb.asm.MethodTooLargeException

> mvnw clean compile quarkus:dev  
```
ERROR [io.qua.dev.DevModeMain] Failed to start quarkus: java.lang.RuntimeException: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
        [error]: Build step io.quarkus.deployment.steps.MainClassBuildStep#build threw an exception: org.objectweb.asm.MethodTooLargeException: Method too large: io/quarkus/deployment/steps/HibernateOrmProcessor$build8.deploy (Lio/quarkus/runtime/StartupContext;)V
        at io.quarkus.runner.RuntimeRunner.run(RuntimeRunner.java:137)
        at io.quarkus.dev.DevModeMain.doStart(DevModeMain.java:159)
        at io.quarkus.dev.DevModeMain.main(DevModeMain.java:93)
Caused by: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
        [error]: Build step io.quarkus.deployment.steps.MainClassBuildStep#build threw an exception: org.objectweb.asm.MethodTooLargeException: Method too large: io/quarkus/deployment/steps/HibernateOrmProcessor$build8.deploy (Lio/quarkus/runtime/StartupContext;)V
        at io.quarkus.builder.Execution.run(Execution.java:124)
        at io.quarkus.builder.BuildExecutionBuilder.execute(BuildExecutionBuilder.java:137)
        at io.quarkus.deployment.QuarkusAugmentor.run(QuarkusAugmentor.java:108)
        at io.quarkus.runner.RuntimeRunner.run(RuntimeRunner.java:102)
        ... 2 more
Caused by: org.objectweb.asm.MethodTooLargeException: Method too large: io/quarkus/deployment/steps/HibernateOrmProcessor$build8.deploy (Lio/quarkus/runtime/StartupContext;)V
        at org.objectweb.asm.MethodWriter.computeMethodInfoSize(MethodWriter.java:2080)
        at org.objectweb.asm.ClassWriter.toByteArray(ClassWriter.java:459)
        at io.quarkus.gizmo.ClassCreator.close(ClassCreator.java:184)
        at io.quarkus.deployment.recording.BytecodeRecorderImpl.writeBytecode(BytecodeRecorderImpl.java:325)
        at io.quarkus.deployment.steps.MainClassBuildStep.build(MainClassBuildStep.java:117)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at io.quarkus.deployment.ExtensionLoader$1.execute(ExtensionLoader.java:507)
        at io.quarkus.builder.BuildContext.run(BuildContext.java:414)
        at org.jboss.threads.ContextClassLoaderSavingRunnable.run(ContextClassLoaderSavingRunnable.java:35)
        at org.jboss.threads.EnhancedQueueExecutor.safeRun(EnhancedQueueExecutor.java:2011)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.doRunTask(EnhancedQueueExecutor.java:1538)
        at org.jboss.threads.EnhancedQueueExecutor$ThreadBody.run(EnhancedQueueExecutor.java:1429)
        at java.lang.Thread.run(Thread.java:748)
        at org.jboss.threads.JBossThread.run(JBossThread.java:479)
```
