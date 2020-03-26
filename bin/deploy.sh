cd ..

cd myshop-dependencies
mvn clean deploy -Dmaven.test.skip=true
cd ..

cd myshop-config
mvn clean package -Dmaven.test.skip=true
cd ..

cd myshop-eureka
mvn clean package -Dmaven.test.skip=true
cd ..

cd myshop-zipkin
mvn clean package -Dmaven.test.skip=true
cd ..

cd myshop-admin
mvn clean package -Dmaven.test.skip=true
cd ..

cd myshop-service-admin
mvn clean package -Dmaven.test.skip=true
cd ..

cd myshop-web-admin
mvn clean package -Dmaven.test.skip=true
cd ..