package zerobase.weatherdiary.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("날씨 일기 프로젝트 :")
            .description("날씨 일기를 CRUD 할 수 있는 백엔드 API 입니다")
            .version("2.0"));
  }

  @Bean
  public GroupedOpenApi publicApi() {
    return GroupedOpenApi.builder()
        .group("default")
        .pathsToMatch("/**")
        .packagesToScan("zerobase.weather")
        .build();
  }
}
