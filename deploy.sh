mvn -s ansible-settings.xml deploy:deploy-file \
        -Durl="{host_url}/nexus/content/repositories/ansible-snapshots" \
        -Dfile=ansible-demo-spring-boot-0.0.1-SNAPSHOT.jar \
        -DgroupId=com.ansible.spring.boot \
        -DartifactId=ansible-demo-spring-boot \
        -Dversion=0.0.1-SNAPSHOT \
        -DrepositoryId=ansible-nexus
