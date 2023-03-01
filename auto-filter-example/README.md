# AutoFilter Example

This is a sample project for the [AutoFilter](https://github.com/XiriusTech/auto-filter) library. For detailed documentation, please refer to that project.

This sample consists of a Spring Boot application that uses the main features of the library:
-@AutoFilter annotation
-@AutoFilterInclude annotation
-@AutoFilterExclude annotation
-Custom MultiFilter
-Custom SingleFilter with its corresponding QueryBuilder
-Use a filter generated with @AutoFilter as parameter of another @AutoFilter

## Execution

You can execute the application by compiling the project and running the ```AutoFilterApplication``` class. This will start a server running on localhost:8080 by default (you can configure the port if you want).
You can then try the interactive documentation in the **Tutorial** tab of the Swagger UI page, which you can access in a browser by going to http://localhost:8080/swagger-ui. 
You can also send queries directly (e.g. using Postman). This is a sample query: ```GET localhost:8080/api/v1/user?username.startLike=adm```
Finally, the demo uses the H2 database, which is an in-memory database. It is populated by executing the statements in **resources/data.sql**. You can modify that file if you want to test different data.

## 🚀 About Xirius Tech
Xirius Tech is a company based in Latin America dedicated to the creation of web applications aimed to automate the processes that the client request. To do this we employ traditional technologies like Java and Spring Boot, and mix them with cutting edge advancements in Machine Learning to achieve the best results.

Visit us at [Xirius Tech](https://xirius.tech/) or send us an email directly to tecnologia@xirius.tech.


## Authors

- [@XiriusTech](https://github.com/XiriusTech)
- [@camilonar](https://www.github.com/camilonar)


## License

[Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0)